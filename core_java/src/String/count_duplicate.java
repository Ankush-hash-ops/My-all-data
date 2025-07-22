package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_duplicate {
	public static List<Object> duplicateCount(String str) {
		 List<Object>result=new ArrayList<Object>();
		int index=0;
		int i=0;
		char []copy=str.toCharArray();
		while(i<str.length()) {
			int count=1;
			int j=i+1;
			while(j<str.length()) {
				if(copy[i]==copy[j]) {
					count++;
				}
				j++;
			}
			if(!result.contains(Arrays.asList(copy[i],count))) {
				System.out.println(copy[i]+"---"+count);
			}
			result.add(Arrays.asList(copy[i],count));
			i++;
		}
		return result;
	}
	public static void main(String[]args) {
		System.out.println(duplicateCount("banana"));
	}

}
