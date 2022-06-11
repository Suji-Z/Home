package bkjoonEx;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int linecnt = sc.nextInt();
		
		for(int i=1; i<=linecnt; i++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d\n",i,A,B,(A+B));
		}
		
	}

}
