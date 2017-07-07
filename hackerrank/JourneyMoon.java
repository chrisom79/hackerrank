package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class JourneyMoon {
	public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);
      
        List<List<Integer>> astros = new ArrayList<List<Integer>>(N);
        for(int i = 0; i < N; ++i){
          astros.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            
            astros.get(a).add(b);
            astros.get(b).add(a);
        }
        
        boolean[] visit = new boolean[N];
        List<Integer> sizes = new ArrayList<Integer>();
        for(int i = 0; i < N; ++i){
          int size = 0;
          final Queue<Integer> cola = new ArrayDeque<Integer>();
          
          cola.add(i);          
          do {
            int index = cola.poll();
            if(!visit[index]){              
            	visit[index] = true;
              cola.addAll(astros.get(index));
              size++;
            }
          } while(!cola.isEmpty());
          
          if(size > 0){
        	  sizes.add(size);
          }
        }
        
        long combinations = 0;
        long group = N;
        
        for(Integer size : sizes){
        	group -= size;
        	combinations += size * group;
          }
        
        System.out.println(combinations);

    }
}

