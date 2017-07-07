package hackerrank;

import java.util.*;

public class EqualityArray {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
		 for(int c_i=0; c_i < n; c_i++){
			 int item = in.nextInt();   
			 if(counter.get(item) == null) {
				 counter.put(item, 1);
			 } else {
				 int num = counter.get(item);
				 counter.put(item, ++num); 
			 }
	     }
		 
		 int max = 0;
		 for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {
			 if(entry.getValue() > max)
				 max = entry.getValue();
		 }
		 
		 System.out.println(n - max);
	 }
}
