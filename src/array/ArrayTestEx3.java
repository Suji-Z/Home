package array;

import java.io.IOException;
import java.util.Scanner;

public class ArrayTestEx3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		//만약 사용자가 3을 입력하면 str[3] 0,1,2..  for문 안써도됨
		
		String str[] = new String[sc.nextInt()];
		
		for (int i=0; i<str.length; i++) {
			str[i]=sc.next();
		}
		
		for (int i=0; i<str.length; i++) {
			int sum=0;
			// score를 여기서 초기화 안해주면 앞줄 합산 값에서 누적됨
			int score=0;
			for (int j=0; j<str[i].length();j++) {	//j는 첫번째 문자열 index값만큼 반복해서 O 개수 검열용
				
				if(str[i].charAt(j)=='O') {	//charAt()는 string 문자열 중 '한개'만 출력
					score++;
				}
				else {
					score=0;
				}
				sum += score;
			}
			System.out.println(sum);
		}
		
	}

}
