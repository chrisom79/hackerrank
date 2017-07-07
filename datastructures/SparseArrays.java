package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SparseArrays {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 Map<String, Integer> values = new HashMap<String, Integer>();
    
		 for(int arr_i=0; arr_i < n; arr_i++) {
			 String item = in.next();
			 if (values.containsKey(item))
				values.put(item, values.get(item) + 1);
            else
            	values.put(item, 1);
		 }
		 
		 
		 int q = in.nextInt();
		 for(int arr_i=0; arr_i < q; arr_i++) {
			 Integer reps = values.get(in.next());
			 System.out.println(reps == null? 0 : reps);
		 }
	 }
}
