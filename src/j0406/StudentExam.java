package j0406;

public class StudentExam {

	public static void main(String[] args) {
		
		Student kim = new Student();
		Student lee = new Student();
		kim.name="박진서";
		kim.number=20610;
		kim.phone="010-9235-5895";
		kim.school="망고";
		
		System.out.println("이름: "+kim.name);
		System.out.println("학번: "+kim.number);
		System.out.println("전화: "+kim.phone);
		System.out.println("학교: "+kim.school);
		
		lee.name="홍길동";
		lee.number=20111;
		lee.phone="010-1234-5678";
		
		System.out.println("이름: "+lee.name);
		System.out.println("학번: "+lee.number);
		System.out.println("전화: "+lee.phone);
		System.out.println("학교: "+lee.school);
		System.out.println("총학생수: "+Student.count);
		Student.school="망망고";
		System.out.println("학교: "+lee.school);
	}

}
