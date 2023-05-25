package j0525;

public class Employee {
	private String name;
	private int no;
	private int age;
	
	Employee(){}
	
	Employee(String name,int no,int age){
		this.name=name;
		this.no=no;
		this.age=age;
	}
	
	String getName() {
		return name;
	}
	int getNo() {
		return no;
	}
	int getAge() {
		return age;
	}
	
	void setName(String name) {
		this.name=name;
	}
	void setNo(int no) {
		this.no=no;
	}
	void setAge(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "[직원 정보] 이름: "+getName()+" 번호: "+getNo()+" 나이: "+getAge();
	}
	
	void print() {
		System.out.println(toString());
	}
	
}
