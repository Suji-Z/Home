package array;

import java.util.Scanner;

public class ArrayTestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 점수 조작 문제
		// 점수 중 최댓값 = M
		// 모든 점수를 각 score/M*100 으로 출력(total)
		//ex) 최고점 70, 수학점수 50 -> 수학점수:50/70*100 = 71.43(double)
		//새로운 평균 도출
		

		
		int M = 0;
		double total = 0,sum=0;
		
		int N = sc.nextInt();
		
		double score[] = new double[N];
		
			for(int i=0; i<N; i++) {
		
				score[i] = sc.nextDouble(); //40 80 60
			}
			
//		1.최댓값 구하기
			
			for(int i=0; i<N; i++) {
				
					if(M<score[i]) { //
						M=(int) score[i];	
							//최댓값 도출
					}
			}
			 
//		2.for로 N만큼 반복해서.. score[i]/M*100 반복. -> 그럼 score[i]는 double
//			이후 double total += score[i]
			
		
			for(int i=0; i<N; i++) {
				
				sum = score[i]/M*100;
				total += sum;
				
			}
			
				double avg=total/N;
			
				System.out.println(avg);
		}
		

}
