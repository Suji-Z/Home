import java.util.Scanner;

//�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ���
//ex; N=5, 1 2 3 4 5

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
	}
  }