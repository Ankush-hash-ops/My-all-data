package number;

public class Swapping {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		 System.out.println("before swapping");
		 System.out.println("value of x is"+x);
		 System.out.println("value of y is"+y);
		 
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 
		 System.out.println("After swapping");
		 System.out.println("value of x is"+x);
		 System.out.println("value of y is"+y);
		 
		 

			String str="my name is ankush";
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev=rev+str.charAt(i);
				
			}
			System.out.println(rev);
	}
	
	
	
	

}
