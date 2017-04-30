<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="generalpatientServlet" method="post">
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
<label for="Fever"><font color="Green">Fever:</font></label><br>
<input type="checkbox" name="fever" value="Normal"/>Yes
<input type="checkbox" name="fever" value="Viral-Fever"/>No
</div>

<div>
<label for="Cold"><font color="Green">Cold:</font></label><br>
<input type="radio" name="cold" value="Normal">Normal
<input type="radio" name="cold" value="heavy">Heavy
</div>
<div>
<label for="headache"><font color="Green">Headache:</font></label><br>
<input type="checkbox" name="head" value="Yes"/>Yes
<input type="checkbox" name="head" value="No"/>No
</div>
<tr>
<td><font color="Green">Weight:</font></td>
<td><input type="text" name="weight" class="text"/></td>
</tr><br>
<td><input type="submit" value="submit"></td>
</form>
</body>
</html>