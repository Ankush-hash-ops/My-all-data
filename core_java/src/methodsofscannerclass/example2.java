package methodsofscannerclass;
import java.util.Scanner;

public class example2 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String n=sc.next();
		System.out.println("Enter your age");
		int a=sc.nextInt();
		System.out.println("Enter your Gender");
		String g=sc.next();
		System.out.println("Enter your Account number");
		long An=sc.nextLong();
		System.out.println("Enter your PAN Number");
		char p=sc.next().charAt(0);
		System.out.println("Enter your Mobile Number");
		long m=sc.nextLong();
		
		
		System.out.println("Name    :" +n);
		System.out.println("Age     :" +a);
		System.out.println("Gender  :" +g);
		System.out.println("Account number:" +An);
		System.out.println("PAN     :" +p);
		System.out.println("Mobile Number:" +m);
		
	}
	

}
