package array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//자연수 A,B,C 
		//A*B*C = mul
		//mul에 나온 0-9까지의 각각의 숫자 갯수.. ex) 17037300 = 0은 3개, 1은 1개, 3은 2개, 7은 2개
		//결과는 굳이 출력X, 0-9까지의 숫자가 각각 몇개씩 있는지 count

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int mul = A*B*C;
		
		int cnt=0;

		String str = Integer.toString(mul); //곱셈 결과를 문자열로 변경
		
		for(int i=0; i<10; i++) {	
			for(int j=0; j<str.length(); j++) {  //곱한 값의 길이로 반복문 돌리기
				if((str.charAt(j)-'0')==i) { //숫자1이 49 ->'0' 혹은 48 빼기. '0'=아스키코드 48
											 //index 0부터 돌아야 하므로 0으로 만들어줘야함..
					
					//17037300 
					cnt++;
				}
				
			}
			System.out.print(cnt); // 총 숫자 갯수 파악을 0-9까지 10회 돌릴동안 cnt는 증가
			
			cnt = 0; //초기화 해주지 않으면 각 배열자리마다 각 숫자의 합이아닌,총 합 누적이 됨 
//						ex) 3 1 0 2 0 0 0 2 0 0 0 -> 3 4 4 6 6 6 6 8 8 8 
			System.out.println();
		}
	}

}
