package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	
		int i;
		int j;
		
		System.out.print("A : ");  //A와 B를 한줄에 공백 한칸으로 나타나게 하려면?
		i = Integer.parseInt(br.readLine());
		
		System.out.print("B : ");
		j = Integer.parseInt(br.readLine());
		
		if (i>j) {
			System.out.println(">");
		}
		else if(i<j) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
			
		
		
	}

}
