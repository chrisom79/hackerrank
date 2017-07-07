package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PickingNumbers {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> vals = new TreeMap<Integer, Integer>();
        for(int a_i=0; a_i < n; a_i++){
            int item = in.nextInt();
            
            if (vals.containsKey(item))
            	vals.put(item, vals.get(item) + 1);
            else
            	vals.put(item, 1);
        }
        
        
        Iterator it = vals.entrySet().iterator();
        Entry<Integer, Integer> prev = (Entry) it.next();
        int max = prev.getValue();
        while(it.hasNext()) {
        	Entry<Integer, Integer> current = (Entry) it.next();
        	int diff = Math.abs(prev.getKey() - current.getKey());
        	int sum = prev.getValue() + current.getValue();
        	if( diff <= 1 && sum > max) {
        		max = sum;        		
        	} else if(current.getValue() > max) {
        		max = current.getValue();
        	}
        	
        	prev = current;
        }
        
        System.out.println(max);
           
    }
}
