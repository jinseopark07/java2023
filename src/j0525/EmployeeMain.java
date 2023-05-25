package j0525;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setAge(25);
		e1.setName("이도령");
		e1.setNo(100);
		Employee e2=new Employee("성춘향",200,18);
		
		e1.print();
		e2.print();
		
		
		
	}
}
