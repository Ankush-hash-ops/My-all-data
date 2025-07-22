package Programming_practice;

public class reverse_Array {
	
	public static void main(String[] args) {
		int [] array= {1,2,4,5,2,6};
		int n=array.length-1;
		
		
		for(int i=n;i>=0;i--) {
			
			System.out.println(array[i]);
		}
	}

}
