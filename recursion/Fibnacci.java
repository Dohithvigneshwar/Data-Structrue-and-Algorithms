package recursion;

public class Fibnacci {
	public static void main(String args[]) {
		System.out.println(Fib(4));
	}
	public static int Fib(int n) {
		if(n<2) return n;
		return Fib(n-1)+Fib(n-2);
	}
}
