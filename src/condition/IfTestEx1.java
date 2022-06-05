package condition;

import java.util.Scanner;

public class IfTestEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int h=0, m=0;
		
		int sum=0;
		
		if(A>=0 && A<=23 && B>=0 && B<=59) {
			int min = sc.nextInt();
			
			sum=B+min;
			int div = sum/60;	//시간에 몫을 + 해주기 위함
			int remain = sum%60;
			
			h = A+div;
			
			if(sum<60) {
				System.out.println(A + " " + sum);
			}
			
			if(sum>=60 && remain ==0) {
				if(h>23) {
					h-=24;
				}
				
				System.out.println(h + " "+ m);
			}
			
			if(sum>=60 && remain !=0) {
				if(h>23) {
					h-=24;
				}
				System.out.println(h + " " + remain);
			}
			
		}

	}

}
