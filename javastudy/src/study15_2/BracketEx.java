package study15_2;

import java.util.*;

public class BracketEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(isCorrect(input));
	}

	public static boolean isCorrect(String input) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				stack.push(ch);
			} else if(ch==')'||ch=='}'||ch==']') {
				if(stack.isEmpty()) {
					return false;
				}
				char last = stack.pop();
				if(!compare(last,ch)) {
					return false;
				}
			}
			
		}
		return stack.isEmpty();
	}

	static boolean compare(char last, char ch) {
		if(last=='('&&ch==')') {
			return true;
		}
		if(last=='{'&&ch=='}') {
			return true;
		}
		if(last=='['&&ch==']') {
			return true;
		}
		return false;
	}
	
	
}
