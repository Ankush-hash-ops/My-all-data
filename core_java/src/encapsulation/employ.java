package encapsulation;

public class employ {
	
	 static String name="Ankush";
	private static int age=22;
	private static String id="12@3";
	
	public  static int getAge() {
		return age;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public int getDetails() {
		return getAge();
	}
	

	
	
}
