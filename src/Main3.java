import java.util.Scanner;

public class Main3 {
//A,B�� �Է¹޾� A+B�� ���
	//Line number 'T�� ù��°�� ���
	//���ٿ� A,B �Է�. ����� Case #n : A+B
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