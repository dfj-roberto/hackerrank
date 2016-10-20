package br.com.friday13.hacker.rank;

import java.util.Scanner;

public class SolutionFunnyString {
	
	public static String inverterString(String value){
		char[] result = new char[value.length()];
		int step = value.length() - 1;
		for(char c : value.toCharArray()){
			result[step] = c;
			step--;
		}
		return new String(result);
	}
	
	public static boolean validateFunny(char[] value, char[] reverseValue){
		boolean result = true;
		int step = 1;
		while(step < value.length){
			if((Math.abs(value[step] - value[step-1]) != 
				Math.abs(reverseValue[step] - reverseValue[step-1]))){
				result = false;
				break;
			}
			step++;
		}
		return result;
	}

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0; i < n; i++){
			String value = in.next();
			String reverseValue = inverterString(value);
			if(validateFunny(value.toCharArray(), reverseValue.toCharArray())){
				System.out.println("Funny");
			}else{
				System.out.println("Not Funny");
			}
		}
    }
}