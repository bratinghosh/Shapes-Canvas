import java.awt.Color;

/**
 * The class is used to model real life shapes. It consists of attributes and behaviours generally 
 * present in a shape
 * 
 * @author  Bratin Ghosh(3035437692)
 */

public class Shape{
    private Color color;//color of the shape
    private boolean filled;//specify whether the shape is filled or not
    private double theta;//specify the orientation of the shape in the screen coordinate system
    private double xc;//specify the x-coordinate of the center of the shape in the screen coordinate system
    private double yc;//specify the y-coordinate of the center of the shape in the screen coordinate system
    private double xLocal[];//all the x-coordinates of the vertices (in counter clock-wise order) of the shape in local coordinate system
    private double yLocal[];//all the y-coordinates of the vertices (in counter clock-wise order) of the shape in local coordinate system
    
    /**
     * Getter function used to get the color of the shape
     * 
     * @return color     color of the shape
     */
    
    public Color getColor(){
        return this.color;
    }//end of getter function
    
    /**
     * Getter function used to know whether the shape is filled or not
     * 
     * @return filled     specify whether the shape is filled or not
     */
    
    public boolean getFilled(){
        return this.filled;
    }//end of getter function
    
    /**
     * Getter function that tells the orientation of the shape in screen coordinate system
     * 
     * @return theta     specify the orientation of the shape in the screen coordinate system
     */
    
    public double getTheta(){
        return this.theta;
    }//end of getter function
    
    /**
     * Getter function giving us the x-coordinate of the center of the shape
     * 
     * @return xc    specify the x-coordinate of the center of the shape in the
     * screen coordinate system
     */
    
    public double getXc(){
        return this.xc;
    }//end of getter function
    
    /**
     * Getter function giving us the y-coordinate of the center of the shape
     * 
     * @return yc    specify the y-coordinate of the center of the shape in the
     * screen coordinate system
     */
    
    public double getYc(){
        return this.yc;
    }//end of getter function
    
    /**
     * Getter function giving us an array of all the x-coordinates of the vertices of the shape
     * 
     * @return xLocal	all the x-coordinates of the vertices (in counter clock-wise order) of 
     * the shape in local coordinate system
     */
    
    public double[] getXLocal(){
        return this.xLocal;
    }//end of getter function
    
    /**
     * Getter function giving us an array of all the y-coordinates of the vertices of the shape
     * 
     * @return yLocal	all the y-coordinates of the vertices (in counter clock-wise order) of 
     * the shape in local coordinate system
     */
    
    public double[] getYLocal(){
        return this.yLocal;
    }//end of getter function
    
    /**
     * Setter function used to set the color of the shape
     * 
     * @param color     color of the shape
     */
    
    public void setColor(Color color){
        this.color=color;
    }//end of setter function
    
    /**
     * Setter function used to set the variable filled telling us whether the shape is filled or not
     * 
     * @param filled     specify whether the shape is filled or not
     */
    
    public void setFilled(boolean filled){
        this.filled=filled;
    }//end of setter function
    
    /**
     * Setter function used to set the orientation of the shape 
     * 
     * @param theta	    specify the orientation of the shape in the screen coordinate system
     */
    
    public void setTheta(double theta){
        this.theta=theta;
    }//end of setter function
    
    /**
     * Setter function used to set the x-coordinate of the center of the shape 
     * 
     * @param xc    specify the x-coordinate of the center of the shape in the
     * screen coordinate system
     */
    
    public void setXc(double xc){
        this.xc=xc;
    }//end of setter function
    
    /**
     * Setter function used to set the y-coordinate of the center of the shape 
     * 
     * @param yc    specify the y-coordinate of the center of the shape in the
     * screen coordinate system
     */
    
    public void setYc(double yc){
        this.yc=yc;
    }//end of setter function
    
    /**
     * Setter function used to set  array of all the x-coordinates of the vertices of the shape 
     * 
     * @param xLocal	all the x-coordinates of the vertices (in counter clock-wise order) of 
     * the shape in local coordinate system
     */
    
    public void setXLocal(double[] xLocal){
        this.xLocal=xLocal;
    }//end of setter function
    
    /**
     * Setter function used to set  array of all the y-coordinates of the vertices of the shape 
     * 
     * @param yLocal	all the y-coordinates of the vertices (in counter clock-wise order) of 
     * the shape in local coordinate system
     */
    
    public void setYLocal(double[] yLocal){
        this.yLocal=yLocal;
    }//end of setter function
    
    /**
     * This method translates the center of the shape by dx and dy along the x and y 
     * directions of the screen coordinate system, respectively
     * 
     * @param dx    translated x-coordinate of the center of the shape
     * @param dy    translated y-coordinate of the center of the shape
     */
    
    public void translate(double dx, double dy){
        this.xc+=dx;//translation of the  x-coordinate of the center of the shape
        this.yc+=dy;//translation of the  y-coordinate of the center of the shape
    }
    
    /**
     * This method rotates the shape about its center by dt radians
     * 
     * @param dt    angle of rotation
     */
    
    public void rotate(double dt){
        this.theta+=dt;//rotation of angle theta by dt radians
    }
    
    /**
     * This method retrives the x-coordinates of the vertices (counter clock-wise order) of the shape in the 
     * screen coordinate system
     * 
     * @param xLocalint   array consisting the x-coordinates of the
     * vertices of the shape in screen coordinate system
     * 
     * @return xLocalint    returns the array of x-coordinates of the vertices of the shape 
     * in its screen coordinate system  
     */
    
    public int[] getX(){
        int xLocalint[]=new int[xLocal.length];
        for(int i=0;i<xLocal.length;i++)
            xLocalint[i]=(int)(xLocal[i]*Math.cos(theta)-yLocal[i]*Math.sin(theta)+xc);//conversion to screen coordinate system
        return xLocalint;
    }
    
    /**
     * This method, similar to the previous one, retrives the y-coordinates of the vertices (counter clock-wise order) of the shape in the 
     * screen coordinate system
     * 
     * @param yLocalint    array consisting the y-coordinates of the
     * vertices of the shape in screen coordinate system
     * 
     * @return yLocalint    returns the array of y-coordinates of the vertices of the shape 
     * in its screen coordinate system  
     */
    
    public int[] getY(){
        int yLocalint[]=new int[yLocal.length];
        for(int i=0;i<yLocal.length;i++)
            yLocalint[i]=(int)(xLocal[i]*Math.sin(theta)+yLocal[i]*Math.cos(theta)+yc);//conversion to screen coordinate system
        return yLocalint;
    }
}