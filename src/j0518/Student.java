package j0518;

public class Student {
	//멤버 변수
	private String name;
	private int grade;
	static int count;
	
	//생성자
	Student(){
		count++;
	}
	
	
	
	
	//메소드
	
	static int getCount(){
		return count;
	}//클래스 메소드
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
	 this.name=name;
	}
	
	int getGrade() {
		return grade;
	}
	
	void setGrade(int grade) {
		this.grade = grade;
	}
	
	void print() {
		System.out.println("학생의 이름은 " +name+"이고, "+grade+"학년입니다.");
	}
}
