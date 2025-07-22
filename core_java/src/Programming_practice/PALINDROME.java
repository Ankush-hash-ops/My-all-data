package Programming_practice;

import java.util.Scanner;

public class PALINDROME {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter ");
//		String n=sc.nextLine();
//		String reverse="";
//		
//		for(int i=0;i<n.length();i++) {
//			reverse=n.charAt(i)+reverse;
//			
//		}
////		System.out.println(reverse);
//		if(reverse.equalsIgnoreCase(n)) {
//			System.out.println("given string is palindrome");
//		}
//		else
//			System.out.println("given String is not a palindrome");
//		
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ");
		String n = sc.nextLine();
		String reverse = "";
		int a=n.length()-1;
		for(int i=a;i>=0;i--) {
			reverse =reverse+n.charAt(i);
			
		}
		System.out.println(reverse);
		
	

}
}
	
