package array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		A, B �׸��� A%B (������)
//		�� 10�� �Է¹ް� 42�� ���� �������� ���� ��, ���� �ٸ� �� ���� ���ϱ�
		
		
		int B = 42;
		int cnt=0;
		
		//remain�� �迭
		
		for(int i=0; i<10; i++) {
			int A = sc.nextInt();
		
			int remain = (A%B);
		
			String str = Integer.toString(remain);
	
		
			for(i=0; i<10; i++) {	
				for(int j =0; j<str.length(); j++) {
					if((str.charAt(j)-'0')!=remain) {
						cnt++;
					}
					
				}
				
					
			}
		
		}
		System.out.print(cnt);
	}

}
