package patternprograming;

import java.util.Scanner;

public class trail {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("n");
	int n=sc.nextInt();
	int space=n/2;
	int mid=n/2+1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=mid;j++)
		{	
		if(j<=space)
		{
			System.out.print("  ");
		}
		else
			System.out.print("* ");
		}
		if(i<mid)
		{
			space--; 
		}
		else
			space++;
			

	
	
    
     System.out.println();   


}

	}
}
