import java.util.Arrays;
import java.util.Scanner;

/*
 * Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. 
 * If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. 
 * For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. 
 * Also, abccab, rotor and xyzxy are a few examples of lapindromes. 
 * Note that abbaab is NOT a lapindrome. 
 * The two halves contain the same characters but their frequencies do not match. 
 * Your task is simple. Given a string, you need to tell if it is a lapindrome.

Input:
First line of input contains a single integer T, the number of test cases.
Each test is a single line containing a string S composed of only lowercase English alphabet.

Output:
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.

Constraints:
1 ≤ T ≤ 100
2 ≤ |S| ≤ 1000, where |S| denotes the length of S

Example:
Input:
6
gaga
abcde
rotor
xyzxy
abbaab
ababc


Output:
YES
NO
YES
YES
NO
NO
 */
class Lapindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		String s=null;
		t=scan.nextInt();
		if(t>=1 && t<= 100){
			while(t>0){
				s = scan.next();
				int sl = s.length();
				if(sl>=2 && sl<= 1000){
					char[] c1 = new char[26];
					char[] c2 = new char[26];
					for(int i=0; i<26; i++){
						c1[i] = c2[i] = 0;
					}
					for(int i=0; i< sl/2; i++){
						c1[s.charAt(i)-'a']++;
					}
					
					for(int i= (sl+1)/2; i<sl;i++){
						c2[s.charAt(i)-'a']++;
					}
					
					boolean isLapindrome = true;
					for(int i=0;i<26;i++){
						if(c1[i] != c2[i]){
							isLapindrome = false;
							break;
						}
					}
					if( isLapindrome){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
				}
				t--;
			}
		}
		

	}

}
