package week05;


public class AsteriskLogger implements Logger {
	
	public static void main(String[] args) {

	
	}  //End of Main


	//Will return *** before and after the log string resulting in ***word***
	public void log(String log) {
		System.out.println("***" + log + "***");
	}
	
	
	//Will return each character in a string seperated by a space ie HELLO  becomes H E L L O
	public void error(String error) {
		String box = "";
		for (int i = 0; i < error.length() + 13; i++) {
			box += "*";
		}
			
		System.out.println(box);
		System.out.println("***Error: " + error + "***");
		System.out.println(box);
	}
	
			
}