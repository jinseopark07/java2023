package j0330;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		//break�� �̿��Ͽ� �Էµ� N������ ����Ͻÿ�
		//��, N�� ���� ū ���� 100
		//ex) N:4
		//��� 1,2,3,4
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		int a=sc.nextInt();
		for(int i=1; i<=100; i++) {
			System.out.print(i+"\t");
			if(i==a) break;
			
		}
		
		/////////////////
		System.out.println();
		System.out.println("--------------------");
		
													
		System.out.print("���� �Է��Ͻÿ�: ");
		int b=sc.nextInt();
		for(int i=1; i<=10; i++) {
			if(i==b) continue;
			System.out.print(i+"\t");
		
		

		}

	}
}