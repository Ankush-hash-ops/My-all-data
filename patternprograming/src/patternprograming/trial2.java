package patternprograming;
import java.util.Scanner;

public class trial2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("n");
		int n=sc.nextInt();
		int mid=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n||i<mid&&j<mid||i>mid&&j>mid||i>mid&&j<mid||j>mid&&i<mid)
				System.out.print("* ");
				else if(i==mid||j==mid)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
