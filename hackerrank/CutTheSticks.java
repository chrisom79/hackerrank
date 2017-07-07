package hackerrank;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int min = 1000;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
            if(min >  arr[arr_i])
            	min = arr[arr_i];
        }
        int cuts = 0;
        int nextmin1 = 1000;
        int nextmin2 = 1000;
        do {
        	System.out.println(n - cuts);
        	cuts = 0; 
        	nextmin2 = 1000;
        	for(int arr_i=0; arr_i < n; arr_i++) {
        		arr[arr_i] -= min;
        		
        		if(arr[arr_i] > 0)
        			nextmin1 = arr[arr_i];
        		if(arr[arr_i] > 0 && nextmin2 >  arr[arr_i])
        			nextmin2 = arr[arr_i];
        		
        		
        		if(arr[arr_i] <= 0)
        			cuts++;
        	}
        	
        	if(nextmin2 > 0 && nextmin2 < nextmin1) {
    			min = nextmin2;
    		} else {
    			min = nextmin1;
    		}
        	
        } while(n - cuts > 0);

	}

}
