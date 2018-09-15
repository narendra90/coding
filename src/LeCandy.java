import java.util.Scanner;

class LeCandy {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n, c, t;
		t = scan.nextInt();
		if (t >= 1 && t <= 1000) {
			while (t > 0) {
				n = scan.nextInt();
				if (n >= 1 && n <= 100) {
					int[] ele = new int[n];
					c = scan.nextInt();
					if (c >= 1 && c <= Math.pow(10, 9)) {
						int sum = 0;
						for (int i = 0; i < n; i++) {
							ele[i] = scan.nextInt();
							sum += ele[i];
						}
						if (sum <= c) {
							System.out.println("Yes");
						} else {
							System.out.println("No");
						}
					}

				}
				t--;
			}
		}

	}

}
