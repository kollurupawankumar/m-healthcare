<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="BpFormServlet" method="post">
<fieldset>
<legend>Patient Details</legend>
<table>
<tr>
<td><font color="Green">Patient Name:</font></td>
<td><input type="text" name="name" readonly="true" value="<%=session.getAttribute("Patient_Name")%>"/></td>
</tr>
<div>
<label for="BP-Range"><font color="Green">BP-Range:</font></label><br>
<input type="radio" name="bp" value="Low-BP"/>Low-BP
<input type="radio" name="bp" value="Normal" />Normal
<input type="radio" name="bp" value="High-BP"/>High-BP
</div>

<div>
<label for="Sugar Level"><font color="Green">Sugar level:</font></label><br>
<input type="radio" name="sugar" value="Low" />Low-BP
<input type="radio" name="sugar" value="Normal" />Normal
<input type="radio" name="sugar" value="High"/>High-BP
</div>

<div>
<label for="Blood Test"><font color="Green">Blood Test:</font></label><br>
<input type="radio" name="blood" value="Low"/>Diabetes
<input type="radio" name="blood" value="Normal"/>Cholestrol
<input type="radio" name="blood" value="High"/>Kidney(or)Liver
</div>
<tr>
<td><font color="Green">Urine Level:</font></td>
<td><input type="text" name="urine" class="text"/></td>
</tr>
<tr>
<td><font color="Green">Weight</font></td>
<td><input type="text" name="wgt" class="text"/></td>
</tr>
<td><input type="submit" value="submit"></td>
</form>
</table>
</fieldset>
</body>
</html>