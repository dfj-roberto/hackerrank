package br.com.friday13.hacker.rank;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class SolutionRansomNote {
	Map<String, Queue<Integer>> magazineIndex;
    Map<Integer, String> magazineMap;
    Map<Integer, String> noteMap;
    
    public SolutionRansomNote(String magazine, String note) {
   		magazineIndex = new HashMap<String, Queue<Integer>>();
        magazineMap = new HashMap<Integer, String>();
		noteMap = new HashMap<Integer, String>();
		
		int i = 0;
		for (String value: magazine.split(" ")){
			if(magazineIndex.containsKey(value)){
				magazineIndex.get(value).add(i);
			}else{
				Queue<Integer> ids = new LinkedBlockingQueue<Integer>();
				ids.add(i);
				magazineIndex.put(value, ids);
			}
			magazineMap.put(i, value);
			i++;
		}
		
		i=0;
		for (String value: note.split(" ")){
			noteMap.put(i,  value);
			i++;
		}
    }
    
    public boolean solve() {
		boolean found = false;
		for(String value : noteMap.values()){
			if(magazineMap.containsValue(value)){
                Integer index = magazineIndex.get(value).poll();
                if(null == index){
                	found = false;
    				break;
                }
				magazineMap.remove(index);
				found = true;
			}else{
				found = false;
				break;
			}
		}
		return found;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        SolutionRansomNote s = new SolutionRansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }

}
