package com.netsuite.webservices.platform_2014_2;

public class NetSuitePortTypeProxy implements com.netsuite.webservices.platform_2014_2.NetSuitePortType {
  private String _endpoint = null;
  private com.netsuite.webservices.platform_2014_2.NetSuitePortType netSuitePortType = null;
  
  public NetSuitePortTypeProxy() {
    _initNetSuitePortTypeProxy();
  }
  
  public NetSuitePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initNetSuitePortTypeProxy();
  }
  
  private void _initNetSuitePortTypeProxy() {
    try {
      netSuitePortType = (new com.netsuite.webservices.platform_2014_2.NetSuiteServiceLocator()).getNetSuitePort();
      if (netSuitePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)netSuitePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)netSuitePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (netSuitePortType != null)
      ((javax.xml.rpc.Stub)netSuitePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.netsuite.webservices.platform_2014_2.NetSuitePortType getNetSuitePortType() {
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType;
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.SessionResponse login(com.netsuite.webservices.platform.core_2014_2.Passport passport) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidAccountFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.login(passport);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.SessionResponse ssoLogin(com.netsuite.webservices.platform.core_2014_2.SsoPassport ssoPassport) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidAccountFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.ssoLogin(ssoPassport);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.SessionResponse mapSso(com.netsuite.webservices.platform.core_2014_2.SsoCredentials ssoCredentials) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidAccountFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.mapSso(ssoCredentials);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.SessionResponse changePassword(com.netsuite.webservices.platform.core_2014_2.ChangePassword changePassword) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidAccountFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.changePassword(changePassword);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.SessionResponse changeEmail(com.netsuite.webservices.platform.core_2014_2.ChangeEmail changeEmail) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.InvalidVersionFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidAccountFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.changeEmail(changeEmail);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.SessionResponse logout() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.logout();
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponse add(com.netsuite.webservices.platform.core_2014_2.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.add(record);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponse delete(com.netsuite.webservices.platform.core_2014_2.BaseRef baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.delete(baseRef);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.SearchResult search(com.netsuite.webservices.platform.core_2014_2.SearchRecord searchRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.search(searchRecord);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.SearchResult searchMore(int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.searchMore(pageIndex);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.SearchResult searchMoreWithId(java.lang.String searchId, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.searchMoreWithId(searchId, pageIndex);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.SearchResult searchNext() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.searchNext();
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponse update(com.netsuite.webservices.platform.core_2014_2.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.update(record);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponse upsert(com.netsuite.webservices.platform.core_2014_2.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.upsert(record);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponseList addList(com.netsuite.webservices.platform.core_2014_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.addList(record);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponseList deleteList(com.netsuite.webservices.platform.core_2014_2.BaseRef[] baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.deleteList(baseRef);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponseList updateList(com.netsuite.webservices.platform.core_2014_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.updateList(record);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponseList upsertList(com.netsuite.webservices.platform.core_2014_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.upsertList(record);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.ReadResponse get(com.netsuite.webservices.platform.core_2014_2.BaseRef baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.get(baseRef);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.ReadResponseList getList(com.netsuite.webservices.platform.core_2014_2.BaseRef[] baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getList(baseRef);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetAllResult getAll(com.netsuite.webservices.platform.core_2014_2.GetAllRecord record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getAll(record);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetSavedSearchResult getSavedSearch(com.netsuite.webservices.platform.core_2014_2.GetSavedSearchRecord record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getSavedSearch(record);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetCustomizationIdResult getCustomizationId(com.netsuite.webservices.platform.core_2014_2.CustomizationType customizationType, boolean includeInactives) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getCustomizationId(customizationType, includeInactives);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.ReadResponse initialize(com.netsuite.webservices.platform.core_2014_2.InitializeRecord initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.initialize(initializeRecord);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.ReadResponseList initializeList(com.netsuite.webservices.platform.core_2014_2.InitializeRecord[] initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.initializeList(initializeRecord);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetSelectValueResult getSelectValue(com.netsuite.webservices.platform.core_2014_2.GetSelectValueFieldDescription fieldDescription, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getSelectValue(fieldDescription, pageIndex);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetItemAvailabilityResult getItemAvailability(com.netsuite.webservices.platform.core_2014_2.ItemAvailabilityFilter itemAvailabilityFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getItemAvailability(itemAvailabilityFilter);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetBudgetExchangeRateResult getBudgetExchangeRate(com.netsuite.webservices.platform.core_2014_2.BudgetExchangeRateFilter budgetExchangeRateFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getBudgetExchangeRate(budgetExchangeRateFilter);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetConsolidatedExchangeRateResult getConsolidatedExchangeRate(com.netsuite.webservices.platform.core_2014_2.ConsolidatedExchangeRateFilter consolidatedExchangeRateFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getConsolidatedExchangeRate(consolidatedExchangeRateFilter);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetCurrencyRateResult getCurrencyRate(com.netsuite.webservices.platform.core_2014_2.CurrencyRateFilter currencyRateFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getCurrencyRate(currencyRateFilter);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetDataCenterUrlsResult getDataCenterUrls(java.lang.String account) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getDataCenterUrls(account);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetPostingTransactionSummaryResult getPostingTransactionSummary(com.netsuite.webservices.platform.core_2014_2.PostingTransactionSummaryField fields, com.netsuite.webservices.platform.core_2014_2.PostingTransactionSummaryFilter filters, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getPostingTransactionSummary(fields, filters, pageIndex);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetServerTimeResult getServerTime() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getServerTime();
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponse attach(com.netsuite.webservices.platform.core_2014_2.AttachReference attachReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.attach(attachReference);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponse detach(com.netsuite.webservices.platform.core_2014_2.DetachReference detachReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.detach(detachReference);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponse updateInviteeStatus(com.netsuite.webservices.platform.core_2014_2.UpdateInviteeStatusReference updateInviteeStatusReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.updateInviteeStatus(updateInviteeStatusReference);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.WriteResponseList updateInviteeStatusList(com.netsuite.webservices.platform.core_2014_2.UpdateInviteeStatusReference[] updateInviteeStatusReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.updateInviteeStatusList(updateInviteeStatusReference);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult asyncAddList(com.netsuite.webservices.platform.core_2014_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.asyncAddList(record);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult asyncUpdateList(com.netsuite.webservices.platform.core_2014_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.asyncUpdateList(record);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult asyncUpsertList(com.netsuite.webservices.platform.core_2014_2.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.asyncUpsertList(record);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult asyncDeleteList(com.netsuite.webservices.platform.core_2014_2.BaseRef[] baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.asyncDeleteList(baseRef);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult asyncGetList(com.netsuite.webservices.platform.core_2014_2.BaseRef[] baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.asyncGetList(baseRef);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult asyncInitializeList(com.netsuite.webservices.platform.core_2014_2.InitializeRecord[] initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.asyncInitializeList(initializeRecord);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult asyncSearch(com.netsuite.webservices.platform.core_2014_2.SearchRecord searchRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.asyncSearch(searchRecord);
  }
  
  public com.netsuite.webservices.platform.messages_2014_2.AsyncResult getAsyncResult(java.lang.String jobId, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault, com.netsuite.webservices.platform.faults_2014_2.AsyncFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getAsyncResult(jobId, pageIndex);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult checkAsyncStatus(java.lang.String jobId) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault, com.netsuite.webservices.platform.faults_2014_2.AsyncFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.checkAsyncStatus(jobId);
  }
  
  public com.netsuite.webservices.platform.core_2014_2.GetDeletedResult getDeleted(com.netsuite.webservices.platform.core_2014_2.GetDeletedFilter getDeletedFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault{
    if (netSuitePortType == null)
      _initNetSuitePortTypeProxy();
    return netSuitePortType.getDeleted(getDeletedFilter);
  }
  
  
}