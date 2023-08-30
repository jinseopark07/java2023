package j0629;

public class Radio implements Sound{
	private int R_Sound;
	//rlrlrlr
	@Override
	public void SoundUP(int level) {
		// TODO Auto-generated method stub
		R_Sound+=level;
		System.out.println("라디오 볼륨: "+getR_Sound());
	}

	@Override
	public void SoundDown(int level) {
		// TODO Auto-generated method stub
		R_Sound-=level;
		if(R_Sound<0) {
			R_Sound=0;
		}
		System.out.println("라디오 볼륨: "+getR_Sound());
	}

	public int getR_Sound() {
		return R_Sound;
	}
	
}
