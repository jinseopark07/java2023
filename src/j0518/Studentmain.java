package j0518;

public class Studentmain {

	public static void main(String[] args) {
		Student kim= new Student();
		kim.setName("김로봇");
		System.out.println("이름: "+kim.getName());
		kim.setGrade(3);
		
		Student park=new Student();
		park.setGrade(2);
		park.setName("박진서");
		System.out.println("이름: "+park.getName()+" 학년: "+park.getGrade());
		park.print();
		kim.print();
		
		System.out.println("학생수: "+Student.getCount());
		
		
		
	}

}
