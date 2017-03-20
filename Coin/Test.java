public class Test{
	public static void main(String[] args){
		Coin c = new Coin();
		System.out.println(c.getFace());
		c.flip();
		System.out.println(c.getFace());
		if(c.getFace() == Coin.HEAD){
			System.out.println("Head!");
		}
		else if(c.getFace() == Coin.TAIL){
			System.out.println("Tail!");
		}

		System.out.println(Coin.HEAD);
	}
}