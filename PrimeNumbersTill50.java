package org.test;

public class PrimeNumbersTill50 {
	public static void main(String[] args) {
		
		 int n = 50;
         System.out.println("The prime numbers between 1 and " + n + " are:");
           for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
           for (int j = 2; j < i; j++) {
             if (i % j == 0) {
                 isPrime = false;
                 break;
             }
         }
         if (isPrime) {
             System.out.print(i + " ");
         }
     }
     System.out.println();
 }


}
