package Programming_practice;

public class reverse_String {
	public static void main(String[] args) {
		String input = "hello world";
		String target = "world";
		String reverse = " ";
//
//		for (int i = 0; i < input.length(); i++) {
//
//			reverse = input.charAt(i) + reverse;
//		}
//
//		System.out.println(reverse);

		for (int i = 0; i < target.length(); i++) {

			reverse = target.charAt(i) + reverse;
		}

		System.out.println(reverse);
		
		String use=input.replace(target, reverse);
		System.out.println(use);

	}

}
