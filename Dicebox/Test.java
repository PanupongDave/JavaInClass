import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		DiceBox box = new DiceBox();
		Scanner scan = new Scanner(System.in);
		/*System.out.print("Input Number of Dices: ");
		int num = scan.nextInt();*/

		box.add(new Dice());
		box.add(new Dice());
		box.add(new Dice());



		

		System.out.println("Before shaking: total = " + box.getTotal());
		box.shake();
		System.out.println("After shanking: total = " + box.getTotal());

		box.printDices();
	}
}