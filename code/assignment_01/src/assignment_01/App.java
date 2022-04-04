package assignment_01;

import ignore.TestingUtils;

public class App {
	
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	public static String middleThree(String str) {
		String result = str;
		int pos1 ;
		int pos2 ;
		
		
		if (result.length() < 3 ) {
			
			return result;
			
		} else if ((result.length() + 1) % 2 == 1) {			
			   
		  pos1 = ((result.length() + 1) / 2) - 1;
		  pos2 = ((result.length() + 1) / 2) + 1;
		  return result.substring(pos1, pos2);
		}
			
}

	
	
	
	
	
	
	
//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
}
