import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		line number = T
//		A,B�� �Է¹޾� A+B�� ���
//		Case #n: A + B = sum ���� ���
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A+B;
			System.out.println("Case #"+i+": "+ A + " + " + B +" = "+C);
		}
		
	}

}
