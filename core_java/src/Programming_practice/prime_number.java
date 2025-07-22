package Programming_practice;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		
		boolean prime=true;
		for(int i=2;i<n;i++) {
			if(n%2==0) {
				prime=false;
				break;
				
				
			}
			
			
		}
		System.out.println(prime);
	}

}
