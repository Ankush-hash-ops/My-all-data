package variable_shadowing;

public class fruit {
	static int x=48;
	public static void test()
	{
		System.out.println("this is test method");
		int x=60;
		System.out.println(" local x is :" +x);
		System.out.println("static x ix :" +fruit.x
				);
	}
	public static void main(String[] args) {
		test();
	}

}
