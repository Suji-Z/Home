package practice;

import java.util.Scanner;
public class SPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int math;
		
		System.out.print("�̸�?");
		name = sc.next(); //�ν��Ͻ� ���� sc�� next�޼ҵ�, ���� ���������� ���ڿ��� �Է¹���
//							nextLine()�� ������ �� �о��(?)
		
		System.out.print("����?");
		math = sc.nextInt(); //������ �Ǽ��� next + �ڷ���(), ���ڿ���ü�� nextLine()
		
		System.out.println(name + " : " + math);
		

	}

}
