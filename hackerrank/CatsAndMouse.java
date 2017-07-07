package hackerrank;

import java.util.Scanner;

public class CatsAndMouse {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int dist1 = Math.abs(z - x);
            int dist2 = Math.abs(z - y);
            
            if(dist1 < dist2) {
            	System.out.println("Cat A");
            } else if(dist2 < dist1) {
            	System.out.println("Cat B");
            } else {
            	System.out.println("Mouse C");
            }
        }
    }
}
