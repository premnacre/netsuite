import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.netsuite.webservices.lists.relationships_2014_2.Customer;
import com.netsuite.webservices.platform.core_2014_2.Passport;
import com.netsuite.webservices.platform.core_2014_2.RecordRef;
import com.netsuite.webservices.platform.core_2014_2.StatusDetail;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.InsufficientPermissionFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidAccountFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidVersionFault;
import com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault;
import com.netsuite.webservices.platform.messages_2014_2.WriteResponse;
import com.netsuite.webservices.platform_2014_2.NetSuitePortType;
import com.netsuite.webservices.platform_2014_2.NetSuiteServiceLocator;


public class Test {

	/**
	 * @param args
	 * @throws ServiceException 
	 * @throws RemoteException 
	 * @throws InvalidAccountFault 
	 * @throws UnexpectedErrorFault 
	 * @throws ExceededRequestLimitFault 
	 * @throws InsufficientPermissionFault 
	 * @throws InvalidCredentialsFault 
	 * @throws InvalidVersionFault 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws ServiceException, InvalidVersionFault, InvalidCredentialsFault, InsufficientPermissionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidAccountFault, RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		NetSuiteServiceLocator service = new NetSuiteServiceLocator();
		service.setMaintainSession( true );
		URL url = new URL("https://webservices.na1.netsuite.com/services/NetSuitePort_2014_2");
		NetSuitePortType port = service.getNetSuitePort(url);
		Passport passport =new Passport();
		passport.setEmail( "Email address" );
		passport.setPassword( "Email password" );
		
		passport.setAccount( "Netsuite account" );
		StatusDetail[] status = port.login( passport ).getStatus();
		Customer cust = new Customer();
		cust.setEntityId( "XYZ 2Inc");
		cust.setCompanyName("XYZ Inc."); //
		RecordRef subsidiary = new RecordRef("HH Inc.", "3", null, null);
		cust.setSubsidiary(subsidiary);
	
		WriteResponse response = port.add( cust );
		port.logout();
	}

}
