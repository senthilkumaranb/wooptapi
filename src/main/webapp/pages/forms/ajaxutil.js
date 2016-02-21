/**
 * Ajax post request
 * @param url
 * @param params
 * @param callbackMethod
 */
function ajaxPost(url, params, callbackMethod) {
	$.ajax({
		type : "POST",
		url : url,
		data : params,
		datatype: 'json',
		contentType: "application/json; charset=utf-8",
		async:false,
		cache:false,
		success : function(response) {
			callbackMethod(response);
		},
		error : function(jqXHR, exception) {
			if (exception === 'parsererror') {
				alert('Requested JSON parse failed.' + " "
						+ jqXHR.responseText);
			} else if (exception === 'abort') {
				alert('Ajax request aborted.');
			} else {
				alert('Uncaught Error.\n' + jqXHR.responseText);
			}
		},
		statusCode: {
			0: function () {window.location = "/unified-system-portal";},
            404: function () { alert('Requested page not found. [404]');},
            408: function () { alert('Request Time-out. [408]');},             
            410: function () {var data = jQuery.parseJSON(jqXHR.responseText);
							   alert(data.errorCode+" : "+data.errorMessage);},
            500: function () { alert('Internal Server Error [500].');},
            501: function () { alert("Not Implemented [501]");},
            502: function () { alert("Bad Gateway [502]"); },
            503: function () { alert("Service Unavailable [503]");}
        }
	});
}

/**
 * ajax get request
 * @param url
 * @param params
 * @param callbackMethod
 */
function ajaxGet(url, params, callbackMethod) {
	$.ajax({
		type : "GET",
		url : url,
		data : params,
		datatype: 'json',
		contentType: "application/json; charset=utf-8",
		async:false,
		cache:false,
		success : function(response) {
			callbackMethod(response);
		},
		error : function(jqXHR, exception) {
	   		   if(jqXHR.status === 410){
					var data = jQuery.parseJSON(jqXHR.responseText);
					alert(data.errorCode+" : "+data.errorMessage);
				}else if (jqXHR.status === 0) {					
					window.location = "/unified-system-portal";
				} else if (jqXHR.status == 404) {
					alert('Requested page not found. [404]');
				} else if (jqXHR.status == 500) {
					alert('Internal Server Error [500].');
				} else if (exception === 'parsererror') {
					alert('Requested JSON parse failed.' + " "
							+ jqXHR.responseText);
				} else if (exception === 'timeout') {
					alert('Time out error.');
				} else if (exception === 'abort') {
					alert('Ajax request aborted.');
				} else {
					alert('Uncaught Error.\n' + jqXHR.responseText);
				}
			}
	});
}