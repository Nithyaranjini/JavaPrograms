package org.test;

public class SwappingUsingThirdVariable {
	public static void main(String[] args) {
		int a=444;
		int b=777;
		System.out.println("Value of a before swapping:"+a);
		System.out.println("Value of b before swapping:"+b);
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a after swapping:"+a);
		System.out.println("Value of b after swapping:"+b);
		
		
	}

}
