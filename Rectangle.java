
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    private int length;
    private int width; 
    private boolean isSquare = false;
    public void draw()
    {
       if(isSquare())
       {
        System.out.println("Drawing Square");
        }
        else {
        System.out.println("Drawing Rectangle"); 
       }
    }
    
    public boolean isSquare()
    {
       if(length == width)
       {
          isSquare = true; 
        }
       return isSquare;
    }
    
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
        
        area = length * width;
        if(isSquare()){
            shapeType = "Square";
        }
        else {
           shapeType = "Rectangle"; 
        }
        perimeter = 2*length + 2*width;
    }
    
    public String toString()
    {
      String details = "Length: " + length + "  Width: " + width + 
                       " Area: " + getArea() + " Perimeter: " + getPerimeter();
      return details;
    }
    
    public int getLength()
    {
      return length;   
    }
    
    public int getWidth()
    {
       return width; 
    }
    
    
}
