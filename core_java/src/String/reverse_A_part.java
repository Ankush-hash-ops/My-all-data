package String;

public class reverse_A_part {
	public static void main(String[] args) {
		String input="my name is ankush";
		String target="ankush";
		String revTarget="";
		
		String reverseTarget=new StringBuilder(target).reverse().toString();
//		for(int i=0;i<target.length();i++) {
//			revTarget=target.charAt(i)+revTarget;
//		}
//		System.out.println(revTarget);
		
		String result=input.replace(target, reverseTarget);
		System.out.println(result);
		
		
		
		int x=40;
		int y=20;
		
		System.out.println("Before Swaping");
		System.out.println("value of x is"+x);
		System.out.println("value of y is"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("after swapping");
		System.out.println("value of x is"+x);
		System.out.println("value of y is"+y);
		
		
		
	}

}
