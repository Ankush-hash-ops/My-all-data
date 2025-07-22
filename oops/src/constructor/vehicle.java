package constructor;

public class vehicle {
   vehicle()
   {
	   System.out.println("vehicle no-arg Constructor");
   }
   vehicle(int x)
   {
	   this();
	   System.out.println("vehicle int arg x is  : "+x);
   }
   vehicle(int x,int y)
   {
	   this(x);
	   System.out.println("vehicle int,int arg constructor"+x+","+y);
   }
}
