package bkjoonEx;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		//아스키코드로 출력하기
		//정수는 문자열로 출력하도록 ?
		
//		방법 1. scanner 사용 (조금 비효율적)
//		Scanner sc = new Scanner(System.in);
//		
//		int ascii = sc.next().charAt(0); //chartAt로 ascii 정수를 문자열로 변환-> 아스키코드'문자' 로 반화ㅏㄴ
//		
//		System.out.print(ascii);
		
		int ascii = System.in.read(); //정수로 받아냄
		System.out.print(ascii);
	}

}
