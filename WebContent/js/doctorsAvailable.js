function doctorsAction() {
	var doc=document.getElementById("doc").value;
	//alert(doc);
	var form="";
	if(doc=='Emergency'){
		form='emergencyDetails.jsp';
		var emergency=window.open(form,"heartwindow","width=1024,height=700");
	}
	else if(doc=='BPDoctor'){
		form='bpDoctors.jsp';
				var heartwindow=window.open(form,"heartwindow","width=500,height=400");

		
	}else if (doc=='GeneralDoctor') {
		form='generalDoctor.jsp';
		var heartwindow=window.open(form,"heartwindow","width=400,height=400");
	}
	else if (doc=='Cardiologist'){
		
		form='cardiologist.jsp';
		var heartwindow=window.open(form,"heartwindow","width=400,height=400");
		
	}
}