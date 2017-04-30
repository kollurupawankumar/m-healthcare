<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Medical Healthcare</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/keyGeneration.js"></script>
</head>

<body >
<div id="topPan"><a href="index.html"><img src="images/download.jpg" title="Medical Healthcare" alt="Green Solutions" width="204" height="57" border="0"/></a>
	<ul>
		<li><a href="Home.html">Home</a></li>
		<li><a href="patientLogin.jsp" >Login</a></li>
		
		
	</ul>
</div>

<div id="headerPan">
  <div id="headerPanleft">
  	    <div id="ourblog">
			<h2>Our blog</h2>
			<p>Desktop publishing</p>
			<a href="#">&nbsp;</a>
		</div>
        <div id="possib">
			<h2>possibilities</h2>
			<p>Desktop publishing</p>
			<a href="#">&nbsp;</a>
		</div>
		<div id="solution">
			<h2>Solutions</h2>
			<p>Desktop publishing</p>
			<a href="#">&nbsp;</a>
		</div>
  </div>
	
	<h1>best Fresh Solution</h1>
</div>
<div id="bodyPan">
  
  <div id="rightPan">
  	<div id="rightbodyPan">
  	
	<h5><center><font face="timesnewroman" color="Green" size="4">OUT-PATIENT FORM</font></center></h5>
	<form action="OutPatientServlet" method="post">
	<fieldset>
	<table>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">PatientName</font></strong></td>
	<td><input type="text" name="name" class="text" value="<%=session.getAttribute("Patient_Name")%>"/></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">BedNo</font></strong></td>
	<td><input type="text" name="bed" class="text"/></td>
	</tr>
	<div>
	<strong><label for="payment-Type"><font face="TimesNewRoman" size="4">Payment Type</strong></font></label>
	<input type="radio" name="pay" value="Creditcard"/>CreditCard
	<input type="radio" name="pay" value="Cash"/>Cash
	</div>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">HomeAddress</font></strong></td>
	<td><textarea name="address" rows="4" cols="40" placeholder="Address here..."></textarea></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">Contact No</font></strong></td>
	<td><input type="text" name="cont" class="text"/></td>
	</tr>
		</table>
		</fieldset>
		<center><input type="submit" id="sub" value="save"/></center>
	</form>
	
</div>
</body>
</html>
