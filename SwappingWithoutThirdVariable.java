package org.test;

public class SwappingWithoutThirdVariable {
	public static void main(String[] args) {
		int a=1111;
		int b=7777;
		System.out.println("Value of a before swapping:"+a);
		System.out.println("Value of b before swapping:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a after swapping:"+a);
		System.out.println("Value of b after swapping:"+b);
		
		
		
	}
}
