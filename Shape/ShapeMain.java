import java.util.ArrayList;

public class ShapeMain{
	public static void main(String[] args){
		Shape shapes[] = new Shape[3];
		shapes[0] = new Rectangular ("A",5.0,10.0);
		shapes[1] = new Circle("B", 5.0);
		shapes[2] = new Circle("C",40.0);
		System.out.println("Biggest = " + findBiggest(shapes).getName());
	}

	private static Shape findBiggest(Shape[] shapes){
		Shape result = shapes[0];
		for(Shape shape:shapes){
			if(result.getArea()<shape.getArea())
				result = shape;
		}
		return result;
	}
}