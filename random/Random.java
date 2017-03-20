public class Random{
	public static void main(String[] args){
		int rand;
		for(int i = 0; i<10;i++){
			rand = (int)(Math.random() * 10)%7;
			System.out.println("Random = " + rand);
		}
	}
}