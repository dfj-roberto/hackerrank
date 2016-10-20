package br.com.friday13.hacker.rank;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionBeautifulBinaryString {
	public static int searchValue(byte[] value, int len){
		int ret = 0;
		if(value.length > 2){
			byte auxVal[] = {0,0,0};
			byte searchVal[] = {48, 49, 48};
			
			int i = 0;
			while(i < len){
				if((i + 3) <= len){
					if(value[i] == 48){
						System.arraycopy(value, i, auxVal, 0, 3);
						if(Arrays.equals(auxVal, searchVal)){
							ret++;
							i=i+2;
						}
					}
				}
				i++;
			}
		}
		return ret;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        
       	System.out.print(searchValue(B.getBytes(),n));
    }
}