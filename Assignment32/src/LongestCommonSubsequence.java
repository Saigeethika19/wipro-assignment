/*
 * Task 2: Longest Common Subsequence
Implement int LCS(string text1, string text2)  to find the length of the longest common subsequence between two strings.
 */

public class LongestCommonSubsequence {

	
	static int lcs(char[] x, char[] y, int m,int n) {
		if(m == 0 || n==0)
			return 0 ;
		
		if(x[m-1] == y[n-1])
			return 1+ lcs(x, y, m-1, n-1);
			else 
				return max(lcs(x, y, m, n-1),lcs(x, y, m-1, n));
	}
	static int max(int a, int b) {
		return (a > b) ? a: b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubsequence lc= new LongestCommonSubsequence();
		String s1 = "ABCDGH";
		String s2= "AEDFHR";
		
		char[] X =s1.toCharArray();
		char[] Y= s2.toCharArray();
		
		int m= s1.length();
		int n=s2.length();
		System.out.println("lenth of LCS is" +" " +lc.lcs(X, Y, m, n));
		
	}

}
