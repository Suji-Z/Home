package array;

import java.util.Scanner;

public class ArrayTestEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		�Է�: line(C) , �л� ��(N), ����(score)
//		for������ line��ŭ�� ����ϵ��� ����
//      �� ���� �л� �� ��ŭ�� ����ϵ��� ���� for������ ����
		
		int line = sc.nextInt();
		int n =0;
		
		for(int i=0; i<line; i++) {
			int N=sc.nextInt();	//�л� �� �Է�
			int arr[]=new int[N];

			int sum = 0;
			
			
			for(int j=0; j<N; j++) {
				//i�� ���� j���� ���۵ɶ����� ���� �Է¹ޱ�
				
				int score = sc.nextInt();
				arr[j] = score;
				sum+=score;
				
				//score�� �Է� �ɶ����� �ջ�
				
				} //ù��° ���� 1�� �� ���� 	
			
			double avg = sum/N;
			double high=0; //int���ϸ� %f�� ��½� ������..�Ф� double�� ��
			
			for(int j=0; j<N; j++) { //�ٽ� ���� 1�� ��հ� ��, 0�� -, 1��-, 2��-, 3��+,4��+ 
			
				if(arr[j]>avg) {
					high++;
				}
			}
			System.out.printf("%.3f%%\n",(high/N)*100);
		}// '%' �� printf���� ����Ϸ��� %%�� ����� ��µ�
		
	}

}
