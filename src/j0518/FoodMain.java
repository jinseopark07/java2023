package j0518;

public class FoodMain {

	public static void main(String[] args) {
//		food donut =new food();
//		donut.name="크리스피 크림 도넛";
//		donut.count=10;
//		donut.printFood();
		
		food juice=new food("오랜지 주스",10);
		juice.printFood();
		
		food coffee=new food("카페라떼",5);
		coffee.printFood();
		;
		int 가격 = coffee.getPrice();
		System.out.println("가격: "+가격);

	}

}
