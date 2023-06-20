
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		double circleArea = circle.calculateArea();
		System.out.println("Circle Area:: "+ circleArea);
		
		Rectangle rect = new Rectangle(5, 8);
		double rectArea = rect.calculateArea();
		System.out.println("Rectangle Area:: "+ rectArea);;

	}

}
