package j0629;

public class TV implements Sound{
	private int tv_sound;

	@Override
	public void SoundUP(int level) {
		// TODO Auto-generated method stub
		tv_sound+=level *2;
		System.out.println("TV 볼륨: "+getTv_sound());
	}

	@Override
	public void SoundDown(int level) {
		// TODO Auto-generated method stub
		
		tv_sound-=level *2;
		if(tv_sound<0) {
			tv_sound=0;
		}
		System.out.println("TV 볼륨: "+getTv_sound());
	}

	public int getTv_sound() {
		return tv_sound;
	}

}
