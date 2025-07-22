package Programming_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicates_toFind {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(2);
		
		System.out.println("duplicate numbers are");
		findDuplicate(list);
		System.out.println(list);
		
	}
	
	
	
	
	
	
	public static void findDuplicate(List<Integer> list) {
		
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
