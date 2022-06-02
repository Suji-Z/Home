package practice;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(A+B);
		}
	}
}