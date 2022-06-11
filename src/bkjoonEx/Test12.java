package bkjoonEx;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//불기연도 -> 서기연도 변환
		//불기연도 = 서기연도 + 544
		int y = sc.nextInt();
		
		System.out.println(y-543);
	}

}
