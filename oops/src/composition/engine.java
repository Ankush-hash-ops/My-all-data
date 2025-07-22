package composition;

public class engine {
	int hp;
	public void start()
	{
		System.out.println("start the engine");
	}
	engine()
	{
		
	}
	engine(int hp)
	{
		this.hp=hp;
	}

}
