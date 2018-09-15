
public class PermutationInteger {
	public static void main(String ar[]) {
		int[] arr = {2,1,3};
		//permute(arr, 0, arr.length);
		ropeLength(arr, 8);
	}

	private static void permute(int[] arr, int start, int length) {
		if(start == length) {
			for(int i =0; i<length; i++){
				System.out.print(arr[i]+", ");
			}
			System.out.println();
		}else {
			for(int i = start; i<length; i++){
				swap(arr, start, i);
				permute(arr, start+1, length);
				swap(arr, start, i);
			}
		}
	}

	private static void swap(int[] arr, int start, int length) {
		int t = arr[start];
		arr[start] = arr[length];
		arr[length] = t;		
	}
	
	private static void ropeLength(int[] arr, int length){
		int rope = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("For "+i);
			if(i==0 || i == arr.length-1){
				System.out.print("1+");
				rope+=1;
			}
			if((i-1) > 0 && arr[i-1] == arr[i]-1) {
				System.out.print("1+");
				rope+= 1;
			}else{
				System.out.print(i+1+"+");
				rope+= (i+1);
			}
			if((i+1) < arr.length && arr[i]+1 == arr[i+1]) {
				System.out.print("1+");
				rope+=1;
			}else{
				System.out.print(arr.length-i+"+");
				rope+= (arr.length-i);
			}
			
			
			
		}
		System.out.println("Rope required "+rope);
	}
	
}
