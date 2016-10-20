package br.com.friday13.hacker.rank;

import java.util.Scanner;

public class SolutionArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	int[] output = new int[n];
    	int index = 0;
    	for(int i = 0; i <= n-1; i++){
    		if((i - k) >= 0){
    			index = i - k; 
    		}else{
    			index = (i - k) + n;
    		}
    		output[index] = a[i];
    	}
    	return output;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
    }
}
