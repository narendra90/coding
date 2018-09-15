
public class PermutationString {
	public static void main(String arg[]) {
		String str = "ABC";
		permute(str, 0, str.length());
	}
	
	private static void permute(String str, int l, int n) {
		if(l==n){
			System.out.println(str);
		}else{
			for(int i =l; i<n; i++){
				str = swap(str, l, i);
				permute(str, l+1, n);
				str = swap(str, l, i);
			}
		}
	}

	private static String swap(String str, int l, int i) {
		
		char[] charArray = str.toCharArray();
		char t = charArray[l];
		charArray[l] = charArray[i];
		charArray[i] = t;
		str = String.valueOf(charArray);
		return str;
	}
}
