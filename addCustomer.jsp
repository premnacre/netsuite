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
<FORM METHOD="POST" ACTION="AddCustomerForm">
<%
String op=request.getParameter("operation");
Integer operation=20;
if(op!=null)
	operation=Integer.parseInt(op);
switch(operation){
case 4:
%>
<INPUT TYPE="hidden" NAME="operation" SIZE=20 value="addData">
<TABLE>
	<TR>
		<TD COLSPAN="3" ALIGN="LEFT">Enter Customer Info:</TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Customer Id:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="entityId" SIZE=20></TD>
	</TR>

	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Company Name:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="companyName" SIZE=20></TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Email:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="email" SIZE=20></TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Mobile No:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="mobilePhone" SIZE=20></TD>
	</TR>
</TABLE>
<BR/>Or<br/>Paste Customer data in Json Format Below!!!<br/>
<textarea rows="15" cols="120" name="custData">
	
</textarea><br/>
<INPUT TYPE="SUBMIT" VALUE="Add Customer"> <INPUT TYPE="RESET"
	VALUE="Clear">
	<%
	break;
	case 5:
	%>
	<INPUT TYPE="hidden" NAME="operation" SIZE=20 value="updateData">

<TABLE>
	<TR>
		<TD COLSPAN="3" ALIGN="LEFT">Update Customer Info:</TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Internal Id<sup>*</sup>:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="entityId" SIZE=20></TD>
	</TR>

	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Company Name:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="companyName" SIZE=20></TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Email:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="email" SIZE=20></TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Mobile No:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="mobilePhone" SIZE=20></TD>
	</TR>
</TABLE>
<BR>Or<br/>Paste Customer data in Json Format Below!!!<br/>
<textarea rows="15" cols="120" name="custData">
	
</textarea><br/>
<INPUT TYPE="SUBMIT" VALUE="Update"> <INPUT TYPE="RESET"
	VALUE="Clear">
	<%
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