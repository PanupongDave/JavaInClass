public class DVD extends Item{
	private String director;

	public DVD(String title,int time,String theDirector){
		super(title,time);
		director = theDirector;
	}

	public String getDirector(){
		return director;
	}

	public void print(){
		this.print();
		System.out.println("Director: "+ director);
		System.out.println("Type: DVD");
		System.out.println(" ");
	}
}