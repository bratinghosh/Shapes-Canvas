/**
 * Subclass extending from the Shape superclass, used for modelling triangles
 * 
 * @author Bratin Ghosh(3035437692)
 */

class Triangle extends Shape{//inherits class Shape
    public void setVertices(double d){
        /**
         * The method overrides setVertices(double ) present in the class Shape and assigns the coordinates of the 3 vertices of a triangle
         */
        xLocal=new double[3];//size 3 for the 3 vertices of the triangle
        xLocal[0]=d;
        xLocal[1]=-d*Math.cos(Math.PI/3);
        xLocal[2]=-d*Math.cos(Math.PI/3);
        yLocal=new double[3];//size 3 for the 3 vertices of the triangle
        yLocal[0]=0;
        yLocal[1]=-d*Math.sin(Math.PI/3);
        yLocal[2]=d*Math.sin(Math.PI/3);
    }//end of setVertices(double)
}