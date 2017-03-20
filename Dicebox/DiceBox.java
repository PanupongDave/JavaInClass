import java.util.ArrayList;

public class DiceBox{
	private ArrayList<Dice> dices;

	public DiceBox(){
		dices = new  ArrayList<Dice>();
	}
	public void add(Dice dice){
			dices.add(dice);
	}
	public void shake(){
		for(Dice dice:dices)
			dice.roll();
	}
	public int getTotal(){
		int total = 0;
		for(Dice dice:dices)
			total += dice.getFace();
		return total;
	}
	/*public void numDice(int num){
		for(int i = 0;i<num;i++)
			this.add(new Dice());
	}*/

	public void printDices(){
		int i = 0;
		for(Dice dice:dices){
			i++;
			System.out.println(i+".Face = " + dice.getFace());
		}

		//System.out.println("Face = " + dices.get(1).getFace());
	}
}


