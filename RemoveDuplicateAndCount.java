package org.test;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicateAndCount {
	public static void main(String[] args) {
		    String input = "hello world";
		    Set<Character> charSet = new HashSet<>();

		    // Loop through each character in the string
		    for (int i = 0; i < input.length(); i++) {
		      charSet.add(input.charAt(i));
		    }

		    System.out.println("Unique characters in the string: " + charSet);
		    System.out.println("Count of unique characters: " + charSet.size());
		  }
		
		
	}
	


