//make form data into proper format
$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};



/* ================================================================= */
/*
 * JavaScript trim() function: Replace space ,/t with empty character.
 * Note: IE9 onwards , this function is inbuilt into JS engine.
 * Usage: str = str.trim()
 * @author: tulesh
 */
if (!String.prototype.trim) {
    String.prototype.trim = function() {
        return this.replace(/^\s+|\s+$/g, '');
    }
}

/*
 * Phone number validation
 */
function isPhoneNoValid(phoneNo) {
    var intPhoneNo = /^\+?[0-9-]+$/;
    return phoneNo.match(intPhoneNo);
}
/*
 * Email validation
 */
function isValidEmail(emailId) {
    var email = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-zA-Z]{2,6}(?:\.[a-zA-Z]{2})?)$/i;
    return emailId.match(email)
}


function validateDate(date){
	var isValidationFailed = false;
	
	// regular expression to match required date format
    var regExp = /^\d{2}\/\d{2}\/\d{4}$/;
    var currentDate = getCurrentDate("/");
    var splitDate = date.split('/');
    var date1 = new Date(date);  
    var date2 = new Date(currentDate);
   
    //to check date format
    if(date != '' && !date.match(regExp)) {
    	$("#contractValidation").html('').html('<pre> Invalid date format</pre>' +date);
		isValidationFailed = true;
    }else  if(splitDate[0] < 1 || splitDate[0] > 12) {
    	// month value between 1 and 12
    	$("#contractValidation").html('').html('<pre> Invalid value for month:</pre>' +splitDate[0]);
		isValidationFailed = true;
    }else if(splitDate[1] < 1 || splitDate[1] > 31) {
        // day value between 1 and 31
    	$("#contractValidation").html('').html('<pre> Invalid value for day:</pre>' +splitDate[1]);
		isValidationFailed = true;
    }else if(date1<date2){
        //comprasion b/w current date & entered date
    	$("#contractValidation").html('').html('<pre> Entered date should not be less than </pre> current  date');
		isValidationFailed = true;    	
    }else  if(splitDate[0]==02){
        //leap year check
    	var lyear = false; 
    	if ( (!(splitDate[2]  % 4) && splitDate[2]  % 100) || !(splitDate[2]  % 400))   {
    		 lyear = true; 
    	}
    	if ((lyear==false) && (splitDate[1]>=29)){
    		$("#contractValidation").html('').html('<pre> Invalid date : </pre>' +date);
    		isValidationFailed = true;    		
    	}
    	if ((lyear==true) && (splitDate[1]>29)){  
    		$("#contractValidation").html('').html('<pre> Invalid date : </pre>' +date);
    		isValidationFailed = true;    		  
    	}    	
    }
    if(isValidationFailed){
		$("#modal").lightbox_me({centered: true, onLoad: function() {
				$("#modal").find("input:first").focus();
		}});
		return false;
	}else{
		return true;
	}
}


function getCurrentDate(format){
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; //January is 0!

	var yyyy = today.getFullYear();
	if(dd<10){
		dd='0'+dd
	}
	if(mm<10){
		mm='0'+mm
	}
	return today = mm+format+dd+format+yyyy;
}
/*
 *  Function to check for special characters in string
 *  returns true if it contains special else false
 */
function containsSpecialCharacters(str) {
    return  /[~`!#$%\^&*+=\-\[\]\\';,/{}|\\":<>\?]/g.test(str);
}

function validateUserName(str) {
    return  /[~`!#$%\^&*+=\[\]\\';,/{}|\\":<>\?\"\^|]/g.test(str);
}
/*
 * Disable dragging of all links
 */

try {
    if (jQuery) {
    	jQuery('a').attr('draggable', false);
        //for supporting mozilla browser
        jQuery('a').mousedown(function(){
        	return false;
        
        });
    }
} catch (e) {
}

//close the modal
$("#lightbox_close").on('click', function(e) {
    $("#modal").trigger('close');
  
  });

