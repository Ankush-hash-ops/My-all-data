package composition;

public class driver {
	public static void main(String[] args) {
		car c1=new car("TATA");
		car c4=new car("Audi",new engine(200));
		System.out.println("car object refernce is:"+c1);
		System.out.println("car engine object rference is :"+c1.e);
		System.out.println("car name :"+c1.name);
		System.out.println("car engine hp :"+c1.e.hp);
		c1.e.start();
		
	}

}
