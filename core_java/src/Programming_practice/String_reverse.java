package Programming_practice;

public class String_reverse {
	public static void main(String[] args) {
		String input="Ankush is my name";
		String reverse="";
		String target="name";
	
		for(int i=0;i<target.length();i++) {
			
			reverse=target.charAt(i)+reverse;
			
		}
		System.out.println(reverse);
		String result=input.replace(target, reverse);
		System.out.println(result);
		
		
	}

}
