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
import com.netsuite.webservices.lists.relationships_2014_2.CustomerSearch;
import com.netsuite.webservices.platform.common_2014_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.core_2014_2.Record;
import com.netsuite.webservices.platform.core_2014_2.SearchResult;
import com.netsuite.webservices.platform.core_2014_2.SearchStringField;
import com.netsuite.webservices.platform.core_2014_2.types.SearchStringFieldOperator;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault;
import com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault;
import com.netsuite.webservices.platform_2014_2.NetSuitePortType;

/**
 * Servlet implementation class SearchForm
 */
public class SearchForm extends HttpServlet {
	NetSuitePortType port;
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		port = (NetSuitePortType) session.getAttribute("loginSuccess");
		try {
			RequestDispatcher rd = request.getRequestDispatcher("/Method.jsp");
			rd.include(request, response);

			String searchData = request.getParameter("searchData");

			SearchResult result = SearchData(searchData);
			out.println("Total Record: " + result.getTotalRecords());
			out.println("<br/> <table border='1'><tr><td>SNo.</td><td align='center'>Customer Information: </td></tr>");
			Record[] record = result.getRecordList();
			if (result.getTotalRecords() < 1) {
				out.print("<tr><td colspan='2' align='center'> <font color='green'>No Record Found... </font></td></tr>");
			} else {
				for (int i = 0; i < record.length; i++) {
					Customer customer = (Customer) record[i];
					out.print("<tr><td>" + (i + 1) + "</td><td>"
							+ customer.toString() + "</td></tr>");
				}
			}
			out.print("</table>");
			out.print(" <div id='footer' align='center'> "
							+ "<p class='text-muted'>&#169; 2014 PopcornApps. All rights reserved</p>"
							+ "</div>");

		} catch (Exception e) {
			out.print("<div align='center'>");
			out.print("<br/><font color='red'>connection has timed out</font><br/></div>");
		}
		
		out.print(" <div id='footer' align='center'> "
						+ "<p class='text-muted'>&#169; 2014 PopcornApps. All rights reserved</p>"
						+ "</div>");
	}

	public SearchResult SearchData(String searchData)
			throws ExceededRequestSizeFault, InvalidCredentialsFault,
			ExceededUsageLimitFault, ExceededRequestLimitFault,
			ExceededRecordCountFault, UnexpectedErrorFault,
			InvalidSessionFault, RemoteException {
		CustomerSearch custSearch = new CustomerSearch();
		CustomerSearchBasic custSearchBasic = new CustomerSearchBasic();
		SearchStringField entityId = new SearchStringField();
		entityId.setOperator(SearchStringFieldOperator.contains);
		entityId.setSearchValue(searchData);
		custSearchBasic.setEntityId(entityId);
		custSearch.setBasic(custSearchBasic);
		SearchResult result = port.search(custSearch);
		return result;
	}

}
