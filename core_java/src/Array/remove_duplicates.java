package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicates {
	
	public static int[] removeDuplicates(int [] array) {
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int num:array) {
			set.add(num);
		}
		
		
		int[] result =new int[set.size()];
		
		int i=0;
		for(int num:set) {
			result[i++]=num;
			
		}
				
		
		
		
		return result;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] input= {1,3,2,4,2,4,5,6,7,2,3,4};
		 int [] result=removeDuplicates(input);
		 
		 System.out.println("before removing"+Arrays.toString(input));
		 System.out.println("After removing"+Arrays.toString(result));
	}
	
	
	
	
	
	
	
	
	
	
	

}
