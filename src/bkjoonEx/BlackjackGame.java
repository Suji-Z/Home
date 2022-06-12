package bkjoonEx;

import java.util.Scanner;

public class BlackjackGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int sum=0, temp=0;
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			for (int j=i+1; j<N; j++) {
				for (int k=j+1; k<N; k++) {
					
					sum = arr[i]+arr[j]+arr[k];	
	
					if(temp < sum && sum <= M)	
						temp = sum;		//���� ���� ������ ���� temp�� ����, ���� �հ� ��
				}
					
			}
		}
		System.out.println(temp);
			
	}

}

