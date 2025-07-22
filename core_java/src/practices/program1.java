package practices;

import java.util.HashMap;

public class program1 {

	    public static String minimumSliding(String t, String v) {
	        String str = "";
	        HashMap<Character, Integer> charCount = new HashMap<>();
	        HashMap<Character, Integer> seen = new HashMap<>();
	        for (char c : v.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }
	        int targetLen = v.length();
	        int count = 0;
	        int i = 0;
	        int j = 0;
	        while (j < t.length()) {
	            char ch = t.charAt(j);
	            seen.put(ch, seen.getOrDefault(ch, 0) + 1);
	            if (charCount.containsKey(ch) && charCount.get(ch).intValue() >= seen.get(ch).intValue()) {
	                count++;
	            }
	            if (count == targetLen) {
	                while (i <= j&& count==targetLen) {
	                    String temp = t.substring(i, j+1);
	                    if (str.length() == 0 || str.length() > temp.length()) {
	                        str = temp;
	                    }
	                    char c = t.charAt(i);
	                    seen.put(c, seen.get(c) - 1);
	                    if (charCount.containsKey(c) && charCount.get(c).intValue() > seen.get(c).intValue()) {
	                        count--;
	                    }
	                   
	                    i++;
	                }
	            }
	            j++;
	        }
	        return str;
	    }
	    
	   /* in this code we have one while loop having condition (i<=j && count==targetLen)

	    and if i write like this
	    
	    while (i <= j) {
                    String temp = t.substring(i, j+1);
                    if (str.length() == 0 || str.length() > temp.length()) {
                        str = temp;
                    }
                    char c = t.charAt(i);
                    seen.put(c, seen.get(c) - 1);
                    if (charCount.containsKey(c) && charCount.get(c).intValue() > seen.get(c).intValue()) {
                        count--;
                    }
                   if(count==targetLen){     
                       break;
                   }   
                    i++;
                }*/


	    public static void main(String[] args) {
	        String result = minimumSliding("eadddcfdgbca", "abcd");
	        System.out.println(result);
	    }
	}



