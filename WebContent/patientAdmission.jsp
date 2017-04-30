<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Medical Healthcare</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/keyGeneration.js"></script>
</head>

<body onload="keyfunction()">
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
  	
	<h5><center><font face="timesnewroman" color="Green" size="4">PATIENT DETAIL FORM</font></center></h5>
	<form action="patientDetailsServ" method="post">
	<fieldset>
	<table>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4" color="Green">Admission</font></strong></td>
	<td><select name="admis">
	<option name="Select Here" value="Select Here">Select</option>
	<option name="in" value="In-Patient">In-Patient</option>
	<option name="out" value="Out-Patient">Out-Patient</option></td>
	</select>
			</table>
		</fieldset>
		<center><input type="submit"  value="Submit" /></center>
	</form>
</div>
</body>
</html>
