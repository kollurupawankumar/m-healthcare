function changeAction() {
	var dis=document.getElementById("dis").value;
	alert(dis);
	var form="";
	if(dis=='Emergency'){
		
		form='emergencyDetails.jsp';
		var emergency=window.open(form, "heartwindow", "width=300, height=400");
	}
	else if(dis=='Blood Pressure'){
		form='bpPatient.jsp';
				var heartwindow=window.open(form,"heartwindow","width=300,height=400");

		
	}else if (dis=='General') {
		form='generalPatient.jsp';
		var heartwindow=window.open(form,"heartwindow","width=300,height=400");
	}
	else if (dis=='Heart'){
		
		form='heartPatient.jsp';
		var heartwindow=window.open(form,"heartwindow","width=300,height=400");
		
	}
	/*else {
		form.action='inpatient.jsp';
	}*/
}