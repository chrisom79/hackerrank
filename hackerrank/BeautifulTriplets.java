package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int d = in.nextInt();
        int[] c = new int[n];  
        for(int i = 0; i < n; i++) {
        	c[i] = in.nextInt();
        }
        
        Arrays.sort(c);
        int count = 0;
        for(int i = n - 1; i >= 0; i--) {
        	for(int j = i - 1; j > 0; j--) {
        		if(c[i] - c[j] == d) {
        			for(int k = j - 1; k >= 0; k--) {
        				if(c[j] - c[k] == d) {
        					count++;
        				}
        			}
        		}
        	}
        }
        
        System.out.println(count);
    }
}
