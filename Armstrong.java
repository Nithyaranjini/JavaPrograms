package org.test;

public class Armstrong {
public static void main(String[] args) {
	int num=153,sum=0,temp=num;
	while(num>0) {
		int rem=num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
	}
	if(sum==temp) {
		System.out.println("Number is Armstrong Number");
	}
	else {
		System.out.println("Number is Not Armstrong Number");
	}
}}

