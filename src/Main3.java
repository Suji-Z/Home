import java.util.Scanner;

public class Main3 {
//A,B를 입력받아 A+B를 출력
	//Line number 'T를 첫번째로 출력
	//한줄에 A,B 입력. 출력은 Case #n : A+B
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #"+i+": "+(A+B));
		}

	}

}