package hackerrank;

import java.util.Scanner;

public class SavePrisioner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int t = 0; t < T; t++) {
			int N = in.nextInt();
			int M = in.nextInt();
			int S = in.nextInt();
			int res = 0;
			if(N >= M) {
				res = M + S;				
			} else if(M > N) {
				res = ((M - N) + S);
								
			}
			
			if(res > N)
				res = res % N;
			
			if(res == 0 || res == 1)
				res = N;
			else
				res--;
			
			System.out.println(res);
		}
    }
}
