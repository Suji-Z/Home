package bkjoonEx;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//알파벳 소문자로만 이루어진 단어 S
		//각각의 알파벳(A to Z)가 단어에 포함되어 있는 경우 처음 등장하는 위치 출력.
		//포함되어있지 않은 경우 -1을 출력
		//첫번째 글자는 0번째 위치. -> 배열 이용
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i=97; i<=122; i++) {
			System.out.print(str.indexOf(i)+" ");			//indexOf -> 문자열에서 찾고자 하는 문자가 없을경우
															//자동으로 -1 출력.
		}
	}

}