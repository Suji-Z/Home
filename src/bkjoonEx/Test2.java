package bkjoonEx;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int sum=0;
	
		String n = sc.next();	//공백없이 연산하려면 string으로 받아낸 후 정수합 시켜줘야함
		
		for(int i=0; i<cnt; i++) {
			sum+=n.charAt(i)-'0';	//String의 문자열 01234 를 -'0'으로 정수로 변환시켜 누적합 
		}
		
		System.out.print(sum);

	}

}
