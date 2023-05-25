package j0330;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		//어떤 수 n을 입력받아서 다음과 같은 모양 출력
		//N:3
		//1
		//12
		//123
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력해주세요: ");
		int a=sc.nextInt();
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"\t");
			}
			
			System.out.println();
		}


	}

}