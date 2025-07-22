package method;

public class example1 {
	public static void Entry()
	{
		System.out.println("hii");
		Exit();
	}
	public static void Exit()
	{
		System.out.println("bye");
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		Entry();
		System.out.println("Main ends");
		
	}

}
