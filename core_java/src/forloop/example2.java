package forloop;
import java.util.Scanner;

public class example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%10==8)
			{
				System.out.println(i);
			}
		}
		
	}

}
