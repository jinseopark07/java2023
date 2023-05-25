package j0330;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		//정수를 입력 받아서 3의 배수인지 출력하기
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력해주세요: ");
		a= sc.nextInt();
		switch(a%3){
			case 0:
				System.out.println(a+"은(는) 3의 배수입니다.");
				break;
			default:
				System.out.println(a+"은(는) 3의 배수가 아닙니다.");
				break;
		
		}

	}

}
