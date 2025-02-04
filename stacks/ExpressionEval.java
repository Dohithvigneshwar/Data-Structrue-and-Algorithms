package stacks;
import java.util.Stack;
public class ExpressionEval {
	public static void main(String args[]) {
		String exp = "(5+3)*4/8";
		Stack<Integer> operand = new Stack<>();
		Stack<Character> operator = new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			if(Character.isDigit(c)) {
				operand.push(c-'0');
			}
			else if(c=='(' || c==')'){
				if(c=='(') {
					operator.push(c);
				}
				else {
					while(operator.peek() != '(') {
						int n1 = operand.pop();
						int n2 = operand.pop();
						char opr = operator.pop();
						int ans = eval(n1,n2,opr);
						operand.push(ans);
					}
					operator.pop();
				}
			}
			else {
				if(operator.isEmpty()) {
					operator.push(c);
				}
				else {
					int cur = checkPrecident(c); 
					int pre = checkPrecident(operator.peek());
					if(cur>pre) {
						operator.push(c);
					}
					else {
						int n1 = operand.pop();
						int n2 = operand.pop();
						char opr = operator.pop();
						int ans = eval(n1,n2,opr);
						operand.push(ans);
						operator.push(c);
					}
				}
			}
		}
		while(!operator.isEmpty()){
			int n1 = operand.pop();
			int n2 = operand.pop();
			char opr = operator.pop();
			int ans = eval(n1,n2,opr);
			operand.push(ans);
		}
		System.out.println(operand);
		System.out.println(operator);
	}
	public static int checkPrecident(char c) {
		if(c=='(' || c==')') {
			return 0;
		}
		else if(c=='+' || c=='-') {
			return 1;
		}
		else {
			return 2;
		}
	}
	public static int eval(int n1,int n2,char c) {
		if(c=='-') {
			return n1-n2;
		}
		if(c=='+') {
			return n1+n2;
		}
		if(c=='*') {
			return n1*n2;
		}
		return n2/n1;
		
	}
}
