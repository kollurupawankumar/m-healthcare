<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Medical Healthcare</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/keyGeneration.js"></script>
<script type="text/javascript" src="js/patientRegisteration_Validation.js"></script>
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
  <div id="leftPan">
    <div id="leftmemberPan">
	<h2>member <span>login</span></h2>
	<form name="login" id="login" action="" method="post">
	<label>Your Name</label>
	  <input type="text" name="textfield" />
	  <label class="emailpadding">Email ID</label>
	   <input class="fieldpadding" type="text" name="textfield" />
	   <div id="leftPango"><p class="textposition"><a href="patientregister.html">Register now</a></p><input type="submit" class="gobutton" value="Go" />
	   </div>
	</form>
	</div>
	<h3>More tips</h3>
	</div>
	
  <div id="rightPan">
  	<div id="rightbodyPan">
  	
	<h5><center><font face="timesnewroman" color="Green" size="4">REGISTERATION FORM</font></center></h5>
	<form action="patientRegServlet" method="post">
	<fieldset>
	<table>
	<tr>
	<td>
	<html lang="en">
<head>
<meta charset="utf-8">
<title>jQuery UI Datepicker - Default functionality</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>
</head>
<body>
										<tr>
											<td><strong><font face="TimesNewRoman" size="4">RegisterDate</font></strong></td>
											<td><input type="text" id="datepicker" class="text"
												name="date" /></td>
										</tr>
</body>
</html>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">Patient Name</font></strong></td>
	<td><select name="Gender" id="gen" />
	<option name="Gender" value="Select">Title</option>
	<option name="mister" value="Mr">Mr</option>
	<option name="misses" value="Mrs">Mrs</option>
	<option name="miss" value="Miss">Miss</option>
	</select><input type="text" name="name" class="text" id="name" onclick="return nameValidation()"/></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">Age</font></strong></td>
	<td><input type="text" name="age" class="text" id="age" onclick="return ageValidation()"/></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">HomeAddress</font></strong></td>
	<td><textarea name="address" rows="4" cols="40" placeholder="Address here..." id="address" onclick="return addressValidation() "></textarea></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">Mail</font></strong></td>
	<td><input type="text" name="mail" class="text" id="mail"/></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">Password</font></strong></td>
	<td><input type="text" name="passw" class="text" id="key" readonly="true"/></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4">Contact No</font></strong></td>
	<td><input type="text" name="cont" class="text" id="mobno"  onclick="return mobileValidation()"/></td>
	</tr>
		</table>
		</fieldset>
		<center><input type="submit"  value="save" id="sub" onclick="return overall_Validation()" /></center>
	</form>
</div>
</body>
</html>
