	
function nameValidation(){
	//alert("hi");
	 var pname = document.getElementById("name").value;
		 if(pname.length==0)
		 {
		document.getElementById("name").focus();
		alert("Enter Patient name");
		return false;
	}
	
}

function mobileValidation(){
	var mno=document.getElementById("mobno").value;
	 if(isNaN(mno)){
		 alert("Plz Enter Valid Mobile Number");
		 document.getElementById("mobno").focus();
		 return false;
	 }
	 else if (mno.length>10||mno.length<10) {
		
		 alert("Plz Enter 10 digits mob no");
		 document.getElementById("mobno").focus();
		 return false;
	}
		}

function addressValidation(){
	//alert("hi");
	 var padd = document.getElementById("address").value;
		 if(padd.length==0)
		 {
		document.getElementById("address").focus();
		alert("Enter the address");
		return false;
	}
	
}

function ageValidation(){
	alert("hi");
	 var page = document.getElementById("age").value;
		 if(page.length==0)
		 {
		document.getElementById("age").focus();
		alert("Enter the age");
		return false;
	}
	
}



function overall_Validation() {
	
	if(nameValidation()==false &&mobileValidation()==false &&addressValidation()==false && ageValidation()==false)
	{
		alert("Enter the All Values");
		document.getElementById("sub").focus();
		return false;
		}
	else{
		alert("Verified");
		return true;

	}
}