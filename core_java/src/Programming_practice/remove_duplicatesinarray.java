package Programming_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicatesinarray {
	
		
		
		
		
		public static int[] removeDuplicates(int [] array) {
		Set<Integer> set=new HashSet<>();
//		HashSet<Integer> set=new HashSet<>();
		for(int num:array) {
			set.add(num);
		}
		
		
		int [] result=new int[set.size()];
		int i=0;
		for(int num:set) {
			result[i++]=num;
			
		}
		return result;
		
		}
	
		
		
	

public static void main(String[] args) {
	int [] a= {1,2,2,3,4,2,5,6,5,6};
	int[] unique=removeDuplicates(a);
	System.out.println("original array:"+Arrays.toString(a));
	System.out.println("array without duplicates"+Arrays.toString(unique));
	
}
}

