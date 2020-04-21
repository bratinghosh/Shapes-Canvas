/**
 * The class is used to model n sided polygons and inherits the properties of shapes from class Shape. It consists of 
 * other attributes and behaviours generally present in a regular polygon
 * 
 * @author  Bratin Ghosh(3035437692)
 */

public class RegularPolygon extends Shape{
    private int numOfSides;//specify the number of sides of the regular n-sided polygon
    private double radius;//specify the radius of the regular n-sided polygon
    
    /**
     * Constructor for building a regular n-sided polygon with a radius of r
     * 
     * @param n     specify the number of sides of the regular n-sided polygon
     * @param r     specify the radius of the regular n-sided polygon
     */
    
    public RegularPolygon(int n, double r){
        setNumOfSides(n);//n number of sides
		setRadius(r);// r radius 
        setVertices();
    }//end of constructor 
    
    /**
     * Constructor for building a regular n-sided polygon with a radius of 1
     * 
     * @param n     specify the number of sides of the regular n-sided polygon
     */
    
    public RegularPolygon(int n){
        setNumOfSides(n);//n number of sides
		setRadius(1.0);// radius of 1.0
        setVertices();
    }//end of constructor 
    
    /**
     * Constructor for building a regular 3-sided polygon(triangle) with a radius of 1
     */
    
    public RegularPolygon(){
        setNumOfSides(3);//3 sides 
		setRadius(1.0);//radius of 1.0
        setVertices();
    }//end of constructor 
    
    /**
     * Getter function to get the number of sides present in the polygon
     * 
     * @return numOfSides     specify the number of sides of the regular n-sided polygon
     */
    
    public int getNumOfSides(){
        return this.numOfSides;
    }//end of getter
    
    /**
     * Getter function to get the radius of the polygon
     * 
     * @return radius      specify the radius of the regular n-sided polygon
     */
    
    public double getRadius(){
        return this.radius;
    }//end of getter
    
    /**
     * Setter function to get the number of sides present in the polygon
     * 
     * @param n     specify the number of sides of the regular n-sided polygon
     */
    
    public void setNumOfSides(int n){
        if(n<3)//ensures proper initialization of n
            this.numOfSides=3;//a polygon having minimum number of sides is triangle(3 sides) 
        else
            this.numOfSides=n;
        setVertices();
    }//end of setter
    
    /**
     * Setter function to get the radius of the polygon
     * 
     * @param r      specify the radius of the regular n-sided polygon
     */
    
    public void setRadius(double r){
        if(r<0)//ensures proper initialization of r
            this.radius=0;//a polygon cannot have a negative radius as it is impossible
        else
            this.radius=r;
        setVertices();
    }//end of setter 
    
    /**
     * The method is used for setting the local coordinates of the vertices of the
     * regular n-sided polygon based on its number of sides and radius
     * 
     * @param   xLocal  stores the local x-coordinates of the vertices of the regular n-sided polygon
     * @param   yLocal  stores the local y-coordinates of the vertices of the regular n-sided polygon
     */
    private void setVertices(){
        double xLocal[]=new double[this.numOfSides];//size of array is number of vertices in the polygon
        double yLocal[]=new double[this.numOfSides];//size of array is number of vertices in the polygon
        if(this.numOfSides%2!=0){//execute if-block if the polygon has odd number of sides
            for(int i=0;i<xLocal.length;i++){
                xLocal[i]=radius*Math.cos((2*i*Math.PI)/this.numOfSides);//x-coordinates of the vertices
                yLocal[i]=radius*Math.sin((2*i*Math.PI)/this.numOfSides);//y-coordinates of the vertices
            }
        }
        else{//execute else-block if the polygon has even number of sides
            for(int i=0;i<xLocal.length;i++){
                xLocal[i]=radius*Math.cos((Math.PI/this.numOfSides)+((2*i*Math.PI)/this.numOfSides));//x-coordinates of the vertices
                yLocal[i]=radius*Math.sin((Math.PI/this.numOfSides)+((2*i*Math.PI)/this.numOfSides));//y-coordinates of the vertices
            }
        }
        super.setXLocal(xLocal);//setting of the local x-coordinates of the vertices
        super.setYLocal(yLocal);//setting of the local y-coordinates of the vertices
    }

    /**
     * The following method is used to determine whether a point located at (x,y) in
     * the screen coordinate system is contained within the n-sided polygon
     * 
     * 
     * @param x         specify the x-coordinate of the point in screen coordinate system
     * @param y         specify the x-coordinate of the point in screen coordinate system   
     * @param Rotations stores the number of rotations of the point (x,y) about the origin
     * @param local_x   specify the x-coordinate of the point in local coordinate system
     * @param local_y   specify the y-coordinate of the point in local coordinate system
     * @param xLocal    an array of all the x-coordinates of the vertices of the shape
     * @param compare   stores the minimum value present in the array xLocal
     * 
     * @return check    stores true or false specifying whether the point is located inside 
     * or outside the polygon
     */
    
    public boolean contains (double x, double y) {
        int Rotations = 0;
		double local_x = (x-super.getXc())*Math.cos(-super.getTheta())-(y-super.getYc())*Math.sin(-super.getTheta());
		double local_y = (x-super.getXc())*Math.sin(-super.getTheta())+(y-super.getYc())*Math.cos(-super.getTheta());
		double[] xLocal = getXLocal();
		boolean check=true;
		double compare =xLocal[1];//initially compare is set to the 2 element of the array
		for (int i=0; i < xLocal.length; i++) 
			if (xLocal[i]< compare) 
				compare = xLocal[i];//finding the minimum value in the xLocal[] array
		while (Rotations < numOfSides ) {
			double temp_local_x = local_x;
			if (local_x < compare ) 
				return !check;//return false if the condition in if statement is fulfilled
			local_x = local_y *Math.sin(2*Math.PI/numOfSides) + local_x*Math.cos(2*Math.PI/numOfSides);//rotation of x about origin
			local_y = local_y *Math.cos(2*Math.PI/numOfSides) - temp_local_x*Math.sin(2*Math.PI/numOfSides);//rotation of y about origin
			Rotations++;//keep track of each rotation
		}
		return check;//return true if local_x passes all the tests implying it is present inside the polygon
    }
}