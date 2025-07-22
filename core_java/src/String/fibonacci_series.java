package String;

public class fibonacci_series {
	public static void main(String[] args) {
//		int num = 10;
		int a = 0;
		int b = 1;
		System.out.println("fibonacci series");
	
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + "");

			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}
