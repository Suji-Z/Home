package array;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ArrayTestEx1 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int i,j,num1;
		
		Random rd = new Random();
		int num[] = new int[1];
		char answer;
		
		int n=0;
		
	
		while(true) {
			num[n] = rd.nextInt(10)+1;
			//n�� �ʱ�ȭ �� �� ���� ���� ���� �߻��ؾ� while�� �ȿ��� �������� ����.
			
			for(i=0; i<3; i++) {
				System.out.print("["+(i+1)+"��°] ���� �Է�: ");
				num1 = sc.nextInt();	//�����߻� ���� �ٷ� ����� �� �Է�

					if(num1==num[n]) {
						System.out.println("�¾Ҿ��!");
						break;
					}
					
					else	
						System.out.println("Ʋ�Ⱦ��!");
					
				}	//�� 3�� �ݺ��ҵ��� ����,������ ����ؾ��ϹǷ� ��¹��� for���ȿ�
					//if������ ����
			
			System.out.println("������ "+ num[n]+ "�Դϴ�."+'\n');
		
			System.out.print("��� �Ͻðڽ��ϱ�?[Y/N]");
			answer = (char) System.in.read();	
			
//**(char)System.in.read ���� 
//	System.in.read�� ����ڰ� �Է��� ���� int�� �ҷ��� ��, char �ڷ������� �����ؾ���
		
			if(answer!='y'&&answer!='Y') {
				System.out.println("���α׷� ����");
		
				break;	//break�� ���� while���� ������������ ����
			}
		
			
			}
	}
}
	


