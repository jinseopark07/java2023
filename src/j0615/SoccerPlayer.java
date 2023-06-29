package j0615;

public class SoccerPlayer extends Person {
	String teamName;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(name+"는 "+teamName+"팀 축구 선수 입니다.");
	}
	
	
}
