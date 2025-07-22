package Programming_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicate_arrayFind {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(3);
		System.out.println(list);
		System.out.println("duplictes elements are");
		removeDuplicates(list);
		
		
		
}
	
	public static void removeDuplicates(List<Integer> list) {
		
		Set<Integer> uniqueElements=new HashSet<Integer>();
		Set<Integer> duplicateElements=new HashSet<Integer>();
		
	    for(Integer element:list) {
	    	
	    	if(!uniqueElements.add(element)) {
	    		duplicateElements.add(element);
	    	}


	    }
	    for(Integer duplicate:duplicateElements) {
	    	System.out.println(duplicate);
	    }
		
	}
}
