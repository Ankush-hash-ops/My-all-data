package filehandling;
import java.io.IOException;
import java.io.FileWriter;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter the weight");
		String weight=sc.next();
		FileWriter fw=null;
		try {
			fw=new FileWriter("C:\\q spiders\\10201_database\\abc.txt");
		    System.out.println("File is created");
		    fw.write("name is"+name+"\n");
		    fw.write("age is: "+age+"years");
		    fw.write("\nweight is :"+weight+"kg");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
		System.out.println("program Ends !!");
	}

}
