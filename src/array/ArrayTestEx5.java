package array;

import java.util.Scanner;

public class ArrayTestEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int B=42;
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++) {	// 총 10행까지 A 각각 입력받아 출력
			
			int A = sc.nextInt();
			
			arr[i] = A%B;	//배열에 각 나머지값을 담아둠
		}
		
		int cnt=0;
		for (int i=0; i<10; i++) {	//배열 값들끼리 비교하기
			int temp=0;				
			
			for(int j=i+1; j<10; j++) {	//ex)arr[0]=1 일때, arr[1~9] 중 중복 여부 확인
				if(arr[i]==arr[j]) {
					temp++;		//중복이 있으면 +1로 체크
				}
			}
			if(temp==0) {		//arr[0]이 다른 배열값과 중복되지 않는 숫자일때 cnt+1
				cnt++;			
			}
		}
		System.out.println(cnt);
		}
			
	}

