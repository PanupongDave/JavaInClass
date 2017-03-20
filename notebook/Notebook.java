import java.util.ArrayList;
public class Notebook{
	private ArrayList<String> notes;

	public Notebook(){
		notes = new ArrayList<String>();
	}

	public void storeNote(String note){
		notes.add(note);
	}
	public void removeNote(int noteIdx){
		if((noteIdx >= 0) && (noteIdx < notes.size()))
				notes.remove(noteIdx);
	}

	public void showNote(int noteIdx){
		if((noteIdx >=0)&&(noteIdx < notes.size()))
				System.out.println(notes.get(noteIdx));
	}
	public int numNotes(){
			return notes.size();
	}

	public void listNotes(){
			for(String note : notes)
				System.out.println(note);
	}
}
