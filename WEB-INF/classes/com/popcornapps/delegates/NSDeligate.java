package com.popcornapps.delegates;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import org.apache.axis.session.Session;

import com.netsuite.webservices.lists.relationships_2014_2.Customer;
import com.netsuite.webservices.lists.relationships_2014_2.CustomerSearch;
import com.netsuite.webservices.platform.common_2014_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.core_2014_2.Passport;
import com.netsuite.webservices.platform.core_2014_2.Record;
import com.netsuite.webservices.platform.core_2014_2.SearchResult;
import com.netsuite.webservices.platform.core_2014_2.SearchStringField;
import com.netsuite.webservices.platform.core_2014_2.types.SearchStringFieldOperator;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault;
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


public class NSDeligate {
	NetSuitePortType port;
	
	public NSDeligate() {
		try {
			NetSuiteServiceLocator service = new NetSuiteServiceLocator();
			service.setMaintainSession(true);
			URL url = new URL("https://webservices.na1.netsuite.com/services/NetSuitePort_2014_2");
			port = service.getNetSuitePort(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	public SessionResponse LoginFormAction(Login login) throws ServiceException, MalformedURLException, InvalidVersionFault, InvalidCredentialsFault, InsufficientPermissionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidAccountFault, RemoteException {
		
		Passport passport = new Passport();
		passport.setEmail(login.getEmail());
		passport.setPassword(login.getPassword());
		passport.setAccount(login.getAccount());
		SessionResponse sResponse=port.login(passport);
		System.out.println("login successfully"+sResponse.getUserId().getName());
		return sResponse;
	}
	public Customer[] SearchData(String name) throws ExceededRequestSizeFault, InvalidCredentialsFault, ExceededUsageLimitFault, ExceededRequestLimitFault, ExceededRecordCountFault, UnexpectedErrorFault, InvalidSessionFault, RemoteException {
		CustomerSearch custSearch = new CustomerSearch();
		CustomerSearchBasic custSearchBasic = new CustomerSearchBasic();
		SearchStringField entityId  = new SearchStringField();
		entityId.setOperator(SearchStringFieldOperator.contains);
		entityId.setSearchValue(name);
		custSearchBasic.setEntityId(entityId);
		custSearch.setBasic(custSearchBasic);
		// Set page size for number of records to be returned in search
		// response

		// Invoke search() web services operation
		SearchResult result = port.search(custSearch);
		System.out.println(result.getTotalRecords());
		System.out.println(result.getSearchId());
		Record[] record=result.getRecordList();
		return (Customer[])record;
	}
}
