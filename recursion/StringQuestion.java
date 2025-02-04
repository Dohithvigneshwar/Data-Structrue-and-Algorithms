package recursion;
public class StringQuestion {
	public static void main(String args[]) {
		String s = "abbacca";
		s = RemoveAMethod2(s);
		System.out.println(s);
	}
	public static String RemoveAMethod1(String s, int index) {
		if(index == s.length()){
			return s;
		}
		if(s.charAt(index) == 'a'){
			s = s.substring(0,index)+s.substring(index+1);
			index-=1;
		}
		return RemoveAMethod1(s,index+1);
	}
	public static String RemoveAMethod2(String up) {
		if(up.isEmpty()) return "";
		char c = up.charAt(0);
		if(c=='a') {
			return RemoveAMethod2(up.substring(1));
		}
		else {
			return c+RemoveAMethod2(up.substring(1));
		}
		
	}
	public static String RemoveAMethod3(String p,String up) {
		if(up.isEmpty()) return p;
		if(up.charAt(0)=='a') {
			up = up.substring(1);
		}
		else {
			p+=up.charAt(0);
			up = up.substring(1);
		}
		return RemoveAMethod3(p,up);
	}
}
