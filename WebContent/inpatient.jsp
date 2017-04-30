<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Medical Healthcare</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/action.js"></script>

</head>
<body>
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
  	
	<h5><center><font face="timesnewroman" color="Green" size="4">IN-PATIENT FORM</font></center></h5>
	<form target="_blank" action="" id="myForm">
	<fieldset>
	<table>
	

	<tr><td><strong><font face="TimesNewRoman" size="4">Patient-Name</font></strong></td><td><input type="text" name="name"  readonly="true" class="text" value="<%=session.getAttribute("Patient_Name")%>"/>
	<%-- <input type="hidden" id="sessionFname" value="<%=session.getAttribute("Patient_Name")%>"> --%></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">Disease Type</font></strong></td>
	<td><select name="disease" id="dis" onchange="changeAction()">
	<option name="disease" value="Select">Select</option>
	<option name="Bp" value="Blood Pressure">Blood Pressure</option>
	<option name="general" value="General">General</option>
	<option name="heart" value="Heart">Heart</option>
	</select></td>
	</tr>
		</table>
		</fieldset>
		<center><!-- <input type="submit"  id="sub" value="submit" onclick="return mywindow()"/> --></center>
	</form>
</div>
</body>
</html>
