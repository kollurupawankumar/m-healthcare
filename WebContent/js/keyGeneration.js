function keyfunction(){
	
	//alert("");
	
		var totalchars = "ABCDEFGHIJKLMNOP12345678910qrstuvwxyz";
		
		var key = "";
        
		for (var i=0; i < 6; i++) {
			var keygeneration = Math.floor(Math.random()*totalchars.length);
		
			key = key + totalchars.charAt(keygeneration);
		}
		//alert("key = "+key);
		document.getElementById("key").value=key;
		
	}