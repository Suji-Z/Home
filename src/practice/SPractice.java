package practice;

import java.util.Scanner;
public class SPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int math;
		
		System.out.print("이름?");
		name = sc.next(); //인스턴스 변수 sc의 next메소드, 공백 이전까지의 문자열을 입력받음
//							nextLine()은 한줄을 다 읽어옴(?)
		
		System.out.print("수학?");
		math = sc.nextInt(); //정수나 실수는 next + 자료형(), 문자열전체는 nextLine()
		
		System.out.println(name + " : " + math);
		

	}

}
