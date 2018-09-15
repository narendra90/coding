import java.util.Scanner;

/*
 * Fit Squares in Triangle Problem Code: TRISQ
 * 
 * What is the maximum number of squares of size 2x2 that can be fit in a right angled isosceles triangle of base B.
One side of the square must be parallel to the base of the isosceles triangle.
Base is the shortest side of the triangle

Input
First line contains T, the number of test cases.
Each of the following T lines contains 1 integer B.

Output
Output exactly T lines, each line containing the required answer.

Constraints
1 ≤ T ≤ 103
1 ≤ B ≤ 104
 */

public class TRISQ {
	private static Scanner sc;

	public static void main(String ar[]) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int b = sc.nextInt();
			System.out.println(noOfSquares(b));
			t--;
		}
	}

	private static int noOfSquares(int b) {
		if(b<3) return 0;
		
		return ((b/2)-1) + noOfSquares(b-2);
	}
}
