package j0413;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month, day;
		
		System.out.print("달 입력: ");
		month=sc.nextInt();
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day=31;
				System.out.println(month+"월은 "+day+"일입니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day=30;
				System.out.println(month+"월은 "+day+"일입니다.");
				break;
			case 2:
				day=28;
				System.out.println(month+"월은 "+day+"일입니다.");
				break;
			
		}

	}

}
