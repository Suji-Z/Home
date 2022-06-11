package clock;

import java.util.Scanner;

public class ClockData {
	Scanner sc = new Scanner(System.in);
	
	int H, M;

	public void input() {
		
		H = sc.nextInt();
		M = sc.nextInt();
		
	}
	
	public void minus() {
		
		int time = sc.nextInt();
		
		
			if(M>=time) {
			
				M-=time;
			}
		
			else if (M<time && H>0) {
				M=60-(time-M);
				H-=1;
			}
		
			else if(M<45 && H==0) {
				M=60-(time-M);
				H=23;
			}
			
		
	}
	
	public void print() {
		
		System.out.printf("%d %d",H,M);
	}
	
}
