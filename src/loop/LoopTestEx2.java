package loop;

import java.util.Scanner;

public class LoopTestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = N;
		int cnt=0;
		
		while(true) {
			//항상 10의자리 + 1의자리
			//68=> 6+8=14, result=84 의 경우. 
			//(68%10)*10으로 일의 자리숫자 8을 나머지로 받아낸 후 *10하여 십의자리로 만들어줌
			//이후 68을 60은 /10으로 6, 8은 나머지로 받아내어 서로 더한 후 
			//합산 결과인 14의 일의자리 숫자만 남기기 위해 한번 더 10으로 나눠 나머지만 남기는 과정
			
			result = (result%10)*10+(result/10+result%10)%10;
			cnt++;
			if(result==N) 
				break;
			
		}
		
		System.out.println(cnt);
	}

}
