package recursion.string;

public class Permutation {

	public static void main(String[] args) {
		PermutationOfStringMethod1("","abc");
		System.out.println();
		PermutationOfStringMethod2("","abc");
//		String s = "acd";
//		for(int i=0;i<=s.length();i++) {
//			String substr = s.substring(0,i)+'0'+s.substring(i);
//			System.out.println(substr);
//		}
	}
	public static void PermutationOfStringMethod1(String p, String up) {
		if(up.length()==1) {
			System.out.print(p+up+" ");
			return;
		}
		for(int i=0;i<up.length();i++) {
			char c = up.charAt(i);
			PermutationOfStringMethod1(p+c,up.substring(0,i)+up.substring(i+1));
		}
	}
	public static void PermutationOfStringMethod2(String p,String up) {
		if(up.isEmpty()) {
			System.out.print(p+" ");
			return;
		}
		
		char c = up.charAt(0);
		
		for(int i=0;i<=p.length();i++) {
			PermutationOfStringMethod2(p.substring(0,i)+c+p.substring(i),up.substring(1));
		}
		
	}

}
