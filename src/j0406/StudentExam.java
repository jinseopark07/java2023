package j0406;

public class StudentExam {

	public static void main(String[] args) {
		
		Student kim = new Student();
		Student lee = new Student();
		kim.name="������";
		kim.number=20610;
		kim.phone="010-9235-5895";
		kim.school="����";
		
		System.out.println("�̸�: "+kim.name);
		System.out.println("�й�: "+kim.number);
		System.out.println("��ȭ: "+kim.phone);
		System.out.println("�б�: "+kim.school);
		
		lee.name="ȫ�浿";
		lee.number=20111;
		lee.phone="010-1234-5678";
		
		System.out.println("�̸�: "+lee.name);
		System.out.println("�й�: "+lee.number);
		System.out.println("��ȭ: "+lee.phone);
		System.out.println("�б�: "+lee.school);
		System.out.println("���л���: "+Student.count);
		Student.school="������";
		System.out.println("�б�: "+lee.school);
	}

}
