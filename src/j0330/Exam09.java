package j0330;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
	 //� �� n�� �Է¹޾� n���� ¦���� �հ� Ȧ���� ���� ����Ͻÿ�
		int even_sum=0;
		int odd_sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է����ּ���: ");
		int n=sc.nextInt();
		for (int i=1; i<=n; i++) {
			if(i%2==0) 
				even_sum+=i;
			
			else 
				odd_sum+=i;
			
		
		}
		System.out.println("1����"+n+"������ ¦������ "+even_sum+" Ȧ�� ���� "+odd_sum+"�Դϴ�.");

	}
}