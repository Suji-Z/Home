package practice;

public class DanTest {

	public static void main(String[] args) {
		int dan = 2;
		int i;
		
		for (dan = 2; dan<=9; dan++) {
			System.out.print("[" + dan + "]��\t");
		}
		System.out.println();
		for ( i = 1; i<=9; i++) {
			for (dan = 2; dan<=9; dan++) {
			System.out.print(dan + "*" + i + "=" + dan*i + "\t");
		// ���� ����, �ڿ� �������� i ���� 1���� 9������ �����ϵ��� ����
		}
			System.out.println();
	}
	}
}
