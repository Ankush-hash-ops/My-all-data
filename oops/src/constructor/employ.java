package constructor;

public class employ {
	static String comp_name="abc pvt ltd";
	String name;
	int id;
	public static void giveBiometric()
	{
		System.out.println("employ should give biometric");
	}
	public void work()
	{
		System.out.println("Employ is working");
	}
	public static void main(String[] args) {
		int p=34;
		System.out.println("main starts");
		System.out.println("comp_name");
		System.out.println(employ.comp_name);
		employ.giveBiometric();
		employ e1=new employ();
		employ e2=new employ();
		employ e3=new employ();
		e1.name="mohan";
		System.out.println(e1.name);
		System.out.println(e2.name);

		
		
	}

}
