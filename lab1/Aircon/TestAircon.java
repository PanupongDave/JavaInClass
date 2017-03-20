import java.util.Scanner;

public class TestAircon{
	public static void main(String[] args){
		Aircon air = new Aircon();
		Scanner scan = new Scanner(System.in);
		Scanner textscan = new Scanner(System.in);
		
		System.out.print("Input Speed : ");
		String spd = textscan.nextLine();
		air.setSpeed(spd);
	
		
		System.out.print("Input Temperature : ");
		int temp = scan.nextInt();
		air.setTemperature(temp);

		System.out.println(air.toString());

	}
}