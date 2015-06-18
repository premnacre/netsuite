<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="org.apache.axis.session.Session"%>
<%@page import="com.netsuite.webservices.platform_2014_2.NetSuitePortType"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All method availabe here</title>
<style>
#footer {
	width:100%;
	height:50px;
	position:fixed;
	bottom:0;
	left:0;
	background:#ee5;
}</style>
</head>
<body>
<h3 align="center">This is simple application for CRUD Operation</h3>
<h5 align="right" style="width: 1000px" >Webservice Connectivity with Java and Netsuite...</h5>
<div align="center"><hr width="55%"/>
<%
HttpSession session2=request.getSession();
NetSuitePortType port=(NetSuitePortType)session2.getAttribute("loginSuccess");
if(port!=null){
%><br/><br/>
<div align="center">All Method below:<br/>
<a href="search.jsp">Search</a><br/>
<a href="getData.jsp?operation=2">GetData</a><br/>
<a href="getData.jsp?operation=3">Delete Data</a><br/>
<a href="addCustomer.jsp?operation=4">Add Customer</a><br/>
<a href="addCustomer.jsp?operation=5">Update Customer</a><br/>
<a href="login.jsp?operation=0">Log out</a><br/><br/><br/>
</div>

<%
}else{
	%><br/>Please
	<a href="login.jsp">Login</a>
	<%
}
%>
</div>
</body>
</html>