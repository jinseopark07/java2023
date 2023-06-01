package j0601;

public class Son extends Father {
	
	
	public Son(String name) {
		super(name);
		System.out.println("Sun 생성자");
	}

	public static void main(String[] args) {
		Son s = new Son("홍길동");
	}

}
