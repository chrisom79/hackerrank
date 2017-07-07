package hackerrank;

import java.util.Scanner;

public class StrangeAdvertising {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int div = 6;
		int total = 2;
		for(int i = 2; i <= n; i++) {
			total += (div / 2);
			div = (div / 2) * 3;
		}
		
		System.out.println(total);
	}

}
