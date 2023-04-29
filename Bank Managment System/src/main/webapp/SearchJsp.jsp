<%@page import="bank.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table {
	border: 3px;
	border-color: aqua;
	background: green;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SearchController">
		Enter Registration Number<input type="text" name="regno"> <input
			type="submit" value="Search">
	</form>
	<%!Register r;%>

	<%
	if(!session.isNew())
	{
		r=(Register)session.getAttribute("data");
%>
	<table>
		<tr>
			<td><%=r.getRegNo() %></td>
			<td><%=r.getCustName()%></td>
			<td><%=r.getAccBal()%></td>
		</tr>
	</table>
	<%} %>



</body>
</html>