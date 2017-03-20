public class Test{
	public static void main(String[] args){
		Database db = new Database();

		db.addCD(new CD("Panu",20,"Paaa",5)); 
		db.addCD(new CD("Pasad",20,"Paasdasaa",5));
		db.addCD(new CD("Panassdada",20,"Paasda",5));

		db.addDVD(new DVD("asdasd",30,"aaaa"));
		db.addDVD(new DVD("asd",30,"aaasdaaa"));
		db.addDVD(new DVD("asddsfsdasd",30,"aaaasdasda"));

		db.list();

	}
}