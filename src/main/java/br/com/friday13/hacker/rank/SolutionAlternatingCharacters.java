package br.com.friday13.hacker.rank;

import java.util.Scanner;

public class SolutionAlternatingCharacters {
	
	public static int alternatingCharacters(byte[] value)
	{
		int ret = 0;
		byte last = value[0];
		for(int i=1; i < value.length; i++){
			Byte a = value[i];
			if(a.equals(last)){
				ret++;
			}else{
				last = value[i];
			}
		}
		return ret;
	}

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0; i < n; i++){
			System.out.println(alternatingCharacters(in.next().getBytes()));
		}
     }
}