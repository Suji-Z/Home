package bkjoonEx;

import java.util.Scanner;

public class FactorialEx {

	public static int factorial(int num) {	//factorial => num = n, n! n*(n-1)*(n-2)...
		
		int sum = 1;
		for(int i = 2; i<=num; i++) {
			sum*=i;
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
	}

}
