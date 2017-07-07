package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class GridlandMetro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        
        int last = 0;
        Map<Integer, LinkedList<Integer>> metro = new HashMap<>();
        BigInteger free = BigInteger.valueOf(m);        
        free = free.multiply(BigInteger.valueOf(n));
        boolean ins = false;
        for(int i = 1; i <= k; i++) {
        	int r = in.nextInt();
            int c1 = in.nextInt();
            int c2 = in.nextInt();
            //ins = false;
            
            if (metro.containsKey(r)) {
            	LinkedList row = metro.get(r);
            	 ListIterator<Integer> it = row.listIterator();
            	 while (it.hasNext()) {
            		 int curr = it.next();
            		 int next = it.next();
            		 last = 0;
            		 if(next < c1) {
            			 ins = false;
            			 continue;
            		 } else if(curr > c2) {
            			 row.add(last, c1);
            			 row.add(last + 1, c2);
            			 free = free.subtract(BigInteger.valueOf(c2 - c1 + 1));
            			 ins = true;
            			 break;
            		 } else if(c1 > curr && c2 <= next) {
            			 ins = true;
            		 } else if(c1 < curr) {
            			 row.remove(last);
            			 row.add(last, c1);
            			 free = free.subtract(BigInteger.valueOf(curr - c1));
            			 ins = true;
            		 } else if(c2 > next) {
            			 row.remove(last + 1);
            			 row.add(last + 1, c2);
            			 free = free.subtract(BigInteger.valueOf(c2 - next));
            			 ins = true;
            		 } 
            		 
            		 if(ins)
            			 break;
            		 
            		 last += 2;
            		 
            	 }
            	 if(!ins) {
            		 row.add(c1);
            		 row.add(c2);
            		 free = free.subtract(BigInteger.valueOf(c2 - c1 + 1));
            	 }
            	 
            } else {
            	metro.put(r, new LinkedList(Arrays.asList(c1, c2)));
            	free = free.subtract(BigInteger.valueOf(c2 - c1 + 1));
            }
                      
        }
       
        System.out.println(free);
	}
}
