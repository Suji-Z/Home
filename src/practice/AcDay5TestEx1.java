package practice;

import java.util.Scanner;

public class AcDay5TestEx1 {
//	5개의 정수를 입력받아 입력받은 수를 출력하고 입력받은 수중
//	   가장 큰수와 적은수를 출력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		int i;
		
		System.out.print("정수 5개를 입력하세요: ");
		for (i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}

		int max = num[0];
		int min = num[0];
		
		
		for(i=0; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
			System.out.printf("가장 큰 수: %d, 가장 작은 수: %d",max,min);
			
		
	}

}
