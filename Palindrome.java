package org.test;

public class Palindrome {
	public static void main(String[] args) {
		String s1="Malayalam";
		String rev=" ";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		if(s1.equals(rev)){
			System.out.println("Given String is Palindrome");
		}
		else
			System.out.println("Given String is not Palindrome");
	}

}
