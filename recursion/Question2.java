package recursion;

public class Question2 {
	public static void main(String args[]) {
		int a[] = {1,2,3,4};
		int target = 4;
		Dics("",4);
	}
	public static void Dics(String p,int target) {
		if(target == 0 ) {
			System.out.println(p);
			return;
		}
		
		for(int i=1;i<=6 && i<=target;i++) {
			Dics(p+i,target-i);
		}
	}
}
