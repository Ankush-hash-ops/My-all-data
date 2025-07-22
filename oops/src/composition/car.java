package composition;

public class car {
	String name;
	engine e=new engine(180);
	car()
	{
		
	}
	car(String name)
	{
		this.name=name;
	}
	car(String name,engine e)
	{
		this.name=name;
		this.e=e;
		
	}

}
