package forloop;
import java.util.Scanner;

public class table {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			sum=sum+(n*i);
			
	    }
		System.out.println("total sum of the table is  :"+sum);
	}

}
