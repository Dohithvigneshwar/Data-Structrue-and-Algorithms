package backtracking;

public class AutoDiskQ1 {
	public static void main(String[] args) {
		int n = 5;
		String ans = "";
		while(n!=0) {
			int rem = n%2;
			ans = rem+ans;
			n/=2;
		}
		System.out.println(ans);
		String a = "101";
		String b = "111";
		System.out.println(Integer.parseInt(a,2)+Integer.parseInt(b,2));
	}

}
