package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.

		printCustomMessage((s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println("");
		}, "backwards");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.

		printCustomMessage((s) -> {
			s.toLowerCase();
			int r = new Random().nextInt(s.length());
			for (int i = 0; i < s.length()/2; i++) {
				r = new Random().nextInt(s.length());
				s = s.substring(0, r) + s.substring(r, r + 1).toUpperCase() + s.substring(r+1);
			}
			System.out.println(s);
		}, "mixedcase");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		
		printCustomMessage((s) -> {
			char[] chars = new char[s.length()*2];
			for(int i = 0; i < s.length()*2-1; i+=2) {
				chars[i] = s.charAt(i/2);
			}
			for(int i = 1; i < chars.length; i+=2) {
				chars[i] = '.';
			}
			String s2 = "";
			for(int i = 0; i < chars.length; i++) {
				s2+=chars[i];
			}
			System.out.println(s2);
		}, "string");
		
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		
		printCustomMessage((s) -> {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
					s = s.substring(0, i) + s.substring(i+1);
				}
			}
			
			System.out.println(s);
		}, "no vowels");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
