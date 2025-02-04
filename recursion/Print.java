package recursion;
public class Print {
	public static void main(String args[]) {
		PrintNumber(5);
	}
	public static void PrintNumber(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		PrintNumber(n-1);
		System.out.println(n);
	}
}
