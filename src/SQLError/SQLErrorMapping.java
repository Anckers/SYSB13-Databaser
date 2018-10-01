package SQLError;

public class SQLErrorMapping {
	
	public static String getMessageForErrorCode(int errorCode, String prefix) {
		String code = "unknown error";
		
		//Primary Key already excists
		if (errorCode == 2627) {
			code = prefix + " is already registered";
		}
		//Om personen/kursen ej finns och man f�rs�ker l�gga till den i Studied/Studies
		if(errorCode == 547) {
			if(prefix == "add course") {
				code = "Course is only allowed a maximum of 45 credits";
			}else {
				code = prefix + "Does not excist";
			}
		}
		//Login failed
		if(errorCode == 18456) {
			code = "Login to database failed";
		}
		//Too long variable
		if(errorCode == 8152) {
			code = "To long variable";
		}
		if(errorCode  == 0) {
			code = prefix + "Has already taken the course";
		}
		return code;
	}
}
