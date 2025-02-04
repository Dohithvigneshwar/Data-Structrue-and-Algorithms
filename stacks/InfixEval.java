package stacks;

import java.util.Stack;

public class InfixEval {
	public static void main(String args[]) {
		Stack<Integer> operand = new Stack<>();
		Stack<Character> operator = new Stack<>();
		
		String str = "(5+3)*8/4";
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				operand.push(c-'0');
			}
			else if(c=='(') {
				operator.push('(');
			}
			else if(c==')'){
				
			}
			else {
				while(operator.size()>1 && precedenceCheck(operator.peek()) >= precedenceCheck(c)) {
					
				}
				operator.push(c);
			}
		}
		
	}
	public static int precedenceCheck(char c) {
		if(c=='+' || c=='-') return 1;
		if(c=='*' || c=='/') return 2;
		return 0;
	}
}
