package hackerrank;

import java.util.Scanner;

public class Abbr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();		
		 for(int i = 0; i < q; i++) {
			 String a = in.next();
			 String b=  in.next();
			 StringBuffer sb = new StringBuffer();
			 int k = 0;
			 for(int j = 0; j < a.length(); j++) {				 
				 if(k < b.length() && a.toUpperCase().charAt(j) == b.charAt(k)) {
					 sb.append(a.toUpperCase().charAt(j));
					 k++;
				 } else if(Character.isUpperCase(a.charAt(j))) {
					 if(j == 0)
						 sb.append(a.charAt(j));
					 else if(a.toUpperCase().charAt(j - 1) != a.toUpperCase().charAt(j))
						 sb.append(a.charAt(j));
				 }
			 }			 
			 
			 System.out.println(sb.toString().toUpperCase().equals(b.toUpperCase())? "YES":"NO");
		 }
    }
}
