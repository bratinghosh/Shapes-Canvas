import java.awt.Color;

/**
 * To verify that the superclass Shape has been implemented correctly and consists of no bugs
 * 
 * @author Bratin Ghosh(3035437692)
 *
 */

public class ShapeTester{
    /**
     * The method accesses the setters of Shape to initialize variables and outputs the 
     * values of the variables obtained from the getters to check whether the instance variables
     * have been accessed correctly
     * 
     * @param shape     an object of the class Shape which models general shapes
     * @param x         contains the x-coordinates of the vertices (in counter clock-wise order) 
     * of the shape in its local coordinate system
     * @param y         contains the y-coordinates of the vertices (in counter clock-wise order) 
     * of the shape in its local coordinate system
     */
    
    public static void main(String[] args){
        Shape shape=new Shape();//creation of a shape object
        
        shape.setColor(Color.red);//accessing setter
        System.out.println(shape.getColor());//accessing getter
        
        shape.setFilled(false);//accessing setter
        System.out.println(shape.getFilled());//accessing getter
        
        shape.setTheta(Math.PI/2);//accessing setter
        System.out.println(shape.getTheta());//accessing getter
        
        shape.setXc(50);//accessing setter
        System.out.println(shape.getXc());//accessing getter
        
        shape.setYc(50);//accessing setter
        System.out.println(shape.getYc());//accessing getter
        
        double x[]={1.1,2.2,3.3,4.4};
        shape.setXLocal(x);//accessing setter
        double y[]={5.5,6.6,7.7,8.8};
        shape.setYLocal(y);//accessing setter
        for(int i = 0; i < shape.getXLocal().length; i++)
            System.out.println(shape.getXLocal()[i]+"\t"+shape.getYLocal()[i]);//accessing getter
            
        shape.translate(1.5,1.5);
        shape.rotate(Math.PI/2);
        for(int i = 0; i < shape.getX().length; i++)
            System.out.println(shape.getX()[i]+"\t"+shape.getY()[i]);//accessing getter
    }
}