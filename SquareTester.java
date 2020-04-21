import java.awt.Color;

/**
 * To verify that the subclass Square has been implemented correctly and contains no bugs
 * 
 * @author Bratin Ghosh(3035437692)
 *
 */

class SquareTester{
    /**
     * The method accesses the instance variables of Square, assigns values to them, and finally 
     * outputs the values of the variables to check whether the instance variables have been accessed correctly
     */
    public static void main(String[] args){
        Square square = new Square();
		
		square.theta = 35;
		System.out.println("shape.theta: " + square.theta);
		
		square.filled = false;
		System.out.println("square.filled: " + square.filled);
		
		square.color = new Color(0, 5, 10);
		System.out.println(square.color);
		
		square.xc = 34;
		square.yc = 34;
		System.out.println("square.xc: " + square.xc + "\t" +"square.yc: " + square.yc);
		
		square.setVertices(10);
		for (int i = 0; i < 4; i++) 
			System.out.println("square.xLocal[" + i + "]: " + square.getX()[i] + "\t" + "square.yLocal[" + i + "]: " + square.getY()[i]);
		
		square.translate(9, 9);
		square.rotate(9);
		square.getX();
		square.getY();
		for (int i = 0; i < 4; i++) 
			System.out.println("square.xLocalint[" + i + "]: " + square.getX()[i] + "\t" + "square.yLocalint[" + i + "]: " + square.getY()[i]);
    }
}