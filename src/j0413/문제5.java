package j0413;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("숫자입력: ");
		num=sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				System.out.print("-"+i);
				sum-=i;
			}else {
				System.out.print("+"+i);
				sum+=i;
				
			}
		}
		System.out.println("="+sum);
		

	}

}
