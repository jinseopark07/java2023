package j0330;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է����ּ���: ");
		int a=sc.nextInt();
		for(int i=a; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*\t");
			}
			
			System.out.println();
		}

	}

}
