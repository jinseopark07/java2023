package j0413;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		
		int num[]=new int[5];
		
		Scanner sc = new  Scanner(System.in); 
		
		int max=0;
		int i=0;
		while(i<5) {
			System.out.print((i+1)+"��° ����: ");
			num[i]=sc.nextInt();
			if(num[i]>max) {
				max=num[i];
			}
			i++;
			
			
		}
		System.out.println("�Է��� ���� �� �ִ밪�� "+max+"�Դϴ�.");
		

	}

}
