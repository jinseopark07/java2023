package j0601;

public class EngHello extends Greeting {
	public String name="Mr.Hong";
	public void sayHello() {
		System.out.println(name+ " Nice to meet you!");
	}
		
	public void 안녕하세요() {
			super.sayHello();//내꺼가 아니라 부모 메소드를 쓰고 싶을 때 super.
	}
	
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.안녕하세요();
		
	}
}
