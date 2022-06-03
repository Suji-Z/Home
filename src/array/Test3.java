package array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		A, B 그리고 A%B (나머지)
//		수 10개 입력받고 42로 나눈 나머지를 구한 후, 서로 다른 값 갯수 구하기
		
		
		int B = 42;
		int cnt=0;
		
		//remain이 배열
		
		for(int i=0; i<10; i++) {
			int A = sc.nextInt();
		
			int remain = (A%B);
		
			String str = Integer.toString(remain);
	
		
			for(i=0; i<10; i++) {	
				for(int j =0; j<str.length(); j++) {
					if((str.charAt(j)-'0')!=remain) {
						cnt++;
					}
					
				}
				
					
			}
		
		}
		System.out.print(cnt);
	}

}
