package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Test7 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int A,B;
		StringTokenizer st;
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			bw.write((A+B) + "\n");		
		}
		bw.flush(); //flush�� ���ϸ� ����� �ȶߴ� ������..?
	
		//BufferedWriter�� ��Ȯ�� ����. �� StringTokenizer�� �Բ�����ϴ���?
	}

}
