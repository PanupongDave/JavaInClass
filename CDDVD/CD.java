public class CD extends Item{
	private String artist;
	private int numTracks;

	public CD(String title,int time,String art,int numt){
		super(title,time);
		artist = art;
		numTracks = numt;
	}
	public String getArtist(){
		return artist;
	}
	public int getNuumberOfTracks(){
		return numTracks;
	}
	public void print(){
		this.print();
		System.out.println("Artist: " +artist);
		System.out.println("NumberOfTracks: "+numTracks);
		System.out.println("Type: CD");
		System.out.println(" ");
	}
}