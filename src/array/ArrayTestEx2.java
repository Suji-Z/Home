package array;

import java.util.Scanner;

public class ArrayTestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� ���� ����
		// ���� �� �ִ� = M
		// ��� ������ �� score/M*100 ���� ���(total)
		//ex) �ְ��� 70, �������� 50 -> ��������:50/70*100 = 71.43(double)
		//���ο� ��� ����
		

		
		int M = 0;
		double total = 0,sum=0;
		
		int N = sc.nextInt();
		
		double score[] = new double[N];
		
			for(int i=0; i<N; i++) {
		
				score[i] = sc.nextDouble(); //40 80 60
			}
			
//		1.�ִ� ���ϱ�
			
			for(int i=0; i<N; i++) {
				
					if(M<score[i]) { //
						M=(int) score[i];	
							//�ִ� ����
					}
			}
			 
//		2.for�� N��ŭ �ݺ��ؼ�.. score[i]/M*100 �ݺ�. -> �׷� score[i]�� double
//			���� double total += score[i]
			
		
			for(int i=0; i<N; i++) {
				
				sum = score[i]/M*100;
				total += sum;
				
			}
			
				double avg=total/N;
			
				System.out.println(avg);
		}
		

}
