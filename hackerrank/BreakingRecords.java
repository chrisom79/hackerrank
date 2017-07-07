package hackerrank;

import java.util.Scanner;

public class BreakingRecords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int max = 0;
        int min = 0;
        int best = 0;
        int worst = 0;
        for(int score_i=0; score_i < n; score_i++){
            int val = in.nextInt();
            if(score_i == 0) {
            	max = val;
            	min = val;
            } else if(val > max) {
            	max = val;
            	best++;
            } else if(val < min) {
            	min = val;
            	worst++;
            }
        }
        
        System.out.println(best + " " + worst);

	}

}
