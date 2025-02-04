package recursion;
public class BasicQuestions {
	public static void main(String[] args) {
//		System.out.println(Sum(5));
//		System.out.println(SumDigit(91028));
//		System.out.println((int)Math.log10(120)+1);
//		System.out.println(ReverseTheNumber(110011011, 0));
		
		int n = 102000021;
//		System.out.println(n==PalindromeNumberWithoutString(n));
//		System.out.println(PalindromeNumberWithString(Integer.toString(n),0,Integer.toString(n).length()-1));
		System.out.println(CountTheNumberOfZero(n,0));
	}
	public static int SumDigit(int n) {
		if(n/10 == 0) {
			return n;
		}
		return (n%10) + SumDigit(n/10);
	}
	public static int Sum(int n) {
		if(n==1) {
			return n;
		}
		return n+Sum(n-1);
	}
	public static int ReverseTheNumber(int n,int ans) {
		if(n/10 == 0) {
			ans = (ans*10)+(n%10);
			return ans;
		}
		ans = (ans*10)+(n%10);
		return ReverseTheNumber(n/10,ans);
	}
	public static boolean PalindromeNumberWithString(String n,int s,int e) {
		if(s == e) {
			return true;
		}
		if(n.charAt(s) == n.charAt(e)) {
			return PalindromeNumberWithString(n,++s,--e);
		}
		return false;
		
	}
	public static int PalindromeNumberWithoutString(int num) {
		return ReverseTheNumber(num,0);
	}
	public static int CountTheNumberOfZero(int num,int count) {
		if(num/10 == 0) {
			if(num%10==0) count+=1;
			return count;
		}
		if(num%10 == 0) count+=1;
		return CountTheNumberOfZero(num/10,count);
	}
}
