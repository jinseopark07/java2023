package j0330;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
	 //어떤 수 n을 입력받아 n까지 짝수의 합과 홀수의 합을 출력하시오
		int even_sum=0;
		int odd_sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력해주세요: ");
		int n=sc.nextInt();
		for (int i=1; i<=n; i++) {
			if(i%2==0) 
				even_sum+=i;
			
			else 
				odd_sum+=i;
			
		
		}
		System.out.println("1부터"+n+"까지의 짝수합은 "+even_sum+" 홀수 합은 "+odd_sum+"입니다.");

	}
}