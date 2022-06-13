package bkjoonEx;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int total = sc.nextInt();
		int[] arr = {1,5,10,50,100,500,1000,5000,10000,50000};
		int sum = 0, cnt=0;
		
		
		for(int i=0; i<line; i++) {
			System.out.println(arr[i]);
	
		}
		
		for(int i=line-1; i>=0; i--) {
			
			if(arr[i] <= total) {
				
				cnt += (total / arr[i]);
				total = total % arr[i];
				
				}
			}
		System.out.println(cnt);
		
	}

}
