package bkjoonEx;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S
		//������ ���ĺ�(A to Z)�� �ܾ ���ԵǾ� �ִ� ��� ó�� �����ϴ� ��ġ ���.
		//���ԵǾ����� ���� ��� -1�� ���
		//ù��° ���ڴ� 0��° ��ġ. -> �迭 �̿�
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i=97; i<=122; i++) {
			System.out.print(str.indexOf(i)+" ");			//indexOf -> ���ڿ����� ã���� �ϴ� ���ڰ� �������
															//�ڵ����� -1 ���.
		}
	}

}