package bkjoonEx;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt=0, i=0, sum=1;
		
		while(true) {
			i++;
			sum+=6*i;
			
			
			if(N==1) {
				cnt = 1;
				System.out.print(cnt);
				break;
				
			}
			
			else if(N<=sum) {	
				cnt = i+1;
				System.out.print(cnt);
				break;
			}
			

		}
	}
}
