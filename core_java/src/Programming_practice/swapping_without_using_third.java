package Programming_practice;

public class swapping_without_using_third {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		System.out.println("before swapping a is "+a);
		System.out.println("before swapping b is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a is "+a);
		System.out.println("after swapping b is "+b);
		
	}

}
