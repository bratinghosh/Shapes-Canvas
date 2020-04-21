import java.awt.Color;

/**
 * To verify that the subclass Circle has been implemented correctly and consists of no errors
 * 
 * @author Bratin Ghosh(3035437692)
 *
 */

class CircleTester{
    /**
     * The method accesses the instance variables of Circle, assigns values to them, and finally 
     * outputs the values of the variables to check whether the instance variables have been accessed correctly
     */
    public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.theta = 75;
		System.out.println("circle.theta: " + circle.theta);
		
		circle.filled = true;
		System.out.println("circle.filled: " + circle.filled);
		
		circle.color = new Color(100, 20, 100);
		System.out.println(circle.color);
		
		circle.xc = 10;
		circle.yc = 10;
		System.out.println("circle.xc: " + circle.xc + "\t" + "circle.yc: " + circle.yc);
		
		circle.setVertices(25);
		for (int i = 0; i < 2; i++) 
			System.out.println("xLocal[" + i + "]: " + circle.xLocal[i] + "\t" + "yLocal[" + i + "]: " + circle.yLocal[i]);
		
		circle.translate(10, 10);
		circle.rotate(20);
		circle.getX();
		circle.getY();
		
		for (int i = 0; i < 2; i++) 
			System.out.println("xLocalint[" + i + "]: " + circle.getX()[i] + "\t" + "yLocalint[" + i + "]: " + circle.getY()[i]);		
	}
}