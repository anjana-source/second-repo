package inheritance;

import java.util.Scanner;

public class StringPalin {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String normal = input.toLowerCase();

	        String reversed = new StringBuilder(normal).reverse().toString();

	       
	        if (normal.equals(reversed)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        sc.close();
	   
	}

}
