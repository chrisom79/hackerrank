package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumPerTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Long[] l = new Long[n];
		for(int i = 0; i < n; i++) {
			l[i] = in.nextLong();
		}
		
		Arrays.sort(l, Collections.reverseOrder());
		
		long side1 = 0;
		long side2 = 0;
		long side3 = 0;
		boolean flgside2 = false;
		for(int i = 0; i < n; i++) {
			side1 = l[i];
			for(int j = i + 1; j < n; j++) {
				side2 = l[j];
				for(int k = j + 1; k < n; k++) {
					side3 = l[k];
					if(side1 < side2 + side3) {
						flgside2 = true;
						break;
					}
				}
				
				if(flgside2) {
					break;
				}
			}
			
			if(flgside2) {
				break;
			}
		}
		
		System.out.println(flgside2?side3 + " " + side2 + " " + side1:-1);
    }
}
