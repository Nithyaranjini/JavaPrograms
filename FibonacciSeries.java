package org.test;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=20,firstterm=0,secondterm=1;
		System.out.println("Fibonacci series till " +n+ "terms:");
		for(int i=1;i<=n;++i) {
			System.out.println(firstterm+ " ");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}
	}

}
