package practices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicates {
	
	public static int[] removeDuplicates(int[] array ) {
		
		Set<Integer> set=new HashSet<Integer>();
		for(Integer num:array) {
			
			
			set.add(num);
			
		}
		
		
		int [] result=new int[set.size()];
		int i=0;
		for(Integer num:set) {
			result[i++]=num;
		}
	
		return result;
	}

	
	public static void main(String[] args) {
		int[] input= {1,4,3,4,2,6,5,3,2,6,5};
		int[] result=removeDuplicates(input);
		
		
		System.out.println("before removing"+Arrays.toString(input));
		System.out.println("after removing"+Arrays.toString(result));
	}
}
