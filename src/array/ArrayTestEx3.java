package array;

import java.io.IOException;
import java.util.Scanner;

public class ArrayTestEx3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		//���� ����ڰ� 3�� �Է��ϸ� str[3] 0,1,2..  for�� �Ƚᵵ��
		
		String str[] = new String[sc.nextInt()];
		
		for (int i=0; i<str.length; i++) {
			str[i]=sc.next();
		}
		
		for (int i=0; i<str.length; i++) {
			int sum=0;
			// score�� ���⼭ �ʱ�ȭ �����ָ� ���� �ջ� ������ ������
			int score=0;
			for (int j=0; j<str[i].length();j++) {	//j�� ù��° ���ڿ� index����ŭ �ݺ��ؼ� O ���� �˿���
				
				if(str[i].charAt(j)=='O') {	//charAt()�� string ���ڿ� �� '�Ѱ�'�� ���
					score++;
				}
				else {
					score=0;
				}
				sum += score;
			}
			System.out.println(sum);
		}
		
	}

}
