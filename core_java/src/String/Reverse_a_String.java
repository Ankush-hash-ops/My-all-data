package String;

public class Reverse_a_String {
//	public static void main(String[] args) {
//		String originalStr="Hello";
//		String reverseStr="";
//		for(int i=0;i<originalStr.length();i++) {
//			reverseStr=originalStr.charAt(i)+reverseStr;
//		}
//		System.out.println("Reversed string:"+reverseStr);
//	}
	
	
//	public static void main(String[] args) {
//		String originalStr="Hello";
//		String reverseStr="";
//		for(int i=originalStr.length()-1;i>=0;i--) {
//			reverseStr=reverseStr+originalStr.charAt(i);
//		}
//		System.out.println(reverseStr);
//}
	
	public static void main(String[] args) {
		 String orgStr="ankush";
		 String RevStr="";
		for( int i=orgStr.length()-1;i>=0;i--) {
			RevStr=RevStr+orgStr.charAt(i);
		}
		System.out.println(RevStr);
		
		
		String input="my name is abcd";
		String target="abcd";
		String reverse="";
		
		for(int i=0;i<target.length();i++) {
			reverse=target.charAt(i)+reverse;
			
		}
		String result=input.replace(target, reverse);
		System.out.println(result);
	}
}
