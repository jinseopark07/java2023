package j0615;

public class Cartoon extends Book2 {
	boolean webtoon;

	@Override
	void printBook() {
		super.printBook();
		if(webtoon) {
			System.out.println("이 만화는 웹툰입니다.");
		}else {
			System.out.println("이 만화는 웹툰이 아닙니다.");
		}
		
	}
	
	
}
