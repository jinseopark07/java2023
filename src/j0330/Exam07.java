package j0330;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		//������ �Է� �޾Ƽ� 3�� ������� ����ϱ�
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է����ּ���: ");
		a= sc.nextInt();
		switch(a%3){
			case 0:
				System.out.println(a+"��(��) 3�� ����Դϴ�.");
				break;
			default:
				System.out.println(a+"��(��) 3�� ����� �ƴմϴ�.");
				break;
		
		}

	}

}
