<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleNetSuitePortTypeProxyid" scope="session" class="com.netsuite.webservices.platform_2014_2.NetSuitePortTypeProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleNetSuitePortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleNetSuitePortTypeProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleNetSuitePortTypeProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.netsuite.webservices.platform_2014_2.NetSuitePortType getNetSuitePortType10mtemp = sampleNetSuitePortTypeProxyid.getNetSuitePortType();
if(getNetSuitePortType10mtemp == null){
%>
<%=getNetSuitePortType10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 19:
        gotMethod = true;
        String password_2id=  request.getParameter("password34");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        String email_3id=  request.getParameter("email36");
            java.lang.String email_3idTemp = null;
        if(!email_3id.equals("")){
         email_3idTemp  = email_3id;
        }
        String account_4id=  request.getParameter("account38");
            java.lang.String account_4idTemp = null;
        if(!account_4id.equals("")){
         account_4idTemp  = account_4id;
        }
        String internalId_6id=  request.getParameter("internalId42");
            java.lang.String internalId_6idTemp = null;
        if(!internalId_6id.equals("")){
         internalId_6idTemp  = internalId_6id;
        }
        String externalId_7id=  request.getParameter("externalId44");
            java.lang.String externalId_7idTemp = null;
        if(!externalId_7id.equals("")){
         externalId_7idTemp  = externalId_7id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_5id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_5id.setInternalId(internalId_6idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_5id.setExternalId(externalId_7idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21Passport_1id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.Passport" />
        <%
        com1netsuite1webservices1platform1core_2014_21Passport_1id.setPassword(password_2idTemp);
        com1netsuite1webservices1platform1core_2014_21Passport_1id.setEmail(email_3idTemp);
        com1netsuite1webservices1platform1core_2014_21Passport_1id.setAccount(account_4idTemp);
        com1netsuite1webservices1platform1core_2014_21Passport_1id.setRole(com1netsuite1webservices1platform1core_2014_21RecordRef_5id);
        com.netsuite.webservices.platform.messages_2014_2.SessionResponse login19mtemp = sampleNetSuitePortTypeProxyid.login(com1netsuite1webservices1platform1core_2014_21Passport_1id);
if(login19mtemp == null){
%>
<%=login19mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(login19mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus22 = login19mtemp.getStatus();
        String tempstatus22 = null;
        if(typestatus22 != null){
        java.util.List liststatus22= java.util.Arrays.asList(typestatus22);
        tempstatus22 = liststatus22.toString();
        }
        %>
        <%=tempstatus22%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wsRoleList:</TD>
<TD>
<%
if(login19mtemp != null){
com.netsuite.webservices.platform.core_2014_2.WsRole[] typewsRoleList24 = login19mtemp.getWsRoleList();
        String tempwsRoleList24 = null;
        if(typewsRoleList24 != null){
        java.util.List listwsRoleList24= java.util.Arrays.asList(typewsRoleList24);
        tempwsRoleList24 = listwsRoleList24.toString();
        }
        %>
        <%=tempwsRoleList24%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userId:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">internalId:</TD>
<TD>
<%
if(login19mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=login19mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeinternalId28 = tebece0.getInternalId();
        String tempResultinternalId28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternalId28));
        %>
        <%= tempResultinternalId28 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">externalId:</TD>
<TD>
<%
if(login19mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=login19mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeexternalId30 = tebece0.getExternalId();
        String tempResultexternalId30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalId30));
        %>
        <%= tempResultexternalId30 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 46:
        gotMethod = true;
        String authenticationToken_9id=  request.getParameter("authenticationToken61");
            java.lang.String authenticationToken_9idTemp = null;
        if(!authenticationToken_9id.equals("")){
         authenticationToken_9idTemp  = authenticationToken_9id;
        }
        String partnerAccount_10id=  request.getParameter("partnerAccount63");
            java.lang.String partnerAccount_10idTemp = null;
        if(!partnerAccount_10id.equals("")){
         partnerAccount_10idTemp  = partnerAccount_10id;
        }
        String partnerId_11id=  request.getParameter("partnerId65");
            java.lang.String partnerId_11idTemp = null;
        if(!partnerId_11id.equals("")){
         partnerId_11idTemp  = partnerId_11id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21SsoPassport_8id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.SsoPassport" />
        <%
        com1netsuite1webservices1platform1core_2014_21SsoPassport_8id.setAuthenticationToken(authenticationToken_9idTemp);
        com1netsuite1webservices1platform1core_2014_21SsoPassport_8id.setPartnerAccount(partnerAccount_10idTemp);
        com1netsuite1webservices1platform1core_2014_21SsoPassport_8id.setPartnerId(partnerId_11idTemp);
        com.netsuite.webservices.platform.messages_2014_2.SessionResponse ssoLogin46mtemp = sampleNetSuitePortTypeProxyid.ssoLogin(com1netsuite1webservices1platform1core_2014_21SsoPassport_8id);
if(ssoLogin46mtemp == null){
%>
<%=ssoLogin46mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(ssoLogin46mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus49 = ssoLogin46mtemp.getStatus();
        String tempstatus49 = null;
        if(typestatus49 != null){
        java.util.List liststatus49= java.util.Arrays.asList(typestatus49);
        tempstatus49 = liststatus49.toString();
        }
        %>
        <%=tempstatus49%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wsRoleList:</TD>
<TD>
<%
if(ssoLogin46mtemp != null){
com.netsuite.webservices.platform.core_2014_2.WsRole[] typewsRoleList51 = ssoLogin46mtemp.getWsRoleList();
        String tempwsRoleList51 = null;
        if(typewsRoleList51 != null){
        java.util.List listwsRoleList51= java.util.Arrays.asList(typewsRoleList51);
        tempwsRoleList51 = listwsRoleList51.toString();
        }
        %>
        <%=tempwsRoleList51%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userId:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">internalId:</TD>
<TD>
<%
if(ssoLogin46mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=ssoLogin46mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeinternalId55 = tebece0.getInternalId();
        String tempResultinternalId55 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternalId55));
        %>
        <%= tempResultinternalId55 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">externalId:</TD>
<TD>
<%
if(ssoLogin46mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=ssoLogin46mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeexternalId57 = tebece0.getExternalId();
        String tempResultexternalId57 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalId57));
        %>
        <%= tempResultexternalId57 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 67:
        gotMethod = true;
        String password_13id=  request.getParameter("password82");
            java.lang.String password_13idTemp = null;
        if(!password_13id.equals("")){
         password_13idTemp  = password_13id;
        }
        String email_14id=  request.getParameter("email84");
            java.lang.String email_14idTemp = null;
        if(!email_14id.equals("")){
         email_14idTemp  = email_14id;
        }
        String authenticationToken_15id=  request.getParameter("authenticationToken86");
            java.lang.String authenticationToken_15idTemp = null;
        if(!authenticationToken_15id.equals("")){
         authenticationToken_15idTemp  = authenticationToken_15id;
        }
        String account_16id=  request.getParameter("account88");
            java.lang.String account_16idTemp = null;
        if(!account_16id.equals("")){
         account_16idTemp  = account_16id;
        }
        String partnerId_17id=  request.getParameter("partnerId90");
            java.lang.String partnerId_17idTemp = null;
        if(!partnerId_17id.equals("")){
         partnerId_17idTemp  = partnerId_17id;
        }
        String internalId_19id=  request.getParameter("internalId94");
            java.lang.String internalId_19idTemp = null;
        if(!internalId_19id.equals("")){
         internalId_19idTemp  = internalId_19id;
        }
        String externalId_20id=  request.getParameter("externalId96");
            java.lang.String externalId_20idTemp = null;
        if(!externalId_20id.equals("")){
         externalId_20idTemp  = externalId_20id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_18id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_18id.setInternalId(internalId_19idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_18id.setExternalId(externalId_20idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21SsoCredentials_12id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.SsoCredentials" />
        <%
        com1netsuite1webservices1platform1core_2014_21SsoCredentials_12id.setPassword(password_13idTemp);
        com1netsuite1webservices1platform1core_2014_21SsoCredentials_12id.setEmail(email_14idTemp);
        com1netsuite1webservices1platform1core_2014_21SsoCredentials_12id.setAuthenticationToken(authenticationToken_15idTemp);
        com1netsuite1webservices1platform1core_2014_21SsoCredentials_12id.setAccount(account_16idTemp);
        com1netsuite1webservices1platform1core_2014_21SsoCredentials_12id.setPartnerId(partnerId_17idTemp);
        com1netsuite1webservices1platform1core_2014_21SsoCredentials_12id.setRole(com1netsuite1webservices1platform1core_2014_21RecordRef_18id);
        com.netsuite.webservices.platform.messages_2014_2.SessionResponse mapSso67mtemp = sampleNetSuitePortTypeProxyid.mapSso(com1netsuite1webservices1platform1core_2014_21SsoCredentials_12id);
if(mapSso67mtemp == null){
%>
<%=mapSso67mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(mapSso67mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus70 = mapSso67mtemp.getStatus();
        String tempstatus70 = null;
        if(typestatus70 != null){
        java.util.List liststatus70= java.util.Arrays.asList(typestatus70);
        tempstatus70 = liststatus70.toString();
        }
        %>
        <%=tempstatus70%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wsRoleList:</TD>
<TD>
<%
if(mapSso67mtemp != null){
com.netsuite.webservices.platform.core_2014_2.WsRole[] typewsRoleList72 = mapSso67mtemp.getWsRoleList();
        String tempwsRoleList72 = null;
        if(typewsRoleList72 != null){
        java.util.List listwsRoleList72= java.util.Arrays.asList(typewsRoleList72);
        tempwsRoleList72 = listwsRoleList72.toString();
        }
        %>
        <%=tempwsRoleList72%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userId:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">internalId:</TD>
<TD>
<%
if(mapSso67mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=mapSso67mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeinternalId76 = tebece0.getInternalId();
        String tempResultinternalId76 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternalId76));
        %>
        <%= tempResultinternalId76 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">externalId:</TD>
<TD>
<%
if(mapSso67mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=mapSso67mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeexternalId78 = tebece0.getExternalId();
        String tempResultexternalId78 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalId78));
        %>
        <%= tempResultexternalId78 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 98:
        gotMethod = true;
        String justThisAccount_22id=  request.getParameter("justThisAccount113");
            java.lang.Boolean justThisAccount_22idTemp = null;
        if(!justThisAccount_22id.equals("")){
         justThisAccount_22idTemp  = java.lang.Boolean.valueOf(justThisAccount_22id);
        }
        String newPassword2_23id=  request.getParameter("newPassword2115");
            java.lang.String newPassword2_23idTemp = null;
        if(!newPassword2_23id.equals("")){
         newPassword2_23idTemp  = newPassword2_23id;
        }
        String newPassword_24id=  request.getParameter("newPassword117");
            java.lang.String newPassword_24idTemp = null;
        if(!newPassword_24id.equals("")){
         newPassword_24idTemp  = newPassword_24id;
        }
        String currentPassword_25id=  request.getParameter("currentPassword119");
            java.lang.String currentPassword_25idTemp = null;
        if(!currentPassword_25id.equals("")){
         currentPassword_25idTemp  = currentPassword_25id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21ChangePassword_21id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.ChangePassword" />
        <%
        com1netsuite1webservices1platform1core_2014_21ChangePassword_21id.setJustThisAccount(justThisAccount_22idTemp);
        com1netsuite1webservices1platform1core_2014_21ChangePassword_21id.setNewPassword2(newPassword2_23idTemp);
        com1netsuite1webservices1platform1core_2014_21ChangePassword_21id.setNewPassword(newPassword_24idTemp);
        com1netsuite1webservices1platform1core_2014_21ChangePassword_21id.setCurrentPassword(currentPassword_25idTemp);
        com.netsuite.webservices.platform.messages_2014_2.SessionResponse changePassword98mtemp = sampleNetSuitePortTypeProxyid.changePassword(com1netsuite1webservices1platform1core_2014_21ChangePassword_21id);
if(changePassword98mtemp == null){
%>
<%=changePassword98mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(changePassword98mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus101 = changePassword98mtemp.getStatus();
        String tempstatus101 = null;
        if(typestatus101 != null){
        java.util.List liststatus101= java.util.Arrays.asList(typestatus101);
        tempstatus101 = liststatus101.toString();
        }
        %>
        <%=tempstatus101%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wsRoleList:</TD>
<TD>
<%
if(changePassword98mtemp != null){
com.netsuite.webservices.platform.core_2014_2.WsRole[] typewsRoleList103 = changePassword98mtemp.getWsRoleList();
        String tempwsRoleList103 = null;
        if(typewsRoleList103 != null){
        java.util.List listwsRoleList103= java.util.Arrays.asList(typewsRoleList103);
        tempwsRoleList103 = listwsRoleList103.toString();
        }
        %>
        <%=tempwsRoleList103%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userId:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">internalId:</TD>
<TD>
<%
if(changePassword98mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=changePassword98mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeinternalId107 = tebece0.getInternalId();
        String tempResultinternalId107 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternalId107));
        %>
        <%= tempResultinternalId107 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">externalId:</TD>
<TD>
<%
if(changePassword98mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=changePassword98mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeexternalId109 = tebece0.getExternalId();
        String tempResultexternalId109 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalId109));
        %>
        <%= tempResultexternalId109 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 121:
        gotMethod = true;
        String justThisAccount_27id=  request.getParameter("justThisAccount136");
            java.lang.Boolean justThisAccount_27idTemp = null;
        if(!justThisAccount_27id.equals("")){
         justThisAccount_27idTemp  = java.lang.Boolean.valueOf(justThisAccount_27id);
        }
        String newEmail_28id=  request.getParameter("newEmail138");
            java.lang.String newEmail_28idTemp = null;
        if(!newEmail_28id.equals("")){
         newEmail_28idTemp  = newEmail_28id;
        }
        String newEmail2_29id=  request.getParameter("newEmail2140");
            java.lang.String newEmail2_29idTemp = null;
        if(!newEmail2_29id.equals("")){
         newEmail2_29idTemp  = newEmail2_29id;
        }
        String currentPassword_30id=  request.getParameter("currentPassword142");
            java.lang.String currentPassword_30idTemp = null;
        if(!currentPassword_30id.equals("")){
         currentPassword_30idTemp  = currentPassword_30id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21ChangeEmail_26id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.ChangeEmail" />
        <%
        com1netsuite1webservices1platform1core_2014_21ChangeEmail_26id.setJustThisAccount(justThisAccount_27idTemp);
        com1netsuite1webservices1platform1core_2014_21ChangeEmail_26id.setNewEmail(newEmail_28idTemp);
        com1netsuite1webservices1platform1core_2014_21ChangeEmail_26id.setNewEmail2(newEmail2_29idTemp);
        com1netsuite1webservices1platform1core_2014_21ChangeEmail_26id.setCurrentPassword(currentPassword_30idTemp);
        com.netsuite.webservices.platform.messages_2014_2.SessionResponse changeEmail121mtemp = sampleNetSuitePortTypeProxyid.changeEmail(com1netsuite1webservices1platform1core_2014_21ChangeEmail_26id);
if(changeEmail121mtemp == null){
%>
<%=changeEmail121mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(changeEmail121mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus124 = changeEmail121mtemp.getStatus();
        String tempstatus124 = null;
        if(typestatus124 != null){
        java.util.List liststatus124= java.util.Arrays.asList(typestatus124);
        tempstatus124 = liststatus124.toString();
        }
        %>
        <%=tempstatus124%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wsRoleList:</TD>
<TD>
<%
if(changeEmail121mtemp != null){
com.netsuite.webservices.platform.core_2014_2.WsRole[] typewsRoleList126 = changeEmail121mtemp.getWsRoleList();
        String tempwsRoleList126 = null;
        if(typewsRoleList126 != null){
        java.util.List listwsRoleList126= java.util.Arrays.asList(typewsRoleList126);
        tempwsRoleList126 = listwsRoleList126.toString();
        }
        %>
        <%=tempwsRoleList126%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userId:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">internalId:</TD>
<TD>
<%
if(changeEmail121mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=changeEmail121mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeinternalId130 = tebece0.getInternalId();
        String tempResultinternalId130 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternalId130));
        %>
        <%= tempResultinternalId130 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">externalId:</TD>
<TD>
<%
if(changeEmail121mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=changeEmail121mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeexternalId132 = tebece0.getExternalId();
        String tempResultexternalId132 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalId132));
        %>
        <%= tempResultexternalId132 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 144:
        gotMethod = true;
        com.netsuite.webservices.platform.messages_2014_2.SessionResponse logout144mtemp = sampleNetSuitePortTypeProxyid.logout();
if(logout144mtemp == null){
%>
<%=logout144mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(logout144mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus147 = logout144mtemp.getStatus();
        String tempstatus147 = null;
        if(typestatus147 != null){
        java.util.List liststatus147= java.util.Arrays.asList(typestatus147);
        tempstatus147 = liststatus147.toString();
        }
        %>
        <%=tempstatus147%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wsRoleList:</TD>
<TD>
<%
if(logout144mtemp != null){
com.netsuite.webservices.platform.core_2014_2.WsRole[] typewsRoleList149 = logout144mtemp.getWsRoleList();
        String tempwsRoleList149 = null;
        if(typewsRoleList149 != null){
        java.util.List listwsRoleList149= java.util.Arrays.asList(typewsRoleList149);
        tempwsRoleList149 = listwsRoleList149.toString();
        }
        %>
        <%=tempwsRoleList149%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userId:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">internalId:</TD>
<TD>
<%
if(logout144mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=logout144mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeinternalId153 = tebece0.getInternalId();
        String tempResultinternalId153 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeinternalId153));
        %>
        <%= tempResultinternalId153 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">externalId:</TD>
<TD>
<%
if(logout144mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef tebece0=logout144mtemp.getUserId();
if(tebece0 != null){
java.lang.String typeexternalId155 = tebece0.getExternalId();
        String tempResultexternalId155 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexternalId155));
        %>
        <%= tempResultexternalId155 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 157:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.Record com1netsuite1webservices1platform1core_2014_21Record_31id = null;
        com.netsuite.webservices.platform.messages_2014_2.WriteResponse add157mtemp = sampleNetSuitePortTypeProxyid.add(com1netsuite1webservices1platform1core_2014_21Record_31id);
if(add157mtemp == null){
%>
<%=add157mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(add157mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus160 = add157mtemp.getStatus();
        String tempstatus160 = null;
        if(typestatus160 != null){
        java.util.List liststatus160= java.util.Arrays.asList(typestatus160);
        tempstatus160 = liststatus160.toString();
        }
        %>
        <%=tempstatus160%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">baseRef:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(add157mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BaseRef tebece0=add157mtemp.getBaseRef();
if(tebece0 != null){
java.lang.String typename164 = tebece0.getName();
        String tempResultname164 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename164));
        %>
        <%= tempResultname164 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 168:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.BaseRef com1netsuite1webservices1platform1core_2014_21BaseRef_32id = null;
        com.netsuite.webservices.platform.messages_2014_2.WriteResponse delete168mtemp = sampleNetSuitePortTypeProxyid.delete(com1netsuite1webservices1platform1core_2014_21BaseRef_32id);
if(delete168mtemp == null){
%>
<%=delete168mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(delete168mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus171 = delete168mtemp.getStatus();
        String tempstatus171 = null;
        if(typestatus171 != null){
        java.util.List liststatus171= java.util.Arrays.asList(typestatus171);
        tempstatus171 = liststatus171.toString();
        }
        %>
        <%=tempstatus171%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">baseRef:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(delete168mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BaseRef tebece0=delete168mtemp.getBaseRef();
if(tebece0 != null){
java.lang.String typename175 = tebece0.getName();
        String tempResultname175 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename175));
        %>
        <%= tempResultname175 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 179:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.SearchRecord com1netsuite1webservices1platform1core_2014_21SearchRecord_33id = null;
        com.netsuite.webservices.platform.core_2014_2.SearchResult search179mtemp = sampleNetSuitePortTypeProxyid.search(com1netsuite1webservices1platform1core_2014_21SearchRecord_33id);
if(search179mtemp == null){
%>
<%=search179mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">searchId:</TD>
<TD>
<%
if(search179mtemp != null){
java.lang.String typesearchId182 = search179mtemp.getSearchId();
        String tempResultsearchId182 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesearchId182));
        %>
        <%= tempResultsearchId182 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">searchRowList:</TD>
<TD>
<%
if(search179mtemp != null){
com.netsuite.webservices.platform.core_2014_2.SearchRow[] typesearchRowList184 = search179mtemp.getSearchRowList();
        String tempsearchRowList184 = null;
        if(typesearchRowList184 != null){
        java.util.List listsearchRowList184= java.util.Arrays.asList(typesearchRowList184);
        tempsearchRowList184 = listsearchRowList184.toString();
        }
        %>
        <%=tempsearchRowList184%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">recordList:</TD>
<TD>
<%
if(search179mtemp != null){
com.netsuite.webservices.platform.core_2014_2.Record[] typerecordList186 = search179mtemp.getRecordList();
        String temprecordList186 = null;
        if(typerecordList186 != null){
        java.util.List listrecordList186= java.util.Arrays.asList(typerecordList186);
        temprecordList186 = listrecordList186.toString();
        }
        %>
        <%=temprecordList186%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageIndex:</TD>
<TD>
<%
if(search179mtemp != null){
java.lang.Integer typepageIndex188 = search179mtemp.getPageIndex();
        String tempResultpageIndex188 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageIndex188));
        %>
        <%= tempResultpageIndex188 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(search179mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus190 = search179mtemp.getStatus();
        String tempstatus190 = null;
        if(typestatus190 != null){
        java.util.List liststatus190= java.util.Arrays.asList(typestatus190);
        tempstatus190 = liststatus190.toString();
        }
        %>
        <%=tempstatus190%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD>
<%
if(search179mtemp != null){
java.lang.Integer typetotalPages192 = search179mtemp.getTotalPages();
        String tempResulttotalPages192 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalPages192));
        %>
        <%= tempResulttotalPages192 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(search179mtemp != null){
java.lang.Integer typetotalRecords194 = search179mtemp.getTotalRecords();
        String tempResulttotalRecords194 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords194));
        %>
        <%= tempResulttotalRecords194 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageSize:</TD>
<TD>
<%
if(search179mtemp != null){
java.lang.Integer typepageSize196 = search179mtemp.getPageSize();
        String tempResultpageSize196 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageSize196));
        %>
        <%= tempResultpageSize196 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 200:
        gotMethod = true;
        String pageIndex_34id=  request.getParameter("pageIndex219");
        int pageIndex_34idTemp  = Integer.parseInt(pageIndex_34id);
        com.netsuite.webservices.platform.core_2014_2.SearchResult searchMore200mtemp = sampleNetSuitePortTypeProxyid.searchMore(pageIndex_34idTemp);
if(searchMore200mtemp == null){
%>
<%=searchMore200mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">searchId:</TD>
<TD>
<%
if(searchMore200mtemp != null){
java.lang.String typesearchId203 = searchMore200mtemp.getSearchId();
        String tempResultsearchId203 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesearchId203));
        %>
        <%= tempResultsearchId203 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">searchRowList:</TD>
<TD>
<%
if(searchMore200mtemp != null){
com.netsuite.webservices.platform.core_2014_2.SearchRow[] typesearchRowList205 = searchMore200mtemp.getSearchRowList();
        String tempsearchRowList205 = null;
        if(typesearchRowList205 != null){
        java.util.List listsearchRowList205= java.util.Arrays.asList(typesearchRowList205);
        tempsearchRowList205 = listsearchRowList205.toString();
        }
        %>
        <%=tempsearchRowList205%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">recordList:</TD>
<TD>
<%
if(searchMore200mtemp != null){
com.netsuite.webservices.platform.core_2014_2.Record[] typerecordList207 = searchMore200mtemp.getRecordList();
        String temprecordList207 = null;
        if(typerecordList207 != null){
        java.util.List listrecordList207= java.util.Arrays.asList(typerecordList207);
        temprecordList207 = listrecordList207.toString();
        }
        %>
        <%=temprecordList207%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageIndex:</TD>
<TD>
<%
if(searchMore200mtemp != null){
java.lang.Integer typepageIndex209 = searchMore200mtemp.getPageIndex();
        String tempResultpageIndex209 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageIndex209));
        %>
        <%= tempResultpageIndex209 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(searchMore200mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus211 = searchMore200mtemp.getStatus();
        String tempstatus211 = null;
        if(typestatus211 != null){
        java.util.List liststatus211= java.util.Arrays.asList(typestatus211);
        tempstatus211 = liststatus211.toString();
        }
        %>
        <%=tempstatus211%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD>
<%
if(searchMore200mtemp != null){
java.lang.Integer typetotalPages213 = searchMore200mtemp.getTotalPages();
        String tempResulttotalPages213 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalPages213));
        %>
        <%= tempResulttotalPages213 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(searchMore200mtemp != null){
java.lang.Integer typetotalRecords215 = searchMore200mtemp.getTotalRecords();
        String tempResulttotalRecords215 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords215));
        %>
        <%= tempResulttotalRecords215 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageSize:</TD>
<TD>
<%
if(searchMore200mtemp != null){
java.lang.Integer typepageSize217 = searchMore200mtemp.getPageSize();
        String tempResultpageSize217 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageSize217));
        %>
        <%= tempResultpageSize217 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 221:
        gotMethod = true;
        String searchId_35id=  request.getParameter("searchId240");
            java.lang.String searchId_35idTemp = null;
        if(!searchId_35id.equals("")){
         searchId_35idTemp  = searchId_35id;
        }
        String pageIndex_36id=  request.getParameter("pageIndex242");
        int pageIndex_36idTemp  = Integer.parseInt(pageIndex_36id);
        com.netsuite.webservices.platform.core_2014_2.SearchResult searchMoreWithId221mtemp = sampleNetSuitePortTypeProxyid.searchMoreWithId(searchId_35idTemp,pageIndex_36idTemp);
if(searchMoreWithId221mtemp == null){
%>
<%=searchMoreWithId221mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">searchId:</TD>
<TD>
<%
if(searchMoreWithId221mtemp != null){
java.lang.String typesearchId224 = searchMoreWithId221mtemp.getSearchId();
        String tempResultsearchId224 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesearchId224));
        %>
        <%= tempResultsearchId224 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">searchRowList:</TD>
<TD>
<%
if(searchMoreWithId221mtemp != null){
com.netsuite.webservices.platform.core_2014_2.SearchRow[] typesearchRowList226 = searchMoreWithId221mtemp.getSearchRowList();
        String tempsearchRowList226 = null;
        if(typesearchRowList226 != null){
        java.util.List listsearchRowList226= java.util.Arrays.asList(typesearchRowList226);
        tempsearchRowList226 = listsearchRowList226.toString();
        }
        %>
        <%=tempsearchRowList226%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">recordList:</TD>
<TD>
<%
if(searchMoreWithId221mtemp != null){
com.netsuite.webservices.platform.core_2014_2.Record[] typerecordList228 = searchMoreWithId221mtemp.getRecordList();
        String temprecordList228 = null;
        if(typerecordList228 != null){
        java.util.List listrecordList228= java.util.Arrays.asList(typerecordList228);
        temprecordList228 = listrecordList228.toString();
        }
        %>
        <%=temprecordList228%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageIndex:</TD>
<TD>
<%
if(searchMoreWithId221mtemp != null){
java.lang.Integer typepageIndex230 = searchMoreWithId221mtemp.getPageIndex();
        String tempResultpageIndex230 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageIndex230));
        %>
        <%= tempResultpageIndex230 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(searchMoreWithId221mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus232 = searchMoreWithId221mtemp.getStatus();
        String tempstatus232 = null;
        if(typestatus232 != null){
        java.util.List liststatus232= java.util.Arrays.asList(typestatus232);
        tempstatus232 = liststatus232.toString();
        }
        %>
        <%=tempstatus232%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD>
<%
if(searchMoreWithId221mtemp != null){
java.lang.Integer typetotalPages234 = searchMoreWithId221mtemp.getTotalPages();
        String tempResulttotalPages234 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalPages234));
        %>
        <%= tempResulttotalPages234 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(searchMoreWithId221mtemp != null){
java.lang.Integer typetotalRecords236 = searchMoreWithId221mtemp.getTotalRecords();
        String tempResulttotalRecords236 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords236));
        %>
        <%= tempResulttotalRecords236 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageSize:</TD>
<TD>
<%
if(searchMoreWithId221mtemp != null){
java.lang.Integer typepageSize238 = searchMoreWithId221mtemp.getPageSize();
        String tempResultpageSize238 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageSize238));
        %>
        <%= tempResultpageSize238 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 244:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.SearchResult searchNext244mtemp = sampleNetSuitePortTypeProxyid.searchNext();
if(searchNext244mtemp == null){
%>
<%=searchNext244mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">searchId:</TD>
<TD>
<%
if(searchNext244mtemp != null){
java.lang.String typesearchId247 = searchNext244mtemp.getSearchId();
        String tempResultsearchId247 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesearchId247));
        %>
        <%= tempResultsearchId247 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">searchRowList:</TD>
<TD>
<%
if(searchNext244mtemp != null){
com.netsuite.webservices.platform.core_2014_2.SearchRow[] typesearchRowList249 = searchNext244mtemp.getSearchRowList();
        String tempsearchRowList249 = null;
        if(typesearchRowList249 != null){
        java.util.List listsearchRowList249= java.util.Arrays.asList(typesearchRowList249);
        tempsearchRowList249 = listsearchRowList249.toString();
        }
        %>
        <%=tempsearchRowList249%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">recordList:</TD>
<TD>
<%
if(searchNext244mtemp != null){
com.netsuite.webservices.platform.core_2014_2.Record[] typerecordList251 = searchNext244mtemp.getRecordList();
        String temprecordList251 = null;
        if(typerecordList251 != null){
        java.util.List listrecordList251= java.util.Arrays.asList(typerecordList251);
        temprecordList251 = listrecordList251.toString();
        }
        %>
        <%=temprecordList251%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageIndex:</TD>
<TD>
<%
if(searchNext244mtemp != null){
java.lang.Integer typepageIndex253 = searchNext244mtemp.getPageIndex();
        String tempResultpageIndex253 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageIndex253));
        %>
        <%= tempResultpageIndex253 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(searchNext244mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus255 = searchNext244mtemp.getStatus();
        String tempstatus255 = null;
        if(typestatus255 != null){
        java.util.List liststatus255= java.util.Arrays.asList(typestatus255);
        tempstatus255 = liststatus255.toString();
        }
        %>
        <%=tempstatus255%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD>
<%
if(searchNext244mtemp != null){
java.lang.Integer typetotalPages257 = searchNext244mtemp.getTotalPages();
        String tempResulttotalPages257 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalPages257));
        %>
        <%= tempResulttotalPages257 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(searchNext244mtemp != null){
java.lang.Integer typetotalRecords259 = searchNext244mtemp.getTotalRecords();
        String tempResulttotalRecords259 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords259));
        %>
        <%= tempResulttotalRecords259 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageSize:</TD>
<TD>
<%
if(searchNext244mtemp != null){
java.lang.Integer typepageSize261 = searchNext244mtemp.getPageSize();
        String tempResultpageSize261 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageSize261));
        %>
        <%= tempResultpageSize261 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 263:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.Record com1netsuite1webservices1platform1core_2014_21Record_37id = null;
        com.netsuite.webservices.platform.messages_2014_2.WriteResponse update263mtemp = sampleNetSuitePortTypeProxyid.update(com1netsuite1webservices1platform1core_2014_21Record_37id);
if(update263mtemp == null){
%>
<%=update263mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(update263mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus266 = update263mtemp.getStatus();
        String tempstatus266 = null;
        if(typestatus266 != null){
        java.util.List liststatus266= java.util.Arrays.asList(typestatus266);
        tempstatus266 = liststatus266.toString();
        }
        %>
        <%=tempstatus266%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">baseRef:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(update263mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BaseRef tebece0=update263mtemp.getBaseRef();
if(tebece0 != null){
java.lang.String typename270 = tebece0.getName();
        String tempResultname270 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename270));
        %>
        <%= tempResultname270 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 274:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.Record com1netsuite1webservices1platform1core_2014_21Record_38id = null;
        com.netsuite.webservices.platform.messages_2014_2.WriteResponse upsert274mtemp = sampleNetSuitePortTypeProxyid.upsert(com1netsuite1webservices1platform1core_2014_21Record_38id);
if(upsert274mtemp == null){
%>
<%=upsert274mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(upsert274mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus277 = upsert274mtemp.getStatus();
        String tempstatus277 = null;
        if(typestatus277 != null){
        java.util.List liststatus277= java.util.Arrays.asList(typestatus277);
        tempstatus277 = liststatus277.toString();
        }
        %>
        <%=tempstatus277%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">baseRef:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(upsert274mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BaseRef tebece0=upsert274mtemp.getBaseRef();
if(tebece0 != null){
java.lang.String typename281 = tebece0.getName();
        String tempResultname281 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename281));
        %>
        <%= tempResultname281 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 285:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.BaseRef com1netsuite1webservices1platform1core_2014_21BaseRef_39id = null;
        com.netsuite.webservices.platform.messages_2014_2.ReadResponse get285mtemp = sampleNetSuitePortTypeProxyid.get(com1netsuite1webservices1platform1core_2014_21BaseRef_39id);
if(get285mtemp == null){
%>
<%=get285mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">record:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">nullFieldList:</TD>
<TD>
<%
if(get285mtemp != null){
com.netsuite.webservices.platform.core_2014_2.Record tebece0=get285mtemp.getRecord();
if(tebece0 != null){
java.lang.String[] typenullFieldList290 = tebece0.getNullFieldList();
        String tempnullFieldList290 = null;
        if(typenullFieldList290 != null){
        java.util.List listnullFieldList290= java.util.Arrays.asList(typenullFieldList290);
        tempnullFieldList290 = listnullFieldList290.toString();
        }
        %>
        <%=tempnullFieldList290%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(get285mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus292 = get285mtemp.getStatus();
        String tempstatus292 = null;
        if(typestatus292 != null){
        java.util.List liststatus292= java.util.Arrays.asList(typestatus292);
        tempstatus292 = liststatus292.toString();
        }
        %>
        <%=tempstatus292%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 296:
        gotMethod = true;
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21GetAllRecord_40id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.GetAllRecord" />
        <%
        com.netsuite.webservices.platform.core_2014_2.GetAllResult getAll296mtemp = sampleNetSuitePortTypeProxyid.getAll(com1netsuite1webservices1platform1core_2014_21GetAllRecord_40id);
if(getAll296mtemp == null){
%>
<%=getAll296mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">recordList:</TD>
<TD>
<%
if(getAll296mtemp != null){
com.netsuite.webservices.platform.core_2014_2.Record[] typerecordList299 = getAll296mtemp.getRecordList();
        String temprecordList299 = null;
        if(typerecordList299 != null){
        java.util.List listrecordList299= java.util.Arrays.asList(typerecordList299);
        temprecordList299 = listrecordList299.toString();
        }
        %>
        <%=temprecordList299%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getAll296mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus301 = getAll296mtemp.getStatus();
        String tempstatus301 = null;
        if(typestatus301 != null){
        java.util.List liststatus301= java.util.Arrays.asList(typestatus301);
        tempstatus301 = liststatus301.toString();
        }
        %>
        <%=tempstatus301%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(getAll296mtemp != null){
java.lang.Integer typetotalRecords303 = getAll296mtemp.getTotalRecords();
        String tempResulttotalRecords303 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords303));
        %>
        <%= tempResulttotalRecords303 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 307:
        gotMethod = true;
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21GetSavedSearchRecord_41id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.GetSavedSearchRecord" />
        <%
        com.netsuite.webservices.platform.core_2014_2.GetSavedSearchResult getSavedSearch307mtemp = sampleNetSuitePortTypeProxyid.getSavedSearch(com1netsuite1webservices1platform1core_2014_21GetSavedSearchRecord_41id);
if(getSavedSearch307mtemp == null){
%>
<%=getSavedSearch307mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getSavedSearch307mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus310 = getSavedSearch307mtemp.getStatus();
        String tempstatus310 = null;
        if(typestatus310 != null){
        java.util.List liststatus310= java.util.Arrays.asList(typestatus310);
        tempstatus310 = liststatus310.toString();
        }
        %>
        <%=tempstatus310%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">recordRefList:</TD>
<TD>
<%
if(getSavedSearch307mtemp != null){
com.netsuite.webservices.platform.core_2014_2.RecordRef[] typerecordRefList312 = getSavedSearch307mtemp.getRecordRefList();
        String temprecordRefList312 = null;
        if(typerecordRefList312 != null){
        java.util.List listrecordRefList312= java.util.Arrays.asList(typerecordRefList312);
        temprecordRefList312 = listrecordRefList312.toString();
        }
        %>
        <%=temprecordRefList312%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(getSavedSearch307mtemp != null){
java.lang.Integer typetotalRecords314 = getSavedSearch307mtemp.getTotalRecords();
        String tempResulttotalRecords314 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords314));
        %>
        <%= tempResulttotalRecords314 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 318:
        gotMethod = true;
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21CustomizationType_42id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.CustomizationType" />
        <%
        String includeInactives_43id=  request.getParameter("includeInactives329");
        boolean includeInactives_43idTemp  = Boolean.valueOf(includeInactives_43id).booleanValue();
        com.netsuite.webservices.platform.core_2014_2.GetCustomizationIdResult getCustomizationId318mtemp = sampleNetSuitePortTypeProxyid.getCustomizationId(com1netsuite1webservices1platform1core_2014_21CustomizationType_42id,includeInactives_43idTemp);
if(getCustomizationId318mtemp == null){
%>
<%=getCustomizationId318mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getCustomizationId318mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus321 = getCustomizationId318mtemp.getStatus();
        String tempstatus321 = null;
        if(typestatus321 != null){
        java.util.List liststatus321= java.util.Arrays.asList(typestatus321);
        tempstatus321 = liststatus321.toString();
        }
        %>
        <%=tempstatus321%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">customizationRefList:</TD>
<TD>
<%
if(getCustomizationId318mtemp != null){
com.netsuite.webservices.platform.core_2014_2.CustomizationRef[] typecustomizationRefList323 = getCustomizationId318mtemp.getCustomizationRefList();
        String tempcustomizationRefList323 = null;
        if(typecustomizationRefList323 != null){
        java.util.List listcustomizationRefList323= java.util.Arrays.asList(typecustomizationRefList323);
        tempcustomizationRefList323 = listcustomizationRefList323.toString();
        }
        %>
        <%=tempcustomizationRefList323%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(getCustomizationId318mtemp != null){
java.lang.Integer typetotalRecords325 = getCustomizationId318mtemp.getTotalRecords();
        String tempResulttotalRecords325 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords325));
        %>
        <%= tempResulttotalRecords325 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 331:
        gotMethod = true;
        String internalId_46id=  request.getParameter("internalId344");
            java.lang.String internalId_46idTemp = null;
        if(!internalId_46id.equals("")){
         internalId_46idTemp  = internalId_46id;
        }
        String externalId_47id=  request.getParameter("externalId346");
            java.lang.String externalId_47idTemp = null;
        if(!externalId_47id.equals("")){
         externalId_47idTemp  = externalId_47id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21InitializeRef_45id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.InitializeRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21InitializeRef_45id.setInternalId(internalId_46idTemp);
        com1netsuite1webservices1platform1core_2014_21InitializeRef_45id.setExternalId(externalId_47idTemp);
        String internalId_49id=  request.getParameter("internalId350");
            java.lang.String internalId_49idTemp = null;
        if(!internalId_49id.equals("")){
         internalId_49idTemp  = internalId_49id;
        }
        String externalId_50id=  request.getParameter("externalId352");
            java.lang.String externalId_50idTemp = null;
        if(!externalId_50id.equals("")){
         externalId_50idTemp  = externalId_50id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21InitializeAuxRef_48id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.InitializeAuxRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21InitializeAuxRef_48id.setInternalId(internalId_49idTemp);
        com1netsuite1webservices1platform1core_2014_21InitializeAuxRef_48id.setExternalId(externalId_50idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21InitializeRecord_44id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.InitializeRecord" />
        <%
        com1netsuite1webservices1platform1core_2014_21InitializeRecord_44id.setReference(com1netsuite1webservices1platform1core_2014_21InitializeRef_45id);
        com1netsuite1webservices1platform1core_2014_21InitializeRecord_44id.setAuxReference(com1netsuite1webservices1platform1core_2014_21InitializeAuxRef_48id);
        com.netsuite.webservices.platform.messages_2014_2.ReadResponse initialize331mtemp = sampleNetSuitePortTypeProxyid.initialize(com1netsuite1webservices1platform1core_2014_21InitializeRecord_44id);
if(initialize331mtemp == null){
%>
<%=initialize331mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">record:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">nullFieldList:</TD>
<TD>
<%
if(initialize331mtemp != null){
com.netsuite.webservices.platform.core_2014_2.Record tebece0=initialize331mtemp.getRecord();
if(tebece0 != null){
java.lang.String[] typenullFieldList336 = tebece0.getNullFieldList();
        String tempnullFieldList336 = null;
        if(typenullFieldList336 != null){
        java.util.List listnullFieldList336= java.util.Arrays.asList(typenullFieldList336);
        tempnullFieldList336 = listnullFieldList336.toString();
        }
        %>
        <%=tempnullFieldList336%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(initialize331mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus338 = initialize331mtemp.getStatus();
        String tempstatus338 = null;
        if(typestatus338 != null){
        java.util.List liststatus338= java.util.Arrays.asList(typestatus338);
        tempstatus338 = liststatus338.toString();
        }
        %>
        <%=tempstatus338%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 354:
        gotMethod = true;
        String sublist_52id=  request.getParameter("sublist367");
            java.lang.String sublist_52idTemp = null;
        if(!sublist_52id.equals("")){
         sublist_52idTemp  = sublist_52id;
        }
        String filterValue_54id=  request.getParameter("filterValue371");
            java.lang.String filterValue_54idTemp = null;
        if(!filterValue_54id.equals("")){
         filterValue_54idTemp  = filterValue_54id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21GetSelectValueFilter_53id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.GetSelectValueFilter" />
        <%
        com1netsuite1webservices1platform1core_2014_21GetSelectValueFilter_53id.setFilterValue(filterValue_54idTemp);
        String internalId_56id=  request.getParameter("internalId375");
            java.lang.String internalId_56idTemp = null;
        if(!internalId_56id.equals("")){
         internalId_56idTemp  = internalId_56id;
        }
        String externalId_57id=  request.getParameter("externalId377");
            java.lang.String externalId_57idTemp = null;
        if(!externalId_57id.equals("")){
         externalId_57idTemp  = externalId_57id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_55id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_55id.setInternalId(internalId_56idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_55id.setExternalId(externalId_57idTemp);
        String field_58id=  request.getParameter("field379");
            java.lang.String field_58idTemp = null;
        if(!field_58id.equals("")){
         field_58idTemp  = field_58id;
        }
        String internalId_60id=  request.getParameter("internalId383");
            java.lang.String internalId_60idTemp = null;
        if(!internalId_60id.equals("")){
         internalId_60idTemp  = internalId_60id;
        }
        String externalId_61id=  request.getParameter("externalId385");
            java.lang.String externalId_61idTemp = null;
        if(!externalId_61id.equals("")){
         externalId_61idTemp  = externalId_61id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_59id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_59id.setInternalId(internalId_60idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_59id.setExternalId(externalId_61idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21GetSelectValueFieldDescription_51id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.GetSelectValueFieldDescription" />
        <%
        com1netsuite1webservices1platform1core_2014_21GetSelectValueFieldDescription_51id.setSublist(sublist_52idTemp);
        com1netsuite1webservices1platform1core_2014_21GetSelectValueFieldDescription_51id.setFilter(com1netsuite1webservices1platform1core_2014_21GetSelectValueFilter_53id);
        com1netsuite1webservices1platform1core_2014_21GetSelectValueFieldDescription_51id.setCustomRecordType(com1netsuite1webservices1platform1core_2014_21RecordRef_55id);
        com1netsuite1webservices1platform1core_2014_21GetSelectValueFieldDescription_51id.setField(field_58idTemp);
        com1netsuite1webservices1platform1core_2014_21GetSelectValueFieldDescription_51id.setCustomForm(com1netsuite1webservices1platform1core_2014_21RecordRef_59id);
        String pageIndex_62id=  request.getParameter("pageIndex387");
        int pageIndex_62idTemp  = Integer.parseInt(pageIndex_62id);
        com.netsuite.webservices.platform.core_2014_2.GetSelectValueResult getSelectValue354mtemp = sampleNetSuitePortTypeProxyid.getSelectValue(com1netsuite1webservices1platform1core_2014_21GetSelectValueFieldDescription_51id,pageIndex_62idTemp);
if(getSelectValue354mtemp == null){
%>
<%=getSelectValue354mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getSelectValue354mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus357 = getSelectValue354mtemp.getStatus();
        String tempstatus357 = null;
        if(typestatus357 != null){
        java.util.List liststatus357= java.util.Arrays.asList(typestatus357);
        tempstatus357 = liststatus357.toString();
        }
        %>
        <%=tempstatus357%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">baseRefList:</TD>
<TD>
<%
if(getSelectValue354mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BaseRef[] typebaseRefList359 = getSelectValue354mtemp.getBaseRefList();
        String tempbaseRefList359 = null;
        if(typebaseRefList359 != null){
        java.util.List listbaseRefList359= java.util.Arrays.asList(typebaseRefList359);
        tempbaseRefList359 = listbaseRefList359.toString();
        }
        %>
        <%=tempbaseRefList359%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD>
<%
if(getSelectValue354mtemp != null){
java.lang.Integer typetotalPages361 = getSelectValue354mtemp.getTotalPages();
        String tempResulttotalPages361 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalPages361));
        %>
        <%= tempResulttotalPages361 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(getSelectValue354mtemp != null){
java.lang.Integer typetotalRecords363 = getSelectValue354mtemp.getTotalRecords();
        String tempResulttotalRecords363 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords363));
        %>
        <%= tempResulttotalRecords363 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 389:
        gotMethod = true;
        String lastQtyAvailableChange_64id=  request.getParameter("lastQtyAvailableChange398");
            java.util.Calendar lastQtyAvailableChange_64idTemp = null;
        if(!lastQtyAvailableChange_64id.equals("")){
        java.text.DateFormat dateFormatlastQtyAvailableChange398 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTemplastQtyAvailableChange398  = dateFormatlastQtyAvailableChange398.parse(lastQtyAvailableChange_64id);
         lastQtyAvailableChange_64idTemp = new java.util.GregorianCalendar();
        lastQtyAvailableChange_64idTemp.setTime(dateTemplastQtyAvailableChange398);
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21ItemAvailabilityFilter_63id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.ItemAvailabilityFilter" />
        <%
        com1netsuite1webservices1platform1core_2014_21ItemAvailabilityFilter_63id.setLastQtyAvailableChange(lastQtyAvailableChange_64idTemp);
        com.netsuite.webservices.platform.core_2014_2.GetItemAvailabilityResult getItemAvailability389mtemp = sampleNetSuitePortTypeProxyid.getItemAvailability(com1netsuite1webservices1platform1core_2014_21ItemAvailabilityFilter_63id);
if(getItemAvailability389mtemp == null){
%>
<%=getItemAvailability389mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getItemAvailability389mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus392 = getItemAvailability389mtemp.getStatus();
        String tempstatus392 = null;
        if(typestatus392 != null){
        java.util.List liststatus392= java.util.Arrays.asList(typestatus392);
        tempstatus392 = liststatus392.toString();
        }
        %>
        <%=tempstatus392%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">itemAvailabilityList:</TD>
<TD>
<%
if(getItemAvailability389mtemp != null){
com.netsuite.webservices.platform.core_2014_2.ItemAvailability[] typeitemAvailabilityList394 = getItemAvailability389mtemp.getItemAvailabilityList();
        String tempitemAvailabilityList394 = null;
        if(typeitemAvailabilityList394 != null){
        java.util.List listitemAvailabilityList394= java.util.Arrays.asList(typeitemAvailabilityList394);
        tempitemAvailabilityList394 = listitemAvailabilityList394.toString();
        }
        %>
        <%=tempitemAvailabilityList394%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 400:
        gotMethod = true;
        String internalId_67id=  request.getParameter("internalId411");
            java.lang.String internalId_67idTemp = null;
        if(!internalId_67id.equals("")){
         internalId_67idTemp  = internalId_67id;
        }
        String externalId_68id=  request.getParameter("externalId413");
            java.lang.String externalId_68idTemp = null;
        if(!externalId_68id.equals("")){
         externalId_68idTemp  = externalId_68id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_66id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_66id.setInternalId(internalId_67idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_66id.setExternalId(externalId_68idTemp);
        String internalId_70id=  request.getParameter("internalId417");
            java.lang.String internalId_70idTemp = null;
        if(!internalId_70id.equals("")){
         internalId_70idTemp  = internalId_70id;
        }
        String externalId_71id=  request.getParameter("externalId419");
            java.lang.String externalId_71idTemp = null;
        if(!externalId_71id.equals("")){
         externalId_71idTemp  = externalId_71id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_69id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_69id.setInternalId(internalId_70idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_69id.setExternalId(externalId_71idTemp);
        String internalId_73id=  request.getParameter("internalId423");
            java.lang.String internalId_73idTemp = null;
        if(!internalId_73id.equals("")){
         internalId_73idTemp  = internalId_73id;
        }
        String externalId_74id=  request.getParameter("externalId425");
            java.lang.String externalId_74idTemp = null;
        if(!externalId_74id.equals("")){
         externalId_74idTemp  = externalId_74id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_72id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_72id.setInternalId(internalId_73idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_72id.setExternalId(externalId_74idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21BudgetExchangeRateFilter_65id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.BudgetExchangeRateFilter" />
        <%
        com1netsuite1webservices1platform1core_2014_21BudgetExchangeRateFilter_65id.setToSubsidiary(com1netsuite1webservices1platform1core_2014_21RecordRef_66id);
        com1netsuite1webservices1platform1core_2014_21BudgetExchangeRateFilter_65id.setPeriod(com1netsuite1webservices1platform1core_2014_21RecordRef_69id);
        com1netsuite1webservices1platform1core_2014_21BudgetExchangeRateFilter_65id.setFromSubsidiary(com1netsuite1webservices1platform1core_2014_21RecordRef_72id);
        com.netsuite.webservices.platform.core_2014_2.GetBudgetExchangeRateResult getBudgetExchangeRate400mtemp = sampleNetSuitePortTypeProxyid.getBudgetExchangeRate(com1netsuite1webservices1platform1core_2014_21BudgetExchangeRateFilter_65id);
if(getBudgetExchangeRate400mtemp == null){
%>
<%=getBudgetExchangeRate400mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">budgetExchangeRateList:</TD>
<TD>
<%
if(getBudgetExchangeRate400mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BudgetExchangeRate[] typebudgetExchangeRateList403 = getBudgetExchangeRate400mtemp.getBudgetExchangeRateList();
        String tempbudgetExchangeRateList403 = null;
        if(typebudgetExchangeRateList403 != null){
        java.util.List listbudgetExchangeRateList403= java.util.Arrays.asList(typebudgetExchangeRateList403);
        tempbudgetExchangeRateList403 = listbudgetExchangeRateList403.toString();
        }
        %>
        <%=tempbudgetExchangeRateList403%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getBudgetExchangeRate400mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus405 = getBudgetExchangeRate400mtemp.getStatus();
        String tempstatus405 = null;
        if(typestatus405 != null){
        java.util.List liststatus405= java.util.Arrays.asList(typestatus405);
        tempstatus405 = liststatus405.toString();
        }
        %>
        <%=tempstatus405%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 427:
        gotMethod = true;
        String internalId_77id=  request.getParameter("internalId438");
            java.lang.String internalId_77idTemp = null;
        if(!internalId_77id.equals("")){
         internalId_77idTemp  = internalId_77id;
        }
        String externalId_78id=  request.getParameter("externalId440");
            java.lang.String externalId_78idTemp = null;
        if(!externalId_78id.equals("")){
         externalId_78idTemp  = externalId_78id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_76id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_76id.setInternalId(internalId_77idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_76id.setExternalId(externalId_78idTemp);
        String internalId_80id=  request.getParameter("internalId444");
            java.lang.String internalId_80idTemp = null;
        if(!internalId_80id.equals("")){
         internalId_80idTemp  = internalId_80id;
        }
        String externalId_81id=  request.getParameter("externalId446");
            java.lang.String externalId_81idTemp = null;
        if(!externalId_81id.equals("")){
         externalId_81idTemp  = externalId_81id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_79id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_79id.setInternalId(internalId_80idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_79id.setExternalId(externalId_81idTemp);
        String internalId_83id=  request.getParameter("internalId450");
            java.lang.String internalId_83idTemp = null;
        if(!internalId_83id.equals("")){
         internalId_83idTemp  = internalId_83id;
        }
        String externalId_84id=  request.getParameter("externalId452");
            java.lang.String externalId_84idTemp = null;
        if(!externalId_84id.equals("")){
         externalId_84idTemp  = externalId_84id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_82id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_82id.setInternalId(internalId_83idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_82id.setExternalId(externalId_84idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21ConsolidatedExchangeRateFilter_75id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.ConsolidatedExchangeRateFilter" />
        <%
        com1netsuite1webservices1platform1core_2014_21ConsolidatedExchangeRateFilter_75id.setToSubsidiary(com1netsuite1webservices1platform1core_2014_21RecordRef_76id);
        com1netsuite1webservices1platform1core_2014_21ConsolidatedExchangeRateFilter_75id.setPeriod(com1netsuite1webservices1platform1core_2014_21RecordRef_79id);
        com1netsuite1webservices1platform1core_2014_21ConsolidatedExchangeRateFilter_75id.setFromSubsidiary(com1netsuite1webservices1platform1core_2014_21RecordRef_82id);
        com.netsuite.webservices.platform.core_2014_2.GetConsolidatedExchangeRateResult getConsolidatedExchangeRate427mtemp = sampleNetSuitePortTypeProxyid.getConsolidatedExchangeRate(com1netsuite1webservices1platform1core_2014_21ConsolidatedExchangeRateFilter_75id);
if(getConsolidatedExchangeRate427mtemp == null){
%>
<%=getConsolidatedExchangeRate427mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">consolidatedExchangeRateList:</TD>
<TD>
<%
if(getConsolidatedExchangeRate427mtemp != null){
com.netsuite.webservices.platform.core_2014_2.ConsolidatedExchangeRate[] typeconsolidatedExchangeRateList430 = getConsolidatedExchangeRate427mtemp.getConsolidatedExchangeRateList();
        String tempconsolidatedExchangeRateList430 = null;
        if(typeconsolidatedExchangeRateList430 != null){
        java.util.List listconsolidatedExchangeRateList430= java.util.Arrays.asList(typeconsolidatedExchangeRateList430);
        tempconsolidatedExchangeRateList430 = listconsolidatedExchangeRateList430.toString();
        }
        %>
        <%=tempconsolidatedExchangeRateList430%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getConsolidatedExchangeRate427mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus432 = getConsolidatedExchangeRate427mtemp.getStatus();
        String tempstatus432 = null;
        if(typestatus432 != null){
        java.util.List liststatus432= java.util.Arrays.asList(typestatus432);
        tempstatus432 = liststatus432.toString();
        }
        %>
        <%=tempstatus432%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 454:
        gotMethod = true;
        String internalId_87id=  request.getParameter("internalId465");
            java.lang.String internalId_87idTemp = null;
        if(!internalId_87id.equals("")){
         internalId_87idTemp  = internalId_87id;
        }
        String externalId_88id=  request.getParameter("externalId467");
            java.lang.String externalId_88idTemp = null;
        if(!externalId_88id.equals("")){
         externalId_88idTemp  = externalId_88id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_86id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_86id.setInternalId(internalId_87idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_86id.setExternalId(externalId_88idTemp);
        String internalId_90id=  request.getParameter("internalId471");
            java.lang.String internalId_90idTemp = null;
        if(!internalId_90id.equals("")){
         internalId_90idTemp  = internalId_90id;
        }
        String externalId_91id=  request.getParameter("externalId473");
            java.lang.String externalId_91idTemp = null;
        if(!externalId_91id.equals("")){
         externalId_91idTemp  = externalId_91id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_89id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_89id.setInternalId(internalId_90idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_89id.setExternalId(externalId_91idTemp);
        String effectiveDate_92id=  request.getParameter("effectiveDate475");
            java.util.Calendar effectiveDate_92idTemp = null;
        if(!effectiveDate_92id.equals("")){
        java.text.DateFormat dateFormateffectiveDate475 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempeffectiveDate475  = dateFormateffectiveDate475.parse(effectiveDate_92id);
         effectiveDate_92idTemp = new java.util.GregorianCalendar();
        effectiveDate_92idTemp.setTime(dateTempeffectiveDate475);
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21CurrencyRateFilter_85id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.CurrencyRateFilter" />
        <%
        com1netsuite1webservices1platform1core_2014_21CurrencyRateFilter_85id.setFromCurrency(com1netsuite1webservices1platform1core_2014_21RecordRef_86id);
        com1netsuite1webservices1platform1core_2014_21CurrencyRateFilter_85id.setBaseCurrency(com1netsuite1webservices1platform1core_2014_21RecordRef_89id);
        com1netsuite1webservices1platform1core_2014_21CurrencyRateFilter_85id.setEffectiveDate(effectiveDate_92idTemp);
        com.netsuite.webservices.platform.core_2014_2.GetCurrencyRateResult getCurrencyRate454mtemp = sampleNetSuitePortTypeProxyid.getCurrencyRate(com1netsuite1webservices1platform1core_2014_21CurrencyRateFilter_85id);
if(getCurrencyRate454mtemp == null){
%>
<%=getCurrencyRate454mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getCurrencyRate454mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus457 = getCurrencyRate454mtemp.getStatus();
        String tempstatus457 = null;
        if(typestatus457 != null){
        java.util.List liststatus457= java.util.Arrays.asList(typestatus457);
        tempstatus457 = liststatus457.toString();
        }
        %>
        <%=tempstatus457%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">currencyRateList:</TD>
<TD>
<%
if(getCurrencyRate454mtemp != null){
com.netsuite.webservices.platform.core_2014_2.CurrencyRate[] typecurrencyRateList459 = getCurrencyRate454mtemp.getCurrencyRateList();
        String tempcurrencyRateList459 = null;
        if(typecurrencyRateList459 != null){
        java.util.List listcurrencyRateList459= java.util.Arrays.asList(typecurrencyRateList459);
        tempcurrencyRateList459 = listcurrencyRateList459.toString();
        }
        %>
        <%=tempcurrencyRateList459%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 477:
        gotMethod = true;
        String account_93id=  request.getParameter("account490");
            java.lang.String account_93idTemp = null;
        if(!account_93id.equals("")){
         account_93idTemp  = account_93id;
        }
        com.netsuite.webservices.platform.core_2014_2.GetDataCenterUrlsResult getDataCenterUrls477mtemp = sampleNetSuitePortTypeProxyid.getDataCenterUrls(account_93idTemp);
if(getDataCenterUrls477mtemp == null){
%>
<%=getDataCenterUrls477mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getDataCenterUrls477mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus480 = getDataCenterUrls477mtemp.getStatus();
        String tempstatus480 = null;
        if(typestatus480 != null){
        java.util.List liststatus480= java.util.Arrays.asList(typestatus480);
        tempstatus480 = liststatus480.toString();
        }
        %>
        <%=tempstatus480%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dataCenterUrls:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">systemDomain:</TD>
<TD>
<%
if(getDataCenterUrls477mtemp != null){
com.netsuite.webservices.platform.core_2014_2.DataCenterUrls tebece0=getDataCenterUrls477mtemp.getDataCenterUrls();
if(tebece0 != null){
java.lang.String typesystemDomain484 = tebece0.getSystemDomain();
        String tempResultsystemDomain484 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesystemDomain484));
        %>
        <%= tempResultsystemDomain484 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">webservicesDomain:</TD>
<TD>
<%
if(getDataCenterUrls477mtemp != null){
com.netsuite.webservices.platform.core_2014_2.DataCenterUrls tebece0=getDataCenterUrls477mtemp.getDataCenterUrls();
if(tebece0 != null){
java.lang.String typewebservicesDomain486 = tebece0.getWebservicesDomain();
        String tempResultwebservicesDomain486 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typewebservicesDomain486));
        %>
        <%= tempResultwebservicesDomain486 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">restDomain:</TD>
<TD>
<%
if(getDataCenterUrls477mtemp != null){
com.netsuite.webservices.platform.core_2014_2.DataCenterUrls tebece0=getDataCenterUrls477mtemp.getDataCenterUrls();
if(tebece0 != null){
java.lang.String typerestDomain488 = tebece0.getRestDomain();
        String tempResultrestDomain488 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerestDomain488));
        %>
        <%= tempResultrestDomain488 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 492:
        gotMethod = true;
        String parentItem_95id=  request.getParameter("parentItem509");
            java.lang.Boolean parentItem_95idTemp = null;
        if(!parentItem_95id.equals("")){
         parentItem_95idTemp  = java.lang.Boolean.valueOf(parentItem_95id);
        }
        String book_96id=  request.getParameter("book511");
            java.lang.Boolean book_96idTemp = null;
        if(!book_96id.equals("")){
         book_96idTemp  = java.lang.Boolean.valueOf(book_96id);
        }
        String entity_97id=  request.getParameter("entity513");
            java.lang.Boolean entity_97idTemp = null;
        if(!entity_97id.equals("")){
         entity_97idTemp  = java.lang.Boolean.valueOf(entity_97id);
        }
        String department_98id=  request.getParameter("department515");
            java.lang.Boolean department_98idTemp = null;
        if(!department_98id.equals("")){
         department_98idTemp  = java.lang.Boolean.valueOf(department_98id);
        }
        String _class_99id=  request.getParameter("_class517");
            java.lang.Boolean _class_99idTemp = null;
        if(!_class_99id.equals("")){
         _class_99idTemp  = java.lang.Boolean.valueOf(_class_99id);
        }
        String account_100id=  request.getParameter("account519");
            java.lang.Boolean account_100idTemp = null;
        if(!account_100id.equals("")){
         account_100idTemp  = java.lang.Boolean.valueOf(account_100id);
        }
        String period_101id=  request.getParameter("period521");
            java.lang.Boolean period_101idTemp = null;
        if(!period_101id.equals("")){
         period_101idTemp  = java.lang.Boolean.valueOf(period_101id);
        }
        String location_102id=  request.getParameter("location523");
            java.lang.Boolean location_102idTemp = null;
        if(!location_102id.equals("")){
         location_102idTemp  = java.lang.Boolean.valueOf(location_102id);
        }
        String subsidiary_103id=  request.getParameter("subsidiary525");
            java.lang.Boolean subsidiary_103idTemp = null;
        if(!subsidiary_103id.equals("")){
         subsidiary_103idTemp  = java.lang.Boolean.valueOf(subsidiary_103id);
        }
        String item_104id=  request.getParameter("item527");
            java.lang.Boolean item_104idTemp = null;
        if(!item_104id.equals("")){
         item_104idTemp  = java.lang.Boolean.valueOf(item_104id);
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.PostingTransactionSummaryField" />
        <%
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setParentItem(parentItem_95idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setBook(book_96idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setEntity(entity_97idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setDepartment(department_98idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.set_class(_class_99idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setAccount(account_100idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setPeriod(period_101idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setLocation(location_102idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setSubsidiary(subsidiary_103idTemp);
        com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id.setItem(item_104idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryFilter_105id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.PostingTransactionSummaryFilter" />
        <%
        String pageIndex_106id=  request.getParameter("pageIndex531");
        int pageIndex_106idTemp  = Integer.parseInt(pageIndex_106id);
        com.netsuite.webservices.platform.core_2014_2.GetPostingTransactionSummaryResult getPostingTransactionSummary492mtemp = sampleNetSuitePortTypeProxyid.getPostingTransactionSummary(com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryField_94id,com1netsuite1webservices1platform1core_2014_21PostingTransactionSummaryFilter_105id,pageIndex_106idTemp);
if(getPostingTransactionSummary492mtemp == null){
%>
<%=getPostingTransactionSummary492mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageIndex:</TD>
<TD>
<%
if(getPostingTransactionSummary492mtemp != null){
java.lang.Integer typepageIndex495 = getPostingTransactionSummary492mtemp.getPageIndex();
        String tempResultpageIndex495 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageIndex495));
        %>
        <%= tempResultpageIndex495 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageSize:</TD>
<TD>
<%
if(getPostingTransactionSummary492mtemp != null){
java.lang.Integer typepageSize497 = getPostingTransactionSummary492mtemp.getPageSize();
        String tempResultpageSize497 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepageSize497));
        %>
        <%= tempResultpageSize497 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getPostingTransactionSummary492mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus499 = getPostingTransactionSummary492mtemp.getStatus();
        String tempstatus499 = null;
        if(typestatus499 != null){
        java.util.List liststatus499= java.util.Arrays.asList(typestatus499);
        tempstatus499 = liststatus499.toString();
        }
        %>
        <%=tempstatus499%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD>
<%
if(getPostingTransactionSummary492mtemp != null){
java.lang.Integer typetotalPages501 = getPostingTransactionSummary492mtemp.getTotalPages();
        String tempResulttotalPages501 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalPages501));
        %>
        <%= tempResulttotalPages501 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">postingTransactionSummaryList:</TD>
<TD>
<%
if(getPostingTransactionSummary492mtemp != null){
com.netsuite.webservices.platform.core_2014_2.PostingTransactionSummary[] typepostingTransactionSummaryList503 = getPostingTransactionSummary492mtemp.getPostingTransactionSummaryList();
        String temppostingTransactionSummaryList503 = null;
        if(typepostingTransactionSummaryList503 != null){
        java.util.List listpostingTransactionSummaryList503= java.util.Arrays.asList(typepostingTransactionSummaryList503);
        temppostingTransactionSummaryList503 = listpostingTransactionSummaryList503.toString();
        }
        %>
        <%=temppostingTransactionSummaryList503%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalRecords:</TD>
<TD>
<%
if(getPostingTransactionSummary492mtemp != null){
java.lang.Integer typetotalRecords505 = getPostingTransactionSummary492mtemp.getTotalRecords();
        String tempResulttotalRecords505 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetotalRecords505));
        %>
        <%= tempResulttotalRecords505 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 533:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.GetServerTimeResult getServerTime533mtemp = sampleNetSuitePortTypeProxyid.getServerTime();
if(getServerTime533mtemp == null){
%>
<%=getServerTime533mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getServerTime533mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus536 = getServerTime533mtemp.getStatus();
        String tempstatus536 = null;
        if(typestatus536 != null){
        java.util.List liststatus536= java.util.Arrays.asList(typestatus536);
        tempstatus536 = liststatus536.toString();
        }
        %>
        <%=tempstatus536%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">serverTime:</TD>
<TD>
<%
if(getServerTime533mtemp != null){
java.util.Calendar typeserverTime538 = getServerTime533mtemp.getServerTime();
        java.text.DateFormat dateFormatserverTime538 = java.text.DateFormat.getDateInstance();
        java.util.Date dateserverTime538 = typeserverTime538.getTime();
        String tempResultserverTime538 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatserverTime538.format(dateserverTime538));
        %>
        <%= tempResultserverTime538 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 540:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.AttachReference com1netsuite1webservices1platform1core_2014_21AttachReference_107id = null;
        com.netsuite.webservices.platform.messages_2014_2.WriteResponse attach540mtemp = sampleNetSuitePortTypeProxyid.attach(com1netsuite1webservices1platform1core_2014_21AttachReference_107id);
if(attach540mtemp == null){
%>
<%=attach540mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(attach540mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus543 = attach540mtemp.getStatus();
        String tempstatus543 = null;
        if(typestatus543 != null){
        java.util.List liststatus543= java.util.Arrays.asList(typestatus543);
        tempstatus543 = liststatus543.toString();
        }
        %>
        <%=tempstatus543%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">baseRef:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(attach540mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BaseRef tebece0=attach540mtemp.getBaseRef();
if(tebece0 != null){
java.lang.String typename547 = tebece0.getName();
        String tempResultname547 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename547));
        %>
        <%= tempResultname547 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 551:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.DetachReference com1netsuite1webservices1platform1core_2014_21DetachReference_108id = null;
        com.netsuite.webservices.platform.messages_2014_2.WriteResponse detach551mtemp = sampleNetSuitePortTypeProxyid.detach(com1netsuite1webservices1platform1core_2014_21DetachReference_108id);
if(detach551mtemp == null){
%>
<%=detach551mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(detach551mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus554 = detach551mtemp.getStatus();
        String tempstatus554 = null;
        if(typestatus554 != null){
        java.util.List liststatus554= java.util.Arrays.asList(typestatus554);
        tempstatus554 = liststatus554.toString();
        }
        %>
        <%=tempstatus554%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">baseRef:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(detach551mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BaseRef tebece0=detach551mtemp.getBaseRef();
if(tebece0 != null){
java.lang.String typename558 = tebece0.getName();
        String tempResultname558 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename558));
        %>
        <%= tempResultname558 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 562:
        gotMethod = true;
        String internalId_111id=  request.getParameter("internalId575");
            java.lang.String internalId_111idTemp = null;
        if(!internalId_111id.equals("")){
         internalId_111idTemp  = internalId_111id;
        }
        String externalId_112id=  request.getParameter("externalId577");
            java.lang.String externalId_112idTemp = null;
        if(!externalId_112id.equals("")){
         externalId_112idTemp  = externalId_112id;
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21RecordRef_110id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.RecordRef" />
        <%
        com1netsuite1webservices1platform1core_2014_21RecordRef_110id.setInternalId(internalId_111idTemp);
        com1netsuite1webservices1platform1core_2014_21RecordRef_110id.setExternalId(externalId_112idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21UpdateInviteeStatusReference_109id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.UpdateInviteeStatusReference" />
        <%
        com1netsuite1webservices1platform1core_2014_21UpdateInviteeStatusReference_109id.setEventId(com1netsuite1webservices1platform1core_2014_21RecordRef_110id);
        com.netsuite.webservices.platform.messages_2014_2.WriteResponse updateInviteeStatus562mtemp = sampleNetSuitePortTypeProxyid.updateInviteeStatus(com1netsuite1webservices1platform1core_2014_21UpdateInviteeStatusReference_109id);
if(updateInviteeStatus562mtemp == null){
%>
<%=updateInviteeStatus562mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(updateInviteeStatus562mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus565 = updateInviteeStatus562mtemp.getStatus();
        String tempstatus565 = null;
        if(typestatus565 != null){
        java.util.List liststatus565= java.util.Arrays.asList(typestatus565);
        tempstatus565 = liststatus565.toString();
        }
        %>
        <%=tempstatus565%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">baseRef:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(updateInviteeStatus562mtemp != null){
com.netsuite.webservices.platform.core_2014_2.BaseRef tebece0=updateInviteeStatus562mtemp.getBaseRef();
if(tebece0 != null){
java.lang.String typename569 = tebece0.getName();
        String tempResultname569 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename569));
        %>
        <%= tempResultname569 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 579:
        gotMethod = true;
        com.netsuite.webservices.platform.core_2014_2.SearchRecord com1netsuite1webservices1platform1core_2014_21SearchRecord_113id = null;
        com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult asyncSearch579mtemp = sampleNetSuitePortTypeProxyid.asyncSearch(com1netsuite1webservices1platform1core_2014_21SearchRecord_113id);
if(asyncSearch579mtemp == null){
%>
<%=asyncSearch579mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">jobId:</TD>
<TD>
<%
if(asyncSearch579mtemp != null){
java.lang.String typejobId582 = asyncSearch579mtemp.getJobId();
        String tempResultjobId582 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typejobId582));
        %>
        <%= tempResultjobId582 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">estRemainingDuration:</TD>
<TD>
<%
if(asyncSearch579mtemp != null){
%>
<%=asyncSearch579mtemp.getEstRemainingDuration()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">percentCompleted:</TD>
<TD>
<%
if(asyncSearch579mtemp != null){
%>
<%=asyncSearch579mtemp.getPercentCompleted()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 590:
        gotMethod = true;
        String jobId_114id=  request.getParameter("jobId593");
            java.lang.String jobId_114idTemp = null;
        if(!jobId_114id.equals("")){
         jobId_114idTemp  = jobId_114id;
        }
        String pageIndex_115id=  request.getParameter("pageIndex595");
        int pageIndex_115idTemp  = Integer.parseInt(pageIndex_115id);
        com.netsuite.webservices.platform.messages_2014_2.AsyncResult getAsyncResult590mtemp = sampleNetSuitePortTypeProxyid.getAsyncResult(jobId_114idTemp,pageIndex_115idTemp);
if(getAsyncResult590mtemp == null){
%>
<%=getAsyncResult590mtemp %>
<%
}else{
        if(getAsyncResult590mtemp!= null){
        String tempreturnp591 = getAsyncResult590mtemp.toString();
        %>
        <%=tempreturnp591%>
        <%
        }}
break;
case 597:
        gotMethod = true;
        String jobId_116id=  request.getParameter("jobId606");
            java.lang.String jobId_116idTemp = null;
        if(!jobId_116id.equals("")){
         jobId_116idTemp  = jobId_116id;
        }
        com.netsuite.webservices.platform.core_2014_2.AsyncStatusResult checkAsyncStatus597mtemp = sampleNetSuitePortTypeProxyid.checkAsyncStatus(jobId_116idTemp);
if(checkAsyncStatus597mtemp == null){
%>
<%=checkAsyncStatus597mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">jobId:</TD>
<TD>
<%
if(checkAsyncStatus597mtemp != null){
java.lang.String typejobId600 = checkAsyncStatus597mtemp.getJobId();
        String tempResultjobId600 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typejobId600));
        %>
        <%= tempResultjobId600 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">estRemainingDuration:</TD>
<TD>
<%
if(checkAsyncStatus597mtemp != null){
%>
<%=checkAsyncStatus597mtemp.getEstRemainingDuration()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">percentCompleted:</TD>
<TD>
<%
if(checkAsyncStatus597mtemp != null){
%>
<%=checkAsyncStatus597mtemp.getPercentCompleted()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 608:
        gotMethod = true;
        String searchValue2_119id=  request.getParameter("searchValue2619");
            java.util.Calendar searchValue2_119idTemp = null;
        if(!searchValue2_119id.equals("")){
        java.text.DateFormat dateFormatsearchValue2619 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempsearchValue2619  = dateFormatsearchValue2619.parse(searchValue2_119id);
         searchValue2_119idTemp = new java.util.GregorianCalendar();
        searchValue2_119idTemp.setTime(dateTempsearchValue2619);
        }
        String searchValue_120id=  request.getParameter("searchValue621");
            java.util.Calendar searchValue_120idTemp = null;
        if(!searchValue_120id.equals("")){
        java.text.DateFormat dateFormatsearchValue621 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempsearchValue621  = dateFormatsearchValue621.parse(searchValue_120id);
         searchValue_120idTemp = new java.util.GregorianCalendar();
        searchValue_120idTemp.setTime(dateTempsearchValue621);
        }
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21SearchDateField_118id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.SearchDateField" />
        <%
        com1netsuite1webservices1platform1core_2014_21SearchDateField_118id.setSearchValue2(searchValue2_119idTemp);
        com1netsuite1webservices1platform1core_2014_21SearchDateField_118id.setSearchValue(searchValue_120idTemp);
        %>
        <jsp:useBean id="com1netsuite1webservices1platform1core_2014_21GetDeletedFilter_117id" scope="session" class="com.netsuite.webservices.platform.core_2014_2.GetDeletedFilter" />
        <%
        com1netsuite1webservices1platform1core_2014_21GetDeletedFilter_117id.setDeletedDate(com1netsuite1webservices1platform1core_2014_21SearchDateField_118id);
        com.netsuite.webservices.platform.core_2014_2.GetDeletedResult getDeleted608mtemp = sampleNetSuitePortTypeProxyid.getDeleted(com1netsuite1webservices1platform1core_2014_21GetDeletedFilter_117id);
if(getDeleted608mtemp == null){
%>
<%=getDeleted608mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getDeleted608mtemp != null){
com.netsuite.webservices.platform.core_2014_2.StatusDetail[] typestatus611 = getDeleted608mtemp.getStatus();
        String tempstatus611 = null;
        if(typestatus611 != null){
        java.util.List liststatus611= java.util.Arrays.asList(typestatus611);
        tempstatus611 = liststatus611.toString();
        }
        %>
        <%=tempstatus611%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">deletedRecordList:</TD>
<TD>
<%
if(getDeleted608mtemp != null){
com.netsuite.webservices.platform.core_2014_2.DeletedRecord[] typedeletedRecordList613 = getDeleted608mtemp.getDeletedRecordList();
        String tempdeletedRecordList613 = null;
        if(typedeletedRecordList613 != null){
        java.util.List listdeletedRecordList613= java.util.Arrays.asList(typedeletedRecordList613);
        tempdeletedRecordList613 = listdeletedRecordList613.toString();
        }
        %>
        <%=tempdeletedRecordList613%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
exception: <%= e %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>