package com.popcornapps.form.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.netsuite.webservices.lists.relationships_2014_2.Customer;
import com.netsuite.webservices.platform.core_2014_2.RecordRef;
import com.netsuite.webservices.platform.core_2014_2.types.RecordType;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault;
import com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault;
import com.netsuite.webservices.platform.messages_2014_2.ReadResponse;
import com.netsuite.webservices.platform.messages_2014_2.WriteResponse;
import com.netsuite.webservices.platform_2014_2.NetSuitePortType;

/**
 * Servlet implementation class GetCustomerData
 */
public class GetCustomerData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NetSuitePortType port;
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
			port = (NetSuitePortType) session.getAttribute("loginSuccess");
			String id = request.getParameter("id");
			RecordRef recordRef = new RecordRef();
			recordRef.setInternalId(id);
			recordRef.setType(RecordType.customer);
			String operation = request.getParameter("operation");
			RequestDispatcher rd = request.getRequestDispatcher("/Method.jsp");
			rd.include(request, response);
			out.println("<hr/>");
			if (operation.equals("search")) {
				ReadResponse readResponce = getData(recordRef);
				if (readResponce.getStatus().length > 0) {
					out.print("<br/><font color='red'>"
							+ readResponce.getStatus()[0].getMessage() + "</font>");
				} else {
					Customer customer = (Customer) readResponce.getRecord();
					GsonBuilder builder = new GsonBuilder();
					Gson gson = builder.create();
					out.println("<br/><br/>" + customer.toString());
					String json = gson.toJson(customer);
					out.println("<br/><font color='green'> Below is the JSON Data </font><br/><br/>"
									+ json);
				}
			} else {
				WriteResponse status = deleteCustomRecord(recordRef);
				if (status.getStatus().length > 0) {
					out.print("<br/><font color='red'>"
							+ status.getStatus()[0].getMessage() + "</font>");
				} else {
					out.print("customer Id: "
							+ ((RecordRef) status.getBaseRef()).getInternalId());
					out.println(" deleted successfully");
				}
			}
		out.print(" <div id='footer' align='center'> "
						+ "<p class='text-muted'>&#169; 2014 PopcornApps. All rights reserved</p>"
						+ "</div>");

	}

	public ReadResponse getData(RecordRef recordRef)
			throws ExceededRequestSizeFault, InvalidCredentialsFault,
			ExceededUsageLimitFault, ExceededRequestLimitFault,
			ExceededRecordCountFault, UnexpectedErrorFault,
			InvalidSessionFault, RemoteException {

		ReadResponse response = port.get(recordRef);

		return response;
	}

	public WriteResponse deleteCustomRecord(RecordRef recordRef)
			throws ExceededRequestSizeFault, InvalidCredentialsFault,
			ExceededUsageLimitFault, ExceededRequestLimitFault,
			ExceededRecordCountFault, UnexpectedErrorFault,
			InvalidSessionFault, RemoteException {
		/*
		 * CustomRecordRef customRecordRef = new CustomRecordRef();
		 * customRecordRef.setTypeId("-2"); customRecordRef.setInternalId(id);
		 */
		WriteResponse status = port.delete(recordRef);
		return status;
	}
}
