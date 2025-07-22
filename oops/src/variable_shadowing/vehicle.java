package variable_shadowing;

public class vehicle {
	int a=40;
	public void start()
	{
		System.out.println("start method");
		int a=72;
		System.out.println("local a is :"+a);
		System.out.println("local a is :"+this.a);

	}
	public static void main(String[] args) {
		vehicle v1=new vehicle();
		v1.start();
	}
	

}
