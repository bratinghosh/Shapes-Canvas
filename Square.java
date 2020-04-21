/**
 * Subclass extending from the Shape superclass, used for modelling squares
 * 
 * @author Bratin Ghosh(3035437692)
 */

class Square extends Shape{//inherits class Shape
    public void setVertices(double d){
        /**
         * The method overrides setVertices(double d) present in the class Shape and assigns values of the coordinates of the 4 vertices of a square
         */
        xLocal=new double[4];//size 4 for storing the 4 vertices of the square
        xLocal[0]=d;
        xLocal[1]=d;
        xLocal[2]=-d;
        xLocal[3]=-d;
        yLocal=new double[4];//size 4 for storing the 4 vertices of the square
        yLocal[0]=d;
        yLocal[1]=-d;
        yLocal[2]=-d;
        yLocal[3]=d;
    }//end of setVertices(double)
}