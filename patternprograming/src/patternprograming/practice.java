package patternprograming;

import java.util.Scanner;

public class practice {
	
	public static void Practice1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
	public static void Practice2() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				
				System.out.print("* ");
				
				
			}
			System.out.println();
		}
		
		
	}
	

	public static void main(String[] args) {
		//practice.Practice1();
		practice.Practice2();
	}
}
