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
import com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault;
import com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault;
import com.netsuite.webservices.platform.messages_2014_2.WriteResponse;
import com.netsuite.webservices.platform_2014_2.NetSuitePortType;

/**
 * Servlet implementation class AddCustomerForm
 */
public class AddCustomerForm extends HttpServlet {
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
		Customer customer = new Customer();
		String operation = request.getParameter("operation");
		String entityId = request.getParameter("entityId");
		String internalId = request.getParameter("entityId");
		String companyName = request.getParameter("companyName");
		String email = request.getParameter("email");
		String mobilePhone = request.getParameter("mobilePhone");
		
		String json = request.getParameter("custData");
		customer  =gson.fromJson(json, Customer.class);
		String message=null;
		if(customer==null){
			  message="json format is not proper";
		      customer=new Customer();
		}
		if (customer.getCompanyName()==null) {
			customer.setCompanyName(companyName);
		}
		if (customer.getEmail()==null) {
			customer.setEmail(email);
		}
		if (customer.getPhone()==null) {
			customer.setPhone(mobilePhone);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/Method.jsp");
		rd.include(request, response);
		out.println("<hr/>");
		WriteResponse status = null;
		if (operation.equals("addData")) {
			if(customer.getSubsidiary()==null){
				RecordRef subsidiary = new RecordRef("HH Inc.", "3", null, null);
				customer.setSubsidiary(subsidiary);
			}
			if (customer.getEntityId()==null) {
				customer.setEntityId(entityId);
			}
			status = addRecord(customer);
			if (status.getStatus().length > 0) {
				out.print("<br/><font color='red'>  Missing :"
						+ status.getStatus()[0].getMessage() + " or "+message+"</font>");
			} else {
				out.print("customer Id: "
						+ ((RecordRef) status.getBaseRef()).getInternalId());
				out.println(" Added successfully");
			}
		} else {
			if (customer.getInternalId()==null) {
				customer.setInternalId(internalId);
			}
			status = updateRecord(customer);

			if (status.getStatus().length > 0) {
				out.print("<br/><font color='red'>"
						+ status.getStatus()[0].getMessage() + "</font>");
			} else {
				out.print("customer Id: "
						+ ((RecordRef) status.getBaseRef()).getInternalId());
				out.println(" Updated successfully");
			}
		}
		out.print(" <div id='footer' align='center'> "+
				  "<p class='text-muted'>&#169; 2014 PopcornApps. All rights reserved</p>"+
				  "</div>");
	}

	public WriteResponse addRecord(Customer customer)
			throws ExceededRequestSizeFault, InvalidCredentialsFault,
			ExceededUsageLimitFault, ExceededRequestLimitFault,
			ExceededRecordCountFault, UnexpectedErrorFault,
			InvalidSessionFault, RemoteException {
		System.out.println("adding...");
		WriteResponse response = port.add(customer);
		return response;
	}

	public WriteResponse updateRecord(Customer customer)
			throws ExceededRequestSizeFault, InvalidCredentialsFault,
			ExceededUsageLimitFault, ExceededRequestLimitFault,
			ExceededRecordCountFault, UnexpectedErrorFault,
			InvalidSessionFault, RemoteException {
		System.out.println("updating...");
		WriteResponse response = port.update(customer);
		return response;
	}

}
