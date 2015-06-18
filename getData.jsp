<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
<a href="Method.jsp">All Method</a>
<FORM METHOD="POST" ACTION="GetCustomerData">
<%
String op=request.getParameter("operation");
Integer operation=20;
if(op!=null)
	operation=Integer.parseInt(op);
switch(operation){
case 2:
%>
<INPUT TYPE="hidden" NAME="operation"  value="search">
<TABLE>
	<TR>
		<TD COLSPAN="3" ALIGN="LEFT">Get customer Data by Id</TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Enter Customer Id:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="id" SIZE=20></TD>
	</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Get"> <INPUT TYPE="RESET"
	VALUE="Clear"> <%
break;
case 3:
	%> <INPUT TYPE="hidden" NAME="operation" SIZE=20 value="delete">
<TABLE>
	<TR>
		<TD COLSPAN="3" ALIGN="LEFT">Delete customer Data by Id</TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Enter Customer Id:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="id" SIZE=20></TD>
	</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Delete"> <INPUT TYPE="RESET"
	VALUE="Clear"> <%
	break;
	default:
		%>
		<br/>
			Please	<a href="login.jsp">Login</a>
		<%
	}
	%>
</FORM>
</div>
  <div id="footer" align="center">
        <p class="text-muted">&#169; 2014 PopcornApps. All rights reserved</p>
      </div>
</body>
</html>