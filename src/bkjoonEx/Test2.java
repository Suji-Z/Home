package bkjoonEx;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int sum=0;
	
		String n = sc.next();	//������� �����Ϸ��� string���� �޾Ƴ� �� ������ ���������
		
		for(int i=0; i<cnt; i++) {
			sum+=n.charAt(i)-'0';	//String�� ���ڿ� 01234 �� -'0'���� ������ ��ȯ���� ������ 
		}
		
		System.out.print(sum);

	}

}
