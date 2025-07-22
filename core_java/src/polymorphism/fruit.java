package polymorphism;

public class fruit {
	 public void apple() {
		 System.out.println("apple is a fruit");
			 
	 }
	 public void apple(double weight) {
		 System.out.println("given is the weight of fruit");
	 }
	 
	 public void apple(int size,double weight) {
		 System.out.println("displays size and weight");
	 }
	 
	 public static void main(String[] args) {
		fruit f=new fruit();
		f.apple(55.6);
		f.apple();
		f.apple(24, 25.66);
		
	}

}
