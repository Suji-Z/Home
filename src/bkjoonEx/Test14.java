package bkjoonEx;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
	
		int cookingTime = sc.nextInt();
		
		int H_Add = (M+cookingTime)/60;
		int result = (M+cookingTime)%60;
		
		if(M+cookingTime<60) {
			
			System.out.printf("%d %d", H, (M+cookingTime));
		}
		
		else if (M+cookingTime>=60) {
			
			H += H_Add;
			 
			if(H>23) {
				H-=24;
			}
			
			System.out.printf("%d %d", H, result);
			
		}
		

	}

}
