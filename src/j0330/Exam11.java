package j0330;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력해주세요: ");
		int a=sc.nextInt();
		for(int i=a; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*\t");
			}
			
			System.out.println();
		}

	}

}
