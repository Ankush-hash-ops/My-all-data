package immutable_class;

public class driver {
	public static void main(String[] args) {
		laptop l1=new laptop("dell", 552110.3, 16);
		System.out.println(l1.getName());
		System.out.println(l1.getPrice());
		System.out.println(l1.getRam());
		
	}

}
