package j0525;

import java.util.Scanner;

public class Account {
	String name;
	int no;
	int balance;
	
	//생성자
	Account(){
	
	}
	Account(String name, int no){
		this.name=name;
		this.no=no;
	}
	Account(String name, int no,int balance){
		this(name,no);
		this.balance=balance;
		
	}
	
	String getName() {
		return name;
	}
	int getNo() {
		return no;
	}
	int getBalance() {
		return balance;
		
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void setNo(int no) {
		this.no=no;
	}
	void setBalance(int balance) {
		this.balance=balance;
	}
	
	void printInfo() {
		System.out.println("[계좌정보] "+"예금주: "+getName()+" 계좌번호: "+getNo()+" 현재잔고: "+getBalance());
	}
	
	void deposit(int money) {
		balance=balance+money;
		System.out.println(getName()+"님 "+money+"입금");
	}
	void withdraw(int money) {
		if(balance<money) {
			System.out.println(getName()+"님 "+money+"원 출금 실패-현재잔액 "+getBalance()+"원");
		}
		else {
			balance=balance-money;
			System.out.println(getName()+"님 "+money+"출금");
		}
	}
	
	void printMenu() {
		System.out.println("작업을 선택하세요.\n"
				+ "1. 입금\n"
				+ "2. 출금\n"
				+ "3. 잔고조회\n"
				+ "4. 종료");
	}
	
	void Start() {
		while(true) {
			Scanner sc= new Scanner(System.in);
			printMenu();
			int menu=sc.nextInt();
			if(menu==4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else if(menu==1) {
				System.out.print("입금할 돈을 입력해주세요: ");
				int money=sc.nextInt();
				deposit(money);
				
			}else if(menu==2) {
				System.out.print("출금할 돈을 입력해주세요: ");
				int money=sc.nextInt();
				withdraw(money);
				
			}else if(menu==3) {
				printInfo();
			}else {
				System.out.println("잘못입력하셨습니다");
			}
		}
	}

}
