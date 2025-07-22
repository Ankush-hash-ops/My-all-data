package forloop;

public class example1 {
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
			System.out.println(i);
		
		System.out.println("=======================");
		
		int sum=0;
		for(int j=7;j>=1;j--)
		{
			System.out.println(j);
			sum=sum+j;
		
		}
		System.out.println("sum is  :"+sum);
				
	}

}


