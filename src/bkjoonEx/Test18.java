package bkjoonEx;

import java.util.Scanner;

public class Test18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();


		for(int i=M; i<=N; i++) {
			
			boolean isPrime = true;
			
			for(int j=2; j<N; j++) {
				
				if(i%j==0) {
					
					isPrime = false;
				}
			}
			
			if(!isPrime) 
				System.out.println(i);
		
		}
		
	}
	
	

}


