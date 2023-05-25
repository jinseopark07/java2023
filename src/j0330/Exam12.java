package j0330;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		//break를 이용하여 입력된 N까지만 출력하시요
		//단, N의 가장 큰 값은 100
		//ex) N:4
		//출력 1,2,3,4
		
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		int a=sc.nextInt();
		for(int i=1; i<=100; i++) {
			System.out.print(i+"\t");
			if(i==a) break;
			
		}
		
		/////////////////
		System.out.println();
		System.out.println("--------------------");
		
													
		System.out.print("수를 입력하시오: ");
		int b=sc.nextInt();
		for(int i=1; i<=10; i++) {
			if(i==b) continue;
			System.out.print(i+"\t");
		
		

		}

	}
}