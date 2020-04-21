/**
 * To verify that the subclass RegularPolygon has been implemented correctly and consists of no errors
 * 
 * @author Bratin Ghosh(3035437692)
 *
 */

public class RegularPolygonTester{
    /**
     * The method accesses the setters of RegularPolygon class to initialize the respective variables and outputs the 
     * values of the variables obtained from the getters to check whether the instance variables
     * have been accessed correctly
     * 
     * @param Polygon1      an object of the class RegularPolygon which models general n-sided polygon 
     * @param Polygon2      an object of the class RegularPolygon which models general n-sided polygon
     * @param Polygon3      an object of the class RegularPolygon which models general n-sided polygon
     */
    
    public static void main(String[] args){
        RegularPolygon Polygon1 = new RegularPolygon();//use of no argument constructor
        System.out.println(Polygon1.getNumOfSides());//use of getter
        System.out.println(Polygon1.getRadius());//use of getter
        Polygon1.setRadius(-15.0);//we use negative numbers to force the setter to initialize radius properly
        Polygon1.setNumOfSides(5);//use of setter
        System.out.println(Polygon1.getNumOfSides());//use of getter
        System.out.println(Polygon1.getRadius());//use of getter
        System.out.println(Polygon1.contains(1, 2));//contains() is called to check the location of point
        
        RegularPolygon Polygon2 = new RegularPolygon(-1);//use of 1 argument constructor
        System.out.println(Polygon2.getNumOfSides());//use of getter
        System.out.println(Polygon2.getRadius());//use of getter
        Polygon2.setRadius(3.0);//use of setter
        Polygon2.setNumOfSides(-9);//we use negative numbers to force the setter to initialize the number of sides properly
        System.out.println(Polygon2.getNumOfSides());//use of getter
        System.out.println(Polygon2.getRadius());//use of getter
        System.out.println(Polygon2.contains(3, 4));//contains() is called to check the location of point
        
        RegularPolygon Polygon3 = new RegularPolygon(8, -5.5);//use of 2 arguments constructor
        System.out.println(Polygon3.getNumOfSides());//use of getter
        System.out.println(Polygon3.getRadius());//use of getter
        Polygon3.setRadius(15.5);//use of setter
        Polygon3.setNumOfSides(10);//use of setter
        System.out.println(Polygon3.getNumOfSides());//use of getter
        System.out.println(Polygon3.getRadius());//use of getter
        System.out.println(Polygon3.contains(5, 6));//contains() is called to check the location of point
    }
}