package j0406;

public class Student {
	// 멤버 변수: 속성
	String name; //이름
	int number; //학번
	String phone; //전화번호
	static String school ="서울로봇";
	static int count=0;
	//생성자
	//(사람이라면 누구나 공통적이면서 피수적인 것들을 작업),((객체) 모든 생성자(new)는 이 과정을 거침)
	//클래스이 이름과 같다
	Student(){
		System.out.println("생성자"+count);
		count++;
		
	}
	
	
	//메소드
	
}
