package Programming_practice;

import java.util.Scanner;

public class fibonacci_series {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the digit upto which you want fibonacci series");
//		int n=sc.nextInt();
//		
//		int a=0;
//		int b=1;
//		for(int i=1 ;i<=n;i++) {
//			
//			System.out.println(a+"");
//			 int sum=a+b;
//			   a=b;
//			   b=sum;
//		}
//	  
//		
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		
		
		
		for(int i=0;i<=n;i++) {
			System.out.println(a+"");
			int sum=a+b;
			a=b;
			b=sum;
			
			
		}
		

		
		
	}

}
