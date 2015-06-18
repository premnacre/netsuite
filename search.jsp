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
<FORM METHOD="POST" ACTION="SearchForm">
<TABLE>
	<TR>
		<TD COLSPAN="3" ALIGN="LEFT">Search Page</TD>
	</TR>
	<TR>
		<TD WIDTH="5%"></TD>
		<TD COLSPAN="2" ALIGN="LEFT">Search by Name:</TD>
		<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="searchData" SIZE=20></TD>
	</TR>
	</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Search"> <INPUT TYPE="RESET"
	VALUE="Clear"></FORM>
	</div>
	
  <div id="footer" align="center">
        <p class="text-muted">&#169; 2014 PopcornApps. All rights reserved</p>
      </div>
</body>
</html>