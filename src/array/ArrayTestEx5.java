package array;

import java.util.Scanner;

public class ArrayTestEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int B=42;
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++) {	// �� 10����� A ���� �Է¹޾� ���
			
			int A = sc.nextInt();
			
			arr[i] = A%B;	//�迭�� �� ���������� ��Ƶ�
		}
		
		int cnt=0;
		for (int i=0; i<10; i++) {	//�迭 ���鳢�� ���ϱ�
			int temp=0;				
			
			for(int j=i+1; j<10; j++) {	//ex)arr[0]=1 �϶�, arr[1~9] �� �ߺ� ���� Ȯ��
				if(arr[i]==arr[j]) {
					temp++;		//�ߺ��� ������ +1�� üũ
				}
			}
			if(temp==0) {		//arr[0]�� �ٸ� �迭���� �ߺ����� �ʴ� �����϶� cnt+1
				cnt++;			
			}
		}
		System.out.println(cnt);
		}
			
	}

