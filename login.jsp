<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Java With Netsuite</title>
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
<div align="center" ><hr width="55%"/>
<FORM METHOD="POST" ACTION="LoginForm" >
<%
String op=request.getParameter("operation");
Integer operation=1;
if(op!=null)
	operation=Integer.parseInt(op);
switch(operation){
case 0:
%> <INPUT TYPE="hidden" NAME="operation" value="logout"> <INPUT
	TYPE="SUBMIT" VALUE="Log out"> <%
break;
default:
%>
<TABLE>
	<TR>
		<TD COLSPAN="3" ALIGN="LEFT">Provide Login Info:</TD>
	</TR>
	
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="email" SIZE=20></TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
		<TD ALIGN="left"><INPUT TYPE="password" NAME="password" SIZE=20></TD>
	</TR>

	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">account:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="account" SIZE=20></TD>
	</TR>

</TABLE>
<BR>

<INPUT TYPE="hidden" NAME="operation" value="login"> <INPUT
	TYPE="SUBMIT" VALUE="Log In"> <INPUT TYPE="RESET" VALUE="Clear">
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