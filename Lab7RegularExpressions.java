//Lauren Shindo

package regex;
import java.util.Scanner;

public class Lab7RegularExpressions {

	/**
	 * Recognize invalid inputs using regular expressions.
	 */
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// calls validation method and prints result		
		System.out.println(getStringMatchingRegex(scnr, "Please enter a valid name, beginning with a capital letter: ", "[A-Z][a-z]{1,30}"));
		
		
		// calls validation method with arguments for email and prints result		
		System.out.println(getStringMatchingRegex(scnr, "Please enter a valid email: ", "[\\w]{5,30}@[\\w]{5,10}\\.[\\w]{2,3}"));
		
		// calls validation method with arguments for phone numbers and prints result		
		System.out.println(getStringMatchingRegex(scnr, "Please enter a valid phone number (###-###-####): ", "[\\d]{3}-[\\d]{3}-[\\d]{4}"));
				
		// calls validation method with arguments for date and prints result	
		//this needs to be run through a loop with a date parser to ensure month and day comdination is valid
		System.out.println(getStringMatchingRegex(scnr, "Please enter a valid date (MM/DD/YYYY):", "[\\d]{2}/[\\d]{2}/[\\d]{4}"));
		
		
		
		scnr.close();
	}
	
	
	/**
	 * Gets a string.
	 */
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}
	
	
	
	/**
	 * Gets a string of input from the user that must match the given regex.
	 */
	public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);
			
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Sorry! " + input + " is not valid.");
				isValid = false;
			}
			
		} while (!isValid);
		return input;
	}

}
