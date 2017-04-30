$(document).ready(function() {
	$('a').click(function(e) {
		e.preventDefault();
		var a_class = $(this).attr('class');
		if (a_class == 'insideTable') {
			var element = $(this);
			var key = prompt('Enter the Key');
			var value = 'name=' + element.attr('id');
			$.ajax({
				url : "getAllPatientServlet.jsp?key=" + key,
				//type: "post",
				data : value,
				cache : false,
				success : function(data) {
					//alert(data);
					$('#msg_Display').html(data).hide();
					var result = $('#msg').text();
					//alert(result);
					if (result == 'valid key') {
						//$('#name').attr('value',element.attr('id'));
					//	$('#yForm').submit();
						$.ajax({
							url : "getAllgeneralPatientServlet?key=" + key,
							type: "post",
							data : value,
							cache : false,
							success : function(data) {
							
							$('#yes').text('');
							//alert(data);
								$('#yes').html(data);
								
							}
							});
					} else if (result == 'invalid key') {
						//e.preventDefault();
						alert("enter correct key");
						element.focus();
						return false;
					}
				}
			});
		}
	});
});