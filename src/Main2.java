import java.util.Scanner;

public class Main2 {

//	�ڿ��� N, N���� 1���� �� �ٿ� �ϳ��� ���
//	N=5, 5-4-3-2-1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

//		ū������ ��������� ����ϰ� �Ϸ���..?

//		N,N-1,N-2,N-3,N-4...
		for(int i=0; i<=N; i++) {
			if((N-i)>0) {
				System.out.println(N-i);
			}
		}
	
	}

}
