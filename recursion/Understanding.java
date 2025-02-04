package recursion;

public class Understanding {
	public static void main(String args[]) {
		Prints(5);
	}
	public static void Prints(int n) {
		if(n==0) return;
		System.out.println(n);
		Prints(n-1);
	}
}
