/*
Day 15 and 16:
Task 1: Knapsack Problem
Write a function int Knapsack(int W, int[] weights, int[] values) in C# that determines the maximum value of items that can fit into a knapsack with a capacity W. The function should handle up to 100 items. Find the optimal way to fill the knapsack with the given items to achieve the maximum total value. You must consider that you cannot break items, but have to include them whole.
 */

public class KnapsackProgram {
	
	static int KnapSack(int m, int[] w, int[] p, int n) {
		// TODO Auto-generated method stub
		int[][] c= new int[n+1][m+1];
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=m; j++) {
				if(w[i -1] > j) {
					c[i][j]=c[i-1][j];
				}else {
					c[i][j]=Math.max(
							p[i-1] + c[i -1][j-w[i-1]],
							c[i-1][j]);
				}
			}
		}
		return c[n][m];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p= {60,100,120};
		int[] w={10,20,30};
		int M=50;
		int n=p.length;
		System.out.println("The maximum profit: " + KnapSack(M, w, p, n));

}
}