import java.util.Scanner;
public class testString{
	public static void main(String[] args){
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.print("Input sentence 1 : ");
		String s1 = scan1.nextLine();
		System.out.print("Input sentence 2 : ");
		String s2 = scan2.nextLine();

		testString s = new testString(); 
		s.compare(s1,s2);
		
	
	}
	public void compare(String s1,String s2){
		if((s1.compareTo(s2)) < 0)
			System.out.println("s1 smaller s2");
		else if((s1.compareTo(s2))>0)
			System.out.println("s1 bigger s2");
		else
			System.out.println("s1 same s2");
	}

}