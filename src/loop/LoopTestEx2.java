package loop;

import java.util.Scanner;

public class LoopTestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = N;
		int cnt=0;
		
		while(true) {
			//�׻� 10���ڸ� + 1���ڸ�
			//68=> 6+8=14, result=84 �� ���. 
			//(68%10)*10���� ���� �ڸ����� 8�� �������� �޾Ƴ� �� *10�Ͽ� �����ڸ��� �������
			//���� 68�� 60�� /10���� 6, 8�� �������� �޾Ƴ��� ���� ���� �� 
			//�ջ� ����� 14�� �����ڸ� ���ڸ� ����� ���� �ѹ� �� 10���� ���� �������� ����� ����
			
			result = (result%10)*10+(result/10+result%10)%10;
			cnt++;
			if(result==N) 
				break;
			
		}
		
		System.out.println(cnt);
	}

}
