package immutable_class;

public class laptop {
	private final String name;
	private final double price;
	private final int ram;
	
	laptop(String name,double price,int ram){
		
		this.name=name;
		this.price=price;
		this.ram=ram;
	}
	
	public String getName() {
		return name;
		
	}
	public double getPrice() {
		return price;
	}
	public int getRam() {
		return ram;
	}

}
