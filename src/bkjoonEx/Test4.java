package bkjoonEx;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
//		문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //테스트 케이스 개수
		
		//반복 횟수R,  결과 P 
		//A:
		for (int i=0; i<num; i++) {
			
			int R = sc.nextInt();
			String s = sc.next();
			char[] arr = s.toCharArray();	//문자열 문자를 각 배열에 한글자씩 저장
													
			for(int j=0; j<arr.length; j++) {
				
				for(int k=0; k<R; k++) {
					System.out.print(arr[j]);
					
					}
					
				}
			System.out.println();
				
				
			}
		}


	}


