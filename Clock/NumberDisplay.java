public class NumberDisplay{
	private int currValue;
	private int maxValue;

	public NumberDisplay(int max){
		currValue = 0;
		maxValue = max;
	}
	public int getValue(){
		return currValue;
	}
	public void setValue(int newValue){
		if(newValue >= 0 && newValue < maxValue)			
			currValue = newValue;
	}
	public String getDisplayValue(){
		if(currValue < 10)
			return "0"+currValue;
		else
			return ""+ currValue;
	}
	public void increment(){
		currValue = (currValue +1) % maxValue; 
	}

}