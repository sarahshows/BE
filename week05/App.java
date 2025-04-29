package week05;

public class App {

	static Logger logger;
	
	public static void main(String[] args) {
	
		
	Logger logger = new AsteriskLogger();
	
			System.out.println("AsteriskLogger Logger:");
	
			logger.log("ALOHA");
			logger.error("Elevator");
	
			
	Logger logger2 = new SpacedLogger();   
	System.out.println("SpacedLogger Logger:");
			logger2.log("GREAT");
			logger2.error("SERVICE");
	}
	
}
