package abstraction;

public class driver1 {
	public static void main(String[] args) {
		
		
		vehicle c1=new electricCar();
		
//		<------------down casting----->
		electricCar e1=(electricCar)c1;
		e1.start();
		e1.stop();
		e1.openGate();
		
	}

}
