package br.com.friday13.hacker.rank;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionMarsExploration {
	
	public static final char[] MSG = "SOS".toCharArray();
	
	public static int compareAllLtters(char[] value){
		int ret = 0;
		for(int i=0; i < 3; i++){
			if(MSG[i] != value[i]){
				ret++;
			}
		}
		return ret;
	}
	
	public static int validateMessage(String message){
		int errNbr = 0;
		for(int i=0; i < message.length(); i=i+3){
			char[] auxMsg = message.substring(i, i+3).toCharArray();
			if(!Arrays.equals(MSG, auxMsg)){
				errNbr+=compareAllLtters(auxMsg);
			}
		}
		return errNbr; 
	}
	
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(validateMessage(in.next()));
    }
}