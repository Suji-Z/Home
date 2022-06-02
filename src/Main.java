import java.util.Scanner;

//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력
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