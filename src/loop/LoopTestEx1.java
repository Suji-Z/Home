package loop;

import java.util.Scanner;

public class LoopTestEx1 {

	public static void main(String[] args) {
		// ���� A,B�� �Է¹ް� A+B�� ���
		// ���� ���� ������ ���������� ����. EOF -
		
		Scanner sc = new Scanner(System.in);
	
		
		while(sc.hasNextInt()) {
//	�Է°��� �����ϰ�� true�� ��ȯ, ������ �ƴ� ��� ����ó���Ͽ�
//	���̻� �Է��� ���� �ʰ� false�� ��ȯ�Ǹ� �ݺ��� ����.
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		
	}

}
