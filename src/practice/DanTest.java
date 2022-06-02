package practice;

public class DanTest {

	public static void main(String[] args) {
		int dan = 2;
		int i;
		
		for (dan = 2; dan<=9; dan++) {
			System.out.print("[" + dan + "]단\t");
		}
		System.out.println();
		for ( i = 1; i<=9; i++) {
			for (dan = 2; dan<=9; dan++) {
			System.out.print(dan + "*" + i + "=" + dan*i + "\t");
		// 단은 고정, 뒤에 곱해지는 i 값만 1부터 9까지만 증가하도록 설정
		}
			System.out.println();
	}
	}
}
