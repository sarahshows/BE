package week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder result = new StringBuilder();
		int spaceIndex = 0;

		for (int i = 0; i < log.length(); i++) {
			result.append(log.charAt(i) + " ");

		}
		System.out.println(result);
	}

	@Override
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		int spaceIndex = 0;

		for (int i = 0; i < error.length(); i++) {
			result.append(error.charAt(i) + " ");
		}
		System.out.println("***ERROR: " + result.toString() + "***");
	}
}