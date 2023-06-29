package j0629;

public class UserMain {

	public static void main(String[] args) {
		Radio radio=new Radio();
		TV tv=new TV();
		radio.SoundUP(5);
		radio.SoundUP(7);
		radio.SoundDown(20);
		
		tv.SoundUP(10);
		tv.SoundDown(20);
	}

}
