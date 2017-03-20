import java.util.*;
public class Database{
	private ArrayList<Item> items ; 

	public Database(){
		items = new ArrayList<Item>();
	}

	public void add(CD cd){
		items.add(cd);
	}
	public void add(DVD dvd){
		items.add(dvd);
	}

}