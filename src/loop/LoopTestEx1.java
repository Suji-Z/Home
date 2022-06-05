package loop;

import java.util.Scanner;

public class LoopTestEx1 {

	public static void main(String[] args) {
		// 각각 A,B를 입력받고 A+B를 출력
		// 파일 종료 시점은 정해져있지 않음. EOF -
		
		Scanner sc = new Scanner(System.in);
	
		
		while(sc.hasNextInt()) {
//	입력값이 정수일경우 true를 반환, 정수가 아닐 경우 예외처리하여
//	더이상 입력을 받지 않고 false로 반환되며 반복문 종료.
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		
	}

}
