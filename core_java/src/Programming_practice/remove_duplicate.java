	package Programming_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicate {
	
	public static int[] removeDuplicates(int [] array) {
		
		Set< Integer> set=new HashSet<Integer>();
		for(Integer num:array) {
			set.add(num);
		}
		
		
		
		int[] result=new int[set.size()];
		int i=0;
		for(Integer num:set) {
			result[i++]=num;
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] input= {12,10,12,15,13,15,13};
		int [] output=removeDuplicates(input);
		
		System.out.println("before removing array"+Arrays.toString(input));
		System.out.println("after removing array"+Arrays.toString(output));
		
	}
	
	
	
}
