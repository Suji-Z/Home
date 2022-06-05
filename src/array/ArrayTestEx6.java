package array;

import java.util.Scanner;

public class ArrayTestEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int arr[] = new int[line];
		int temp=0;
		
		for(int i=0; i<line; i++) {
			arr[i] = sc.nextInt();
		}
			
		for(int i=0; i<line-1; i++) {
			for (int j=i+1; j<line; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				}
			
			}
		
		for(int i=0; i<line; i++) {
			System.out.println(arr[i]);
		}
		
		} 
		
	}

