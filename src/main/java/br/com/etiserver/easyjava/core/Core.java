package br.com.etiserver.easyjava.core;

import java.util.Scanner;

/**
 * Class that contains core basic methods
 * @author Leonardo de Amorim Rosa
 *
 */
public class Core {
	
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * Print a text on console output
	 * @param text The text to be printed
	 */
	public String puts(String text) {
		System.out.print(text);
		return text;
	}

	/**
	 * Print a text on console output replacing arguments marked with '{numer_position}'
	 * Example:
	 * 	puts("Your name is {0} and your age is {1}", "easy", 12)
	 * 
	 * @param text The text to be printed
	 * @param args The arguments to be replaced in text
	 */
	public String puts(String text, String... args) {
		if (args != null) {
			for (int index = 0; index < args.length; index++) {
				text = text.replace("{"+index+"}", args[index]);
			}
		}
		System.out.print(text);
		return text;
	}
	
	/**
	 * Wait a string value informed by user in console
	 * @param label The label that identificates the required information  
	 * @return The value typed by user
	 */
	public String gets(String label) {
		puts(label);
		return scanner.nextLine();
	}

	/**
	 * Wait a Integer value informed by user in console
	 * @param label The label that identificates the required information  
	 * @return The value typed by user
	 */
	public int geti(String label) {
		puts(label);
		return scanner.nextInt();
	}
	
	/**
	 * Wait a Double value informed by user in console
	 * @param label The label that identificates the required information  
	 * @return The value typed by user
	 */	
	public double getf(String label) {
		puts(label);
		return scanner.nextDouble();
	}
	
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}
