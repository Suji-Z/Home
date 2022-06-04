package array;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ArrayTestEx1 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int i,j,num1;
		
		Random rd = new Random();
		int num[] = new int[1];
		char answer;
		
		int n=0;
		
	
		while(true) {
			num[n] = rd.nextInt(10)+1;
			//n을 초기화 한 후 제일 먼저 난수 발생해야 while문 안에서 난수값이 고정.
			
			for(i=0; i<3; i++) {
				System.out.print("["+(i+1)+"번째] 정수 입력: ");
				num1 = sc.nextInt();	//난수발생 이후 바로 사용자 값 입력

					if(num1==num[n]) {
						System.out.println("맞았어요!");
						break;
					}
					
					else	
						System.out.println("틀렸어요!");
					
				}	//총 3번 반복할동안 정답,오답을 출력해야하므로 출력문도 for문안에
					//if문으로 적용
			
			System.out.println("정답은 "+ num[n]+ "입니다."+'\n');
		
			System.out.print("계속 하시겠습니까?[Y/N]");
			answer = (char) System.in.read();	
			
//**(char)System.in.read 사용법 
//	System.in.read가 사용자가 입력한 값을 int로 불러올 때, char 자료형으로 변경해야함
		
			if(answer!='y'&&answer!='Y') {
				System.out.println("프로그램 종료");
		
				break;	//break를 통해 while문을 빠져나가도록 설정
			}
		
			
			}
	}
}
	


