package j0525;

public class Student {
	
	//멤버변수
	String name;
	int grade;
	
	//생성자 : 오버로딩
	Student(){}
	Student(String name){
		this.name=name;
	}
	Student(String name,int grade){
		//this.name=name;
		
		this(name);
		
		this.grade=grade;
	}
	
	//메소드
	void print() {
		System.out.println("이름은 "+name+", "+grade+"학년입니다");
	}
	void print2() {
		System.out.println("이름은 "+getName()+", "+getGrade()+"학년입니다");
	}
	
	//get
	String getName() {
		return name;
	}
	int getGrade() {
		return grade;
	}
	
	//set
	
	void setName(String name) {
		this.name=name;
	}
	void setGrade(int grade) {
		this.grade=grade;
	}
	
}
