package practice;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("시험 점수 : ");
		score = sc.nextInt();
		
		String pan;
		
		if(score<=100 && score >=0) {
	
				if(score>=90) {
					pan = "A";
				}
				else if(score>=80) {
					pan = "B";
				}
				else if(score>=70) {
					pan = "C";
				}
				else if(score>=60) {
					pan = "D";
				}
				else {
					pan = "F";
				}
			System.out.println(pan);
		 }
	 }
}
