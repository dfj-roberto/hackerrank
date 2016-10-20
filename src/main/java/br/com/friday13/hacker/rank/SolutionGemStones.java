package br.com.friday13.hacker.rank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SolutionGemStones {
	
	public static  Set<String> createStoneElementsList(String value){
		List<String> values = Arrays.asList(value.split(""));
		return  new TreeSet<String>(values);
	}

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Set<String> stoneSet = createStoneElementsList(in.next());
		for(int i=1; i < n; i++){
			stoneSet.retainAll(createStoneElementsList(in.next()));
		}
		System.out.println(stoneSet.size()-1);
     }
}