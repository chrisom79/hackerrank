package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] rem = new int[k];
        int count = 0;
        
        for(int i=0; i < n; i++){
            int a = in.nextInt();
            rem[a % k]++;
        }
        
        for(int i = 0; i * 2 < k; i++) {
        	int rev = (k - i) % k;
        	if(i == k) {
        		count += Math.min(rem[i], 1);
        	} else {
        		count += Math.max(rem[i], rem[rev]);
        	}
        }
        
        System.out.println(count);
    }
}
