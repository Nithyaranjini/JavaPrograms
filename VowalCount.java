package org.test;

public class VowalCount {
	public static void main(String[] args) {
		String word="education";
		int count=0;
		for(int i=0;i<word.length();i++) 
			{
			char vowal=word.charAt(i)	;
			switch(vowal)
			{
			case 'a':
			case 'e':
			case 'i':	
			case 'o':
			case 'u':
			count++;
					
			 }	
			}
		System.out.println("Count of vowals: "+ count);
	}}


