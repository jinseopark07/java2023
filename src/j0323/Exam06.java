package j0323;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("a: ");
		a=sc.nextInt();
//		if(a%2==0) {
//			System.out.println(a+"은(는) 짝수입니다.");
//		}else {
//			System.out.println(a+"은(는) 홀수입니다");
//		}
		//3은 홀수입니다.
		//입력
		//a:20
		//b:20
		//연산자: *
		//출력) 20 * 10 = 200
		int b;
		char c;
		System.out.print("b: ");
		b= sc.nextInt();
		System.out.print("연산자: ");
		c= sc.next().charAt(0);
		
		if(c=='*') {
			System.out.println(a+" * "+b+" = "+(a*b));
		}else if(c=='+') {
			System.out.println(a+" + "+b+" = "+(a+b));
		}else if(c=='-') {
			System.out.println(a+" - "+b+" = "+(a-b));
		}else if(c=='/') {
			System.out.println(a+" / "+b+" = "+(a/b));
		}
		
		
	
	
	
	}

}
