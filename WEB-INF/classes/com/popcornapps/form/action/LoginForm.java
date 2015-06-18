package com.popcornapps.form.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import com.netsuite.webservices.platform.core_2014_2.Passport;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.InsufficientPermissionFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidAccountFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidVersionFault;
import com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault;
import com.netsuite.webservices.platform.messages_2014_2.SessionResponse;
import com.netsuite.webservices.platform_2014_2.NetSuitePortType;
import com.netsuite.webservices.platform_2014_2.NetSuiteServiceLocator;
import com.popcornapps.pojo.Login;

public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NetSuitePortType port;

	public LoginForm() {
		try {
			NetSuiteServiceLocator service = new NetSuiteServiceLocator();
			service.setMaintainSession(true);
			URL url = new URL(
					"https://webservices.na1.netsuite.com/services/NetSuitePort_2014_2");
			port = service.getNetSuitePort(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			String operation = request.getParameter("operation");
			if (operation.equals("logout")) {
				SessionResponse sResponse = LogoutAction();
				HttpSession session = request.getSession();
				session.setAttribute("loginSuccess", port);
				RequestDispatcher rd = request
						.getRequestDispatcher("/login.jsp?operation=1");
				rd.include(request, response);
				if (sResponse.getStatus().length > 0) {
					out.print("<h3 align='center'><font color='red'>"
							+ sResponse.getStatus()[0].getMessage()
							+ "</font></h3>");
				} else {
					out
							.print("<h3 align='center'><font color='green'>Successfully logout</font></h3>");
				}
			} else {
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				String account = request.getParameter("account");
				Login login = new Login();
				login.setEmail(email);
				login.setPassword(password);
				login.setAccount(account);
				SessionResponse sResponse = LoginFormAction(login);
				String user = sResponse.getUserId().getName();
				out.print("<h4 align='right'><font color='green'>Welcome  "
						+ user + "</font></h4>");
				HttpSession session = request.getSession();
				session.setAttribute("loginSuccess", port);
				RequestDispatcher rd = request
						.getRequestDispatcher("/Method.jsp");
				rd.include(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
			HttpSession session = request.getSession();
			session.setAttribute("user", null);
			out.print("<style>#footer {	width:100%;	height:80px;	position:fixed;	bottom:0;	left:0;	background:#ee5;</style>");
			out.print("<h3 align='center'>This is simple application for CRUD Operation</h3>"
							+ "<h5 align='right' style='width: 1000px' >Webservice Connectivity with Java and Netsuite...</h5>"
							+ "<div align='center'>");
			out.print("<font color='red'>connection has timed out</font><br/>");
			out.print("<a href='login.jsp'>Login Again!!!</a>");
		}
		out.print(" <div id='footer' align='center'> "
						+ "<p class='text-muted'>&#169; 2014 PopcornApps. All rights reserved</p>"
						+ "</div>");
	}

	public SessionResponse LoginFormAction(Login login)
			throws ServiceException, MalformedURLException,
			InvalidVersionFault, InvalidCredentialsFault,
			InsufficientPermissionFault, ExceededRequestLimitFault,
			UnexpectedErrorFault, InvalidAccountFault, RemoteException {

		Passport passport = new Passport();
		passport.setEmail(login.getEmail());
		passport.setPassword(login.getPassword());
		passport.setAccount(login.getAccount());
		SessionResponse sResponse = port.login(passport);
		return sResponse;
	}

	public SessionResponse LogoutAction() throws ExceededRequestLimitFault,
			UnexpectedErrorFault, InvalidSessionFault, RemoteException {
		SessionResponse sResponse = port.logout();
		return sResponse;
	}
}
