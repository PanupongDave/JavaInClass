public class Item{
	private String comment;
	private boolean gotIt;
	private int playingTime;
	private String title;

	public Item(String theTitle,int time){
		title = theTitle;
		playingTime = time;
		gotIt = false;
		comment = null;
	} 

	public String getComment(){
		return comment;
	}
	public boolean getOwn(){
		return gotIt;
	}
	public void setComment(String com){
		comment = com;
	}
	public void setOwn(boolean own){
		gotIt = own;
	}
	public void print(){
		System.out.println("Title: "+ title);
		System.out.println("Time: "+ playingTime);
		if(comment != null)
			System.out.println("Comment: "+comment);
		if(gotIt)
			System.out.println("Have got it.");
		else
			System.out.println("You can got it.");

	}

}