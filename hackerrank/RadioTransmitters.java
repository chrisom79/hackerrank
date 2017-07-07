package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class RadioTransmitters {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        
        Arrays.sort(x);
        
        int i = 0;
        int j = i + 1;
        int count = 0;
        while (i < n) {
        	
            while (j < n && x[i] >= (x[j] - k)) {
                j += 1;
            }
            count += 1;

            while (i < n && x[i] <= (x[j - 1] + k)) {
                i += 1;
            }
        }
        
        System.out.println(count);
    }
}
