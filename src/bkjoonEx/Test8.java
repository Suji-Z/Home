package bkjoonEx;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int sec = 0,sum=0;
		
		
		for (int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)<='C') {
				sec=3;
			}
			else if (str.charAt(i)<='F') {
				sec=4;
			}
			else if (str.charAt(i)<='I') {
				sec=5;
			}
			else if(str.charAt(i)<='L') {
				sec=6;
			}
			else if(str.charAt(i)<='O') {
				sec=7;
			}
			else if(str.charAt(i)<='S') {
				sec=8;
			}
			else if(str.charAt(i)<='V') {
				sec=9;
			}
			else if(str.charAt(i)<='Z') {
				sec=10;
			}
			
			sum+=sec;
		}
		System.out.println(sum);
	}

}
