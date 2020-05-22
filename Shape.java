import java.util.*;
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape implements Drawable, Comparable<Shape>
{
    protected int area;
    protected String shapeType;
    protected double perimeter;

    
    
    public int compareTo(Shape other)
    {
        Shape anotherShape = (Shape) other;
        
        int result = this.shapeType.compareTo(anotherShape.shapeType);
        
        if(result == 0)
        {
          result = this.area - anotherShape.area;  
        }
        return result;
    }
    
    public int getArea()
    {
      return area;
    }
    
    public String getShapeType()
    {
      return shapeType;  
    }
    
    public double getPerimeter()
    {
      return perimeter;  
    }
    
    // public String toString()
    // {
      // String details = "Area: " + getArea() + "," + " Type: " + 
                            // getShapeType() + "," + " Perimeter: " + getPerimeter();
      // return details;
    // }
    
    
}
