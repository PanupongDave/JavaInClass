import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Phonebook{
	private HashMap<String,String> phonebooks;
	private ArrayList<String> phoneName;
	private int count = 0;

	public Phonebook(){
		phonebooks = new HashMap<string,String>();
		phoneName = new ArratList<string>();
	}
	public void Inputphone(String name,String phone){
		phonebooks.put(name,phone);
	}
	public void InputName(String name){
		phoneName.add(name);
	}
	public void Displayphone(){
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		while(true){
			System.out.print("Input Name: ");
			String name = scan1.nextLine();
			String pname = name;
			System.out.print("Input phoneNumber: ");
			String phone = scan2.nextLine();
			if(name.equals(-1)||phone.equals(-1))
				break;
			this.Inputphone(name,phone);
			this.InputName(name);
			count++;
		}
	}
	public void DisplayOutput(){
		for(int i = 0;i<count;i++){
			System.out.print("Name: "+phonesName[i]+" Phone: "+phonebooks[i].get);	

		}
		
	}
}