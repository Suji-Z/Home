package bkjoonEx;

import java.util.Scanner;

public class Test {

	long sum(int[] a) {
		long sum=0;	//a 배열의  정수 합
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		long b = sc.nextInt();
	
		Test ts = new Test();
//		
//		ts.sum();
	}
}