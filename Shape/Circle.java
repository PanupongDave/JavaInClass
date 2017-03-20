public class Circle extends Shape{
	private double radius;
	private String name2 = "AAA";
	public Circle(String name,double rad){
		super(name);
		radius = rad;
	}
	//override method getArea

	public double getArea(){
		double area = Math.PI*radius*radius;
		return area;
	}
	public String getName2(){
		return name2;
	}
}