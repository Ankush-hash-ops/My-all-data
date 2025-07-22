package some_basic;

import java.util.Scanner;

public class swastik {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("n");
		int n=sc.nextInt();
		int mid=n/2+1;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(n%2==0) {
					mid=n/2;
				}
				else
					mid=n/2+1;
				
				if(i==mid||j==mid||i==1&&j>mid||j==n&&i>mid||i==n&&j<mid||j==1&&i<mid)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			
			}
			System.out.println();
		}
	}

}
