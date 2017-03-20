public class SimpleCalls{
	public static void main(String[] args){
		int x=3;
		System.out.println("1. x = "+x);
		//squareBad(x);
		 x = squareGood(x);
		System.out.println("2. x = " +x);
	}
	private static void squareBad(int x){
		System.out.println("sqBad 1. x = " + x);
		x= x*x;
		System.out.println("sqBad 2. x = "+x);
	}
	private static int squareGood(int x){
		System.out.println("sqGood 1. x = " +x);
		x = x*x;
		System.out.println("sqGood 2. x = " + x);
		return x; 
	}
}
