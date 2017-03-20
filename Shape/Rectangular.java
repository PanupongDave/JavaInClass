public class Rectangular extends Shape{
	private double width;
	private double height;
	public Rectangular(String name,double w,double h){
		super(name);
		width = w;
		height = h;
	}
	//override method getArea

	public double getArea(){
		double area = width*height;
		return area;
	}
}