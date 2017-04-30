<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Medical Healthcare</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/keyGeneration.js"></script>
</head>
<%!String s=null;String s1=null;
%>
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
  	<% s=(String)session.getAttribute("pName");
  	 s1=(String)session.getAttribute("PatientMail");
  	if(s==null && s1==null)
  	{
  		s="";
  		s1="";
  	}
  	%>
  	
	<h5><center><font face="timesnewroman" color="Green" size="4">PATIENT LOGIN</font></center></h5>
	<form action="LoginServlet" method="post">
	<fieldset>
	<table>
	<tr>
	<td><strong><font face="TimesNewRoman" color="Green" size="4">Patient-Name</font></strong></td>
	<td><input type="text" name="name" class="text"  value="<%=s%>"/></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" color="Green" size="4">Patient-Mail</font></strong></td>
	<td><input type="text" name="mail" class="text"  value="<%=s1%>" /></td>
	</tr>
	<tr>
	<td><strong><font face="TimesNewRoman" size="4"color="Green">Password</font></strong></td>
	<td><input type="text" name="passw" class="text"/></td>
	</tr>
	</table>
	</fieldset>
	<center><input type="submit"  value="Submit" /></center>
	</form>
</div>
</body>
</html>
