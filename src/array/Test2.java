package array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//�ڿ��� A,B,C 
		//A*B*C = mul
		//mul�� ���� 0-9������ ������ ���� ����.. ex) 17037300 = 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2��
		//����� ���� ���X, 0-9������ ���ڰ� ���� ��� �ִ��� count

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A*B*C;
		
		int cnt=0;

		String str = Integer.toString(mul); //���� ����� ���ڿ��� ����
		
		for(int i=0; i<10; i++) {	
			for(int j=0; j<str.length(); j++) {  //���� ���� ���̷� �ݺ��� ������
				if((str.charAt(j)-'0')==i) { //����1�� 49 ->'0' Ȥ�� 48 ����. '0'=�ƽ�Ű�ڵ� 48
											 //index 0���� ���ƾ� �ϹǷ� 0���� ����������..
					
					//17037300 
					cnt++;
				}
				
			}
			System.out.print(cnt); // �� ���� ���� �ľ��� 0-9���� 10ȸ �������� cnt�� ����
			
			cnt = 0; //�ʱ�ȭ ������ ������ �� �迭�ڸ����� �� ������ ���̾ƴ�,�� �� ������ �� 
//						ex) 3 1 0 2 0 0 0 2 0 0 0 -> 3 4 4 6 6 6 6 8 8 8 
			System.out.println();
		}
	}

}
