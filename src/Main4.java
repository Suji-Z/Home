import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		line number = T
//		A,B를 입력받아 A+B를 출력
//		Case #n: A + B = sum 으로 출력
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A+B;
			System.out.println("Case #"+i+": "+ A + " + " + B +" = "+C);
		}
		
	}

}
