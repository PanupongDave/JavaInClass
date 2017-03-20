public class AirCon{
	
	private String spd = "low";
	private int temper = 18;

	//constructor
	/*public void AirCon(String x,int y){
		spd = x;
		temper = y;
	}*/
	public String getSpeed(){
		return spd;
	}
	public int getTemperature(){
		return temper;
	}
	public void setSpeed(String x){
		if( x.equals("low") || x.equals("high")|| x.equals("medium")){
			spd = x;	
		}
		else{
			System.out.println("Error Input");
		}
		
	}
	public void setTemperature(int y){
		if(temper > 17 && temper < 31){
			temper = y;
		}
		else
			System.out.println("Error Input");
		
	}
	public String toString(){
		return "Aircon{" + "speed=" + spd + 
						", temperature= "+ temper +"}";
	}

}