public class Aircon{
	private String speed ;
	private int temperature ;

	public  Aircon(){
		speed = "low";
		temperature = 18;
	}

	public String getSpeed(){
		return speed;
	}
	public int getTemperature(){
		return temperature;
	}

	public void setSpeed(String x){
		if(x.equals("low") || x.equals("medium") || x.equals("fast"))
			speed = x;
		else{
			System.out.println("Speed Error");
			System.exit(0);	
		}
	}

	public void setTemperature(int y){
		if(y > 17 && y < 31)
			temperature = y;
		else{
			System.out.println("Temperature Error");
			System.exit(0);	
		}
	}

	public String toString(){
		return "Aircon{ Speed = " + speed + " Temperature = " + temperature + "}"; 
	}

}