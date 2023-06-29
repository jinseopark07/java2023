package j0622;

public class Book {
	private int no;
	private String name;
	private int count;
	private int borrow;
	private final static String Library="로봇도서관";
	private static int bookCnt;
	
	Book(){
		bookCnt++;
	}
	Book(int no, String name){
		this();
		this.no=no;
		this.name=name;
	}
	Book(int no, String name,int count, int borrow){
		this(no, name);
		this.count=count;
		this.borrow=borrow;
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
	
	void borrowBook(int cnt) {
		if(count<cnt) {
			System.out.println(no+"번 도서"+cnt+"권 대출 실패");
		}else {
			System.out.println(no+"번 도서"+cnt+"권 대출 성공");
			borrow+=cnt;
			count-=cnt;
		}	
		
	}
	void returnBook(int cnt) {
		if(borrow<cnt) {
			System.out.println(no+"번 도서"+cnt+"권 반납 실패");
		}else {
			System.out.println(no+"번 도서"+cnt+"권 대출 성공");
			borrow-=cnt;
			count+=cnt;
		}
	}
	void printInfo() {
		System.out.println("번호: "+no+" 도서명 :"+name+" 도서개수: "+count+" 대여개수: "+borrow);
	}
	
	
}
