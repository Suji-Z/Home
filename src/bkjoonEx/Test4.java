package bkjoonEx;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
//		���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ�
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //�׽�Ʈ ���̽� ����
		
		//�ݺ� Ƚ��R,  ��� P 
		//A:
		for (int i=0; i<num; i++) {
			
			int R = sc.nextInt();
			String s = sc.next();
			char[] arr = s.toCharArray();	//���ڿ� ���ڸ� �� �迭�� �ѱ��ھ� ����
													
			for(int j=0; j<arr.length; j++) {
				
				for(int k=0; k<R; k++) {
					System.out.print(arr[j]);
					
					}
					
				}
			System.out.println();
				
				
			}
		}


	}


