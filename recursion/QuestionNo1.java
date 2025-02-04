package recursion;

import java.util.ArrayList;

public class QuestionNo1 {
	public static void main(String args[]) {
//		 int digit = 4;
//		 for(int i=(digit-1)*3;i<digit*3;i++) {
//			System.out.println(i);
//		 }
		System.out.println(MobilePadReturn("","12"));
	}
	public static void MobilePad(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int n = up.charAt(0)-'0';
		for(int i=(n-1)*3;i<n*3;i++) {
			char c = (char)('a'+i); 
			MobilePad(p+c,up.substring(1));
		}
	}
	public static ArrayList<String> MobilePadReturn(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> ans = new ArrayList<>();
			ans.add(p);
			return ans;
		}
		ArrayList<String> list = new ArrayList<>();
		int n = up.charAt(0)-'0';
		for(int i=(n-1)*3;i<n*3;i++) {
			char c = (char)('a'+i); 
			list.addAll(MobilePadReturn(p+c,up.substring(1)));
		}
		return list;
	}
}
