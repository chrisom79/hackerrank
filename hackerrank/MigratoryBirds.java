package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        
        Map<Integer, Integer> reps = new HashMap<Integer, Integer>();
        for (int i = 0; i < types.length; ++i) {
            int item = types[i];

            if (reps.containsKey(item))
                reps.put(item, reps.get(item) + 1);
            else
                reps.put(item, 1);
        }
        
        Map.Entry<Integer, Integer> max = null;
        for (Map.Entry<Integer, Integer> entry : reps.entrySet())
        {
            if (max == null || entry.getValue().compareTo(max.getValue()) > 0)
            {
            	max = entry;
            }
        }
        System.out.println(max.getKey());

	}

}
