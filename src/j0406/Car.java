package j0406;

public class Car {
	//�������
	String Car_name;//����
	int price; //����
	String brand; //����,BMW
	int velocity=0;
	boolean running=false;
	
	static int count=0; //�� ���� ����
	
	//������
	Car(){
		count++;
	}
	
	//�޼ҵ�
	void run() {
		running=true;
		System.out.println(Car_name+"�� �������Դϴ�.");
		
	
	
	
	
	}
	void stop() {
		running=false;
		System.out.println(Car_name+"�� �����Ͽ��ϴ�.");
		
	
	
	
	
	
	
	
	}
	void vel_up(int value) {//value��ŭ �ӵ� ����
		if(!running) {
			System.out.println(Car_name+"������");
			return;
		}
		
		velocity+=value;
		if (velocity>100) {
			velocity=100;
			System.out.println("�ִ�ӵ��� 100�Դϴ�");
		}
		System.out.println(Car_name+"����ӵ�="+velocity);
		
	}
	void vel_down(int value) {//value��ŭ �ӵ� ����
		if(!running) {
			System.out.println(Car_name+"������");
			return;
		}
		velocity-=value;
		System.out.println(Car_name+"����ӵ�="+velocity);
	}
	

}
