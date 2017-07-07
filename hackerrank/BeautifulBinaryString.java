package hackerrank;

import java.util.Scanner;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        
        int num = (B.length() - B.replaceAll("010", "").length())/3;
        System.out.println(num);
	}

}
