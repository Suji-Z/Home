package practice;

import java.util.Scanner;

public class AcDay5TestEx1 {
//	5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� ����
//	   ���� ū���� �������� ���
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		int i;
		
		System.out.print("���� 5���� �Է��ϼ���: ");
		for (i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}

		int max = num[0];
		int min = num[0];
		
		
		for(i=0; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
			System.out.printf("���� ū ��: %d, ���� ���� ��: %d",max,min);
			
		
	}

}
