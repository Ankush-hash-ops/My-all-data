package polymorphism;

public class driver {
	public static void main(String[] args) {
		shape s1=new rectangle();
		shape s2=new circle();
		shape s3=new triangle();
		s1.area();
		s2.area();
		s3.area();
		
	}
	

}
