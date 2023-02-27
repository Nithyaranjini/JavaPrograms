package org.test;

public class ReverseNumber {
	public static void main(String[] args) {
		int a=98765432;
		int rev=0;
		while(a>0) {
			int num=a%10;
			rev=(rev*10)+num;
			a=a/10;
		}
		System.out.println(rev);		
			}
		}
	


