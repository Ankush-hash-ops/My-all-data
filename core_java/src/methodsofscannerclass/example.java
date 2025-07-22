package methodsofscannerclass;
import java.util.Scanner;

public class example {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String n=sc.next();
		System.out.println("enter age");
		int a=sc.nextInt();
		System.out.println("enter phone");
		long p=sc.nextLong();
		System.out.println("enter height");
		float h=sc.nextFloat();
		
		System.out.println("Name    :"+n);
		System.out.println("Age     :"+a);
		System.out.println("Phone   :"+p);
		System.out.println("height  :"+h);
		
	}

}
