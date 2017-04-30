<%@page import="Connection.MysqlConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setContentType("text/html");
Connection   conn=MysqlConnection.getConnection();
PreparedStatement ps=conn.prepareStatement("SELECT * FROM psmpa.patientregisteration p where Password='"+request.getParameter("key")+"' and Patient_Name='"+request.getParameter("name")+"'");
System.out.println("SELECT * FROM psmpa.patientregisteration p where Password='"+request.getParameter("key")+"' and Patient_Name='"+request.getParameter("name")+"'");
ResultSet set=ps.executeQuery();
String key="";
if(set.next()){
key=set.getString(6).trim();
}
if(key.equals(request.getParameter("key"))){
%>
<p id="msg">valid key</p>
<%}else{ %>
<p id="msg">invalid key</p>
<%} %>
</body>
<form action="getAllPatientServlet" id="myForm" method="post">
<input name="name" id="name" type="hidden">
</form>
</html>