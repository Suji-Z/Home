package condition;

import java.util.Scanner;

public class IfTestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		
		
//		같은 수 3개일때 / 같은 수 2개일때 / 모두 다를 때 각각 설정
		
		if(dice1==dice2 && dice1==dice3) {
			System.out.print(10000+dice1*1000);
		}
		
		else if(dice1==dice2 || dice1==dice3 || dice2==dice3) {
			if(dice1==dice2 || dice1==dice3) {
				System.out.print(1000+dice1*100);
			}
			else {
				System.out.print(1000+dice2*100);
			}
		}
		
		else {
			int max=0;
			
			if(max<dice1) {
				max=dice1;
			}
			if(max<dice2) {
				max=dice2;
			}
			if(max<dice3) {
				max=dice3;
			}
			
			System.out.print(max*100);
		}
		
	}

}
