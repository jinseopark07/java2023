package j0406;

public class CarExam {

	public static void main(String[] args) {
		Car redCar= new Car();
		
		Car blueCar= new Car();
		
		redCar.Car_name="���׽ý�";
		redCar.price=5000;
		redCar.brand="����";
		redCar.velocity=30;
		
		blueCar.Car_name="510D";
		blueCar.price=8000;
		blueCar.brand="BMW";
		blueCar.velocity=40;
		
		redCar.run();
		redCar.vel_up(10);//10
		redCar.vel_up(20);//20
		redCar.vel_down(40);
		redCar.vel_up(150);//30
		redCar.stop();
		redCar.vel_down(40);
		redCar.stop();
		
		
		
		
		

	}

}
