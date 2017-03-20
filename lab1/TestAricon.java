import java.util.Scanner;
public class TestAircon{
	public static void main(String[] args){
		AirCon air = new AirCon();
		Scanner scan = new Scanner(System.in);

		System.out.print("Input Temperature = ");
		int temp = scan.nextInt();
		air.setTemperature(temp);
		Scanner textscan = new Scanner(System.in);
		System.out.print("Input Speed = ");
		String spd = textscan.nextLine();
		air.setSpeed(spd);

		System.out.println("Temper = " + air.getTemperature());
		System.out.println("Speed = " + air.getSpeed()); 
	}
}