package bkjoonEx;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int temp=0;
		
		
		if ((A%10)<(B%10) || ((A%10)==(B%10)&&(A%100)<(B%100)) || ((A%10)==(B%10)&&(A%100)==(B%100)&&(A/100)<(B/100))) {
			temp = A;
			A = B;
			B = temp;
		}
		
		String str_A = Integer.toString(A); 	//���� A�� ���ڿ��� ���� 
		
//		StringBuffer sb = new StringBuffer(str_A);
//		String reverse = sb.reverse().toString();		//���ڿ��� �ݴ�� ������ִ� �޼ҵ� reverse()
//		
//		System.out.println(reverse);
		
		
		String reverse="";
		for (int i=str_A.length()-1; i>=0; i--) {
			
			reverse = reverse+str_A.charAt(i);
			
		}
		
		System.out.println(reverse);
		
		
		
	}

}
