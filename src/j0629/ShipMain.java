package j0629;

public class ShipMain extends Ship{
	String Shipname;
	int P_count; //승객수
	int l_amount; //짐의 무게
	public static void main(String[] args) {
		ShipMain s1= new ShipMain();
		s1.l_amount=100;
		s1.P_count=200;
		System.out.println("최대 승객은 "+s1.P_count+"입니다.");
		System.out.println("최대 적재량은 "+s1.l_amount+"입니다.");
	}

	@Override
	int Passenger() {
		// TODO Auto-generated method stub
		return P_count;
	}

	@Override
	int luggage() {
		// TODO Auto-generated method stub
		return  l_amount;
	}

}
//내부적으로는 따로 만들고, 장점은 동일한 매소드를 가지고 있다.                                               