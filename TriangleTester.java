import java.awt.Color;

/**
 * To verify that the subclass Triangle has been implemented correctly and returns no errors
 * 
 * @author Bratin Ghosh(3035437692)
 *
 */

class TriangleTester{
    /**
     * The method accesses the instance variables of Triangle, assigns values to them, and finally 
     * outputs the values of the variables to check whether the instance variables have been accessed correctly
     */
    public static void main(String[] args) {
		Triangle triangle = new Triangle();
		
		triangle.theta = 90;
		System.out.println("triangle.theta: " + triangle.theta);
		
		triangle.filled = true;
		System.out.println("triangle.filled: " + triangle.filled);
		
		triangle.color = new Color(99, 98, 97);
		System.out.println(triangle.color);
			
		triangle.xc = 15;
		triangle.yc = 15;
		System.out.println("triangle.xc: " + triangle.xc + "\t" + "triangle.yc: " + triangle.yc);
		
		triangle.setVertices(10);
		for (int i = 0; i < 3; i++) 
			System.out.println("xLocal[" + i + "]: " + triangle.xLocal[i] + "\t" + "yLocal[" + i + "]: " + triangle.yLocal[i]);
		
		triangle.translate(8, 8);
		triangle.rotate(90);
		triangle.getX();
		triangle.getY();
		
		for (int i = 0; i < 3; i++) 
			System.out.println("xLocalint[" + i + "]: " + triangle.getX()[i] + "\t" + "yLocalint[" + i + "]: " + triangle.getY()[i]);
	}
}