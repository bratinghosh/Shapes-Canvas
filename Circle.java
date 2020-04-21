/**
 * Subclass extending from the Shape superclass, used for modelling circles
 * 
 * @author Bratin Ghosh(3035437692)
 */

class Circle extends Shape{//inherits class Shape
    public void setVertices(double d){
        /**
         * The method overrides setVertices(double ) present in the class Shape and assigns values of the local coordinates of the upper
         * left and lower right vertices of an axis-aligned bounding box of a circle
         */
        xLocal=new double[2];//size 2 for storing the upper left and lower right vertices of the axis-aligned bounding box of a circle
        xLocal[0]=-d;
        xLocal[1]=d;
        yLocal=new double[2];//size 2 for storing the upper left and lower right vertices of the axis-aligned bounding box of a circle
        yLocal[0]=-d;
        yLocal[1]=d;
    }//end of setVertices(double)
    public int[] getX(){
        /**
         * The method overrides getX() present in the class Shape and retrieves the x-coordinates of the upper left and lower
         * right vertices of an axis-aligned bounding box of the circle in the screen coordinate
         * system
         * 
         * @return xLocalint	x-coordinates of the vertices of the circle in screen coordinate system	
         */
        int xLocalint[]=new int[xLocal.length]; 
        for(int i=0;i<xLocal.length;i++)
            xLocalint[i]=(int)(xLocal[i]+xc);//rounding to integers
        return xLocalint;
    }
    public int[] getY(){
        /**
         * The method overrides getY() present in the class Shape and retrives the y-coordinates of the upper left and lower
         * right vertices of an axis-aligned bounding box of the circle in the screen coordinate
         * system
         * 
         * @return yLocalint	y-coordinates of the vertices of the circle in screen coordinate system	
         */
        int yLocalint[]=new int[yLocal.length];
        for(int i=0;i<yLocal.length;i++)
            yLocalint[i]=(int)(yLocal[i]+yc);//rounding to integers
        return yLocalint;
    }
}