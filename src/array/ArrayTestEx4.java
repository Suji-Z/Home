package array;

import java.util.Scanner;

public class ArrayTestEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		입력: line(C) , 학생 수(N), 점수(score)
//		for문으로 line만큼만 출력하도록 제한
//      각 열은 학생 수 만큼만 출력하도록 이중 for문으로 제한
		
		int line = sc.nextInt();
		int n =0;
		
		for(int i=0; i<line; i++) {
			int N=sc.nextInt();	//학생 수 입력
			int arr[]=new int[N];

			int sum = 0;
			
			
			for(int j=0; j<N; j++) {
				//i행 가로 j열이 시작될때마다 점수 입력받기
				
				int score = sc.nextInt();
				arr[j] = score;
				sum+=score;
				
				//score값 입력 될때마다 합산
				
				} //첫번째 가로 1열 합 도출 	
			
			double avg = sum/N;
			double high=0; //int로하면 %f로 출력시 오류남..ㅠㅠ double로 꼭
			
			for(int j=0; j<N; j++) { //다시 가로 1열 평균과 비교, 0번 -, 1번-, 2번-, 3번+,4번+ 
			
				if(arr[j]>avg) {
					high++;
				}
			}
			System.out.printf("%.3f%%\n",(high/N)*100);
		}// '%' 를 printf에서 출력하려면 %%로 적어야 출력됨
		
	}

}
