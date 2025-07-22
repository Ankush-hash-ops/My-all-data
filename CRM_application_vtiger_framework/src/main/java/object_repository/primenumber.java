package object_repository;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter upto which you want");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i+"");
			}
			
		}
		
	}	
	
	
	
	public static boolean isPrime(int i) {
		
		if(i<=1) return false;
		
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) return false;
		}
		return true;
	}
	
		
	

}

