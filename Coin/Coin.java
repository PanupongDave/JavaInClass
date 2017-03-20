public class Coin{
	private int face = 0;
	public static final int HEAD = 0;
	public static final int TAIL = 1;

	public Coin(){
		this.spin();
	}

	public void spin(){
		face = (int)(Math.random()*2);
	}
	public int getFace(){
		return face;
	}
	public void flip(){
		face += 1;
		if(face == 2 )
			face = 0;
	}
	

}