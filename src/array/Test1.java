package array;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//9���� ���� �ٸ� �ڿ���
		//�ִ� ���
		// �ִ��� ���°����?
		//ex) 3, 29, 38, 12, 57, 74, 40, 85, 61 �� �ִ��� 85 lineNumber�� 8
	
		Scanner sc = new Scanner(System.in);
		
		int lineCnt = 0,max,i;
		
		int n[] = new int[9];
		
		for(i=0; i<n.length; i++) {
		   n[i] = sc.nextInt();
		}
	
		max = 0;
		
		for(i=0;i<n.length;i++) {
			if(max<n[i]) {
				max=n[i];
				
				lineCnt = i+1;
			}
		}
		
	
		System.out.println(max);
		System.out.print(lineCnt);
		
	}

}
