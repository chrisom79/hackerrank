package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckBalance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		int lim = 0;
		int tot = 0;
		List<Integer> imp = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int l = in.nextInt();
			int t = in.nextInt();
			
			if(t == 1) {
				imp.add(l);
			} else {
				tot += l;
			}
			
		}
		
		Collections.sort(imp);
		for(int i = 0; i < imp.size(); i++) {
			if(i < imp.size() - k) {
				tot -= imp.get(i);
			} else {
				tot += imp.get(i);
			}
		}
		
		System.out.println(tot);
	}

}
