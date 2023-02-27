package org.test;

public class SumOfDigits {
	public static void main(String[] args) {
		int a=14112000;
		int sum=0;
		while(a>0) {
			int num=a%10;
			sum=sum+num;
			a=a/10;
		}
		System.out.println(sum);
	}

}
