package j0330;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		//� �� n�� �Է¹޾Ƽ� ������ ���� ��� ���
		//N:3
		//1
		//12
		//123
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է����ּ���: ");
		int a=sc.nextInt();
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"\t");
			}
			
			System.out.println();
		}


	}

}