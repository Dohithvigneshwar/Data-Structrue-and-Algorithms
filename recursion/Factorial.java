package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FactNumber(5));
	}
	public static int FactNumber(int n) {
		if(n<2) {
			return 1;
		}
		return n*FactNumber(n-1);
	}

}
