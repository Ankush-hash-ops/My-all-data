package constructor;

public class fruit1 {
	String name;
	int price;
	double weight;
	fruit1(String name,int price,double weight)
	{
		this.name=name;
		this.price=price;
		this.weight=weight;
		
	}
	public void getDetails()
	{
		System.out.println("Name is :"+name);
		System.out.println("age is  :" +price);
		System.out.println("gender is  :" +weight);
	}

}
