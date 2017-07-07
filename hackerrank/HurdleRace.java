package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class HurdleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt(); 
        }
        
        Arrays.sort(height);
        
        if(height[n - 1] - k > 0)
        	System.out.println(height[n - 1] - k);
        else
        	System.out.println(0);
	}

}
