package j0615;

public class Book {
	private int no;
	private String name;
	private int count;
	private int borrow;
	private static final String Library="로봇도서관";
	private static int bookCnt=0;
	
	Book(){
		bookCnt++;
	}
	Book(int no, String name){
		this();
		this.no=no;
		this.name=name;
	}
	public Book(int no, String name, int count, int borrow) {
		this();
		this.no = no;
		this.name = name;
		this.count = count;
		this.borrow = borrow;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBorrow() {
		return borrow;
	}
	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}
	public static int getBookCnt() {
		return bookCnt;
	}
	public static void setBookCnt(int bookCnt) {
		Book.bookCnt = bookCnt;
	}
	public static String getLibrary() {
		return Library;
	}
	
	void printInfo() {
		System.out.println("번호: "+no+" 도서명: "+name+" 도서개수: "+count+" 대여개수: "+borrow);
		
	}
	void borrowBook(int cnt) {
		if(count<cnt) {
			System.out.println(no+"번 도서"+cnt+"권 대출실패");
		}else {
			System.out.println(no+"번 도서"+cnt+"권 대출성공");
			count-=cnt;
			borrow+=cnt;
		}
	}
	
	void returnBook(int cnt){
		if(borrow<cnt) {
			System.out.println(no+"번 도서"+cnt+"권 반납실패");
		}else {
			System.out.println(no+"번 도서"+cnt+"권 반납성공");
			count+=cnt;
			borrow-=cnt;
		}
		
	}
	
}	
