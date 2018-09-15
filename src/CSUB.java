import java.util.Scanner;
/*
 * Given a string S consisting of only 1s and 0s, find the number of substrings which start and end both in 1.
In this problem, a substring is defined as a sequence of continuous characters Si, Si+1, ..., Sj where 1 ≤ i ≤ j ≤ N.

Input
First line contains T, the number of testcases. Each testcase consists of N(the length of string) in one line and string in second line.

Output
For each testcase, print the required answer in one line.

Constraints
1 ≤ T ≤ 105
1 ≤ N ≤ 105
Sum of N over all testcases ≤ 105
Example
Input:
2
4
1111
5
10001

Output:
10
3
Explanation
#test1: All substrings satisfy.
#test2: Three substrings S[1,1], S[5,5] and S[1,5] satisfy.
 */

class CSUB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		if(t>=1 && t<= Math.pow(10, 5)){
			while(t>0){
				int n = scan.nextInt();
				if(n>=1 && n<= Math.pow(10,5)){
					StringBuilder strB = new StringBuilder();
					while(n>0){
						strB.append(scan.next());
						n--;
					}
					String str = strB.toString();
					int noOfSub = 0;
					for(int i=0; i<str.length(); i++){
						if(str.charAt(i)=='0'){
							continue;
						}else{
							for(int j=i; j<str.length(); j++){
								
								if(str.charAt(j) == '1'){
									noOfSub++;
								}
							}
						}
						
					}
					System.out.println(noOfSub);
				}
				t--;
			}
			
		}

	}

}
