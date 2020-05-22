import java.util.*;

/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    private double radius;
    private double diameter;
    
    
    
    public Circle(double radius)
    {
       this.radius = radius;
       perimeter = 2*Math.PI*radius;
       shapeType = "Circle";
       area = (int) (Math.PI*Math.pow(radius,2.0));
    }
    
    public void draw()
    {
      System.out.println("Drawing Circle");  
    }
    
    
    
    public String toString()
    {
       String details = "Radius: " + radius + " Circumference: " + getPerimeter()
                            + " Area: " + getArea();
       return details;
    }
    
    public double getCircumference()
    {
      return perimeter;
    }
    
    
}
