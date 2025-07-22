package intialization_of_object;

public class employDriver {
	public static void main(String[] args) {
		employ e1=new employ();
		employ e2=new employ();
		employ e3=new employ();
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.salary);
		System.out.println("====================");
		e1.setValue("mohan", 155, 1555.56);
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.salary);
		System.out.println("=====================");
		System.out.println(e2.name);
		System.out.println(e2.id);
		System.out.println(e2.salary);
		System.out.println("======================");
		e2.setValue("sohan", 0, 156.20);
		System.out.println(e2.name);
		System.out.println(e2.id);
		System.out.println(e2.salary);
		
		
		
	}

}
