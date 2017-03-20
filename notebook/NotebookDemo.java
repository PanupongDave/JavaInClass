import java.util.Scanner;
public class NotebookDemo{
	public static void main(String[] args){
		Notebook book = new Notebook();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("Create Note: ");
			String note = scan.nextLine();
			if(note.equals("Exit")){
				break;
				
			}
			System.out.println("Store note:" + note);
			book.storeNote(note);
		}
		System.out.println("======= Show Notes======");
		book.listNotes();
		

	}
}