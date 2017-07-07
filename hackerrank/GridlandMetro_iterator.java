package hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GridlandMetro_iterator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        
        int count = 0;   
        List<List<Line>> ls = new ArrayList<>();
        
        for(int i = 0; i < m; i++) {
        	ls.add(new ArrayList<Line>());
        }
        
        for(int i = 0; i < k; i++) {
        	int r = in.nextInt();
            int c1 = in.nextInt();
            int c2 = in.nextInt();
            
            ls.get(r - 1).add(new Line(c1, c2));         	            	
                      
        }
        
        for(int j = 0; j < n; j++) {
    		if(ls.get(j).size() == 0) {
    			count += m;
    			continue;
    		}
    		
    		int rc = 0;
    		Iterator<Line> it = ls.get(j).iterator();
    		Line current = it.next();
    		Line next = null;
    		while(it.hasNext()) {
    			next = it.next();
    			if(current.overlap(next)) {
    				current = current.combine(current, next);
    			} else {
    				rc += current.c2 - current.c1;
    				current = next;
    			}
    		}
    		
    		rc += ((current.c2 - current.c1) + 1);
    		count += (m - rc);
    	}
        
        System.out.println(count);
        
    }
	
	public static class Line {
		protected int c1;
		protected int c2;
		
		public Line(int c1, int c2) {
			super();
			this.c1 = c1;
			this.c2 = c2;
		}
		
		public boolean overlap(Line l) {
			boolean flg = false;
			if(this.c1 <= l.c1 && l.c1 < this.c2) {
				flg = true;
			}
			
			return flg;
		}
		
		public Line combine(Line l1, Line l2) {
			return new Line(l1.c1, l2.c2);
		}
	}
}
