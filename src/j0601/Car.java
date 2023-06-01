package j0601;

public class Car {
	private String name; 
	protected String color; //자식은 다 쓸 수 있다
	int velocity; 
	
	Car(){
		System.out.println("Car 기본생성자");
	}//하위 클래스는 상위 클래스 기본 생성자를 거치기 때문에 무조건 선언되어야 한다.
	 Car(String name){
		 System.out.println("Car 생성자");
	 }
	
	void speedUp() {
		velocity+=5;
		System.out.println("속도증가: "+velocity);
	}
	void speedDown() {
		velocity-=5;
		System.out.println("속도감소: "+velocity);
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
}
