package bkjoonEx;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		//�ƽ�Ű�ڵ�� ����ϱ�
		//������ ���ڿ��� ����ϵ��� ?
		
//		��� 1. scanner ��� (���� ��ȿ����)
//		Scanner sc = new Scanner(System.in);
//		
//		int ascii = sc.next().charAt(0); //chartAt�� ascii ������ ���ڿ��� ��ȯ-> �ƽ�Ű�ڵ�'����' �� ��ȭ����
//		
//		System.out.print(ascii);
		
		int ascii = System.in.read(); //������ �޾Ƴ�
		System.out.print(ascii);
	}

}
