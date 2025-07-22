package Programming_practice;

import java.util.Scanner;

public class get_primeNumber {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n =sc.nextInt();
		for(int i=2;i<=50;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
		
		
	}
	
	

	public static boolean isPrime(int i) {
		
		if(i<=1) return false;
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				return false;
			}
		}
		
		
		
		
		 return true;
	}
	
	
	
	
	
	
	
	
	

}
