import java.util.Scanner;

public class Main2 {

//	자연수 N, N부터 1까지 한 줄에 하나씩 출력
//	N=5, 5-4-3-2-1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

//		큰수부터 작은수대로 출력하게 하려면..?

//		N,N-1,N-2,N-3,N-4...
		for(int i=0; i<=N; i++) {
			if((N-i)>0) {
				System.out.println(N-i);
			}
		}
	
	}

}
