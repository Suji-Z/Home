package bkjoonEx;

import java.util.Scanner;

public class Test7 {

	//다이얼 숫자 계산
	// (ABC) = 2, (DEF)=3, (GHI)=4, (JKL)=5, (MNO)=6, (PQRS)=7, (TUV)=8, (WXYZ)=9
	// sec = +1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char alp[] = new char[26];	//A to Z (65 - 90)

		String str = sc.next();
		char[] input = new char[str.length()];

		for(int i=0; i<str.length(); i++) {

			input[i]=(str.charAt(i)); 		//문자 배열에 입력받은 문자열 한글자씩 담기(ex.'W','A)
		}

		int cnt = 2;
		int sum=0, sec=0;

		for(int i=0; i<alp.length; i++) {	// alp A to Z까지 검열


			for (int j=65; j<alp.length+65; j++) {

				alp[i]=(char) j;

				if (j>=65 && j<=67) {
					cnt =3;
				}
				else if (j>=68 && j<=70) {
					cnt =4;
				}
				else if (j>=71 && j<=73) {
					cnt =5;
				}
				else if (j>=74 && j<=76) {
					cnt =6;
				}
				else if (j>=77 && j<=79) {
					cnt =7;
				}
				else if (j>=80 && j<=83) {
					cnt =8;
				}
				else if (j>=84 && j<=86) {
					cnt =9;
				}
				else if (j>=87 && j<=90) {
					cnt =10;
				}
					

			}		

		}
		System.out.println();
		System.out.println(sum);

	}

}
