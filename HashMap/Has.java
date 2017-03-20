import java.util.*;
public class Has{
	public static void main(String[] args){
		HashMap<String, Integer> results = process();


		System.out.println("A = "+results.get("A"));
		System.out.println("B = "+results.get("B"));
		System.out.println("C = "+results.get("C"));
	}



	public static HashMap<String, Integer> process(){
		HashMap<String, Integer> results;
		results = new HashMap<String, Integer> ();

		results.put("A", 0);
		results.put("B", 0);
		results.put("C", 0);
		boolean x = true;

		Scanner scan = new Scanner(System.in);
		String input;
		while(x){
			input = scan.nextLine();
			if(".".equals(input))
				break;
			String key = ""+input.charAt(0);
			int value = results.get(key) + Integer.parseInt(input.substring(1));
			results.put(key,value);
		}	
		return results;
	}
}


