package hackerrank;

import java.util.Scanner;

public class BeautifulDays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int i = in.nextInt();
		 int j = in.nextInt();
		 int k = in.nextInt();
		 
		 int count = 0;
		 for(int index = i; index <= j; index++) {
			 float res = (float) Math.abs(index - reversed(index)) / (float)k;
			 if(res == Math.floor(res)/* && Double.isFinite(res)*/)
				 count++;
		 }
		 
		 System.out.println(count);
    }
	
	public static int reversed(int val) {
		int rev = 0;
		while (val != 0)
		{    
			rev = (rev * 10) + (val % 10);
			val = val/10;
		}
		
		return rev;
	}
}
