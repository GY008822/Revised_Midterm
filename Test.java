import java.util.*;
/**
 * Write a description of class Test here.
 *
 * @author (Garrett Young)
 * @version (a version number or a date)
 */
public class Test 
{
    //In the case of -15, we first need to write 15 as an 8 bit binary value:
    // 00001111
    //Now, we flip the bits and then add one:
    // 11110001
    //The resulting 8 bit value is the two's complement for -15.
    public static void main(String[] args)
    { 
       List<Shape> shapes = new ArrayList<>();
       
       var rect = new Rectangle(3,5);
       var circle = new Circle(5.0);
       var square = new Square(3,3);
       var circle2 = new Circle(6.0);
       var circle3 = new Circle(7.0);
       var circle4 = new Circle(8.0);
       var rect2 = new Rectangle(4,6);
       var rect3 = new Rectangle(5,7);
       var rect4 = new Rectangle(6,8);
       
       shapes.add(rect);
       shapes.add(rect2);
       shapes.add(rect3);
       shapes.add(rect4);
       
       shapes.add(circle);
       shapes.add(circle2);
       shapes.add(circle3);
       shapes.add(circle4);
       shapes.add(square);
       
       
       for(Shape shape : shapes)
        {
         //System.out.println(shape);  
        }
        
       var sort = new TreeSet(shapes);
        //sorts by area, largest to smallest
       //System.out.println(sort);
       
       //sort.stream().forEach(s -> System.out.println(s));
       
       printShapeType(circle,shapes);
       
       //below is my attempt at the EXTRA problem.
       //My biggest issue is that I cannot figure out how to make each shape 
       //differentiated from one another. Since "s" and "s" are always the same
       //the result of my compare method is always 0 and thus the perimeters
       //are printed in the incorrect order.
       
       //shapes.stream().map(s -> s.getPerimeter())
                      //.filter(s -> compare(s,s) == 0)
                      //.forEach(s -> System.out.println(s));
    }
    
    private static void printShapeType(Shape shape, List<Shape> shapeList)
    {
      if(shape instanceof Circle)
      {
         shapeList.stream().filter(s -> s instanceof Circle).forEach(s -> System.out.println(s));
      }
      else if(shape instanceof Rectangle)
      {
         shapeList.stream().filter(s -> s instanceof Rectangle).forEach(s -> System.out.println(s)); 
        }
      else if (shape instanceof Square)
      {
         shapeList.stream().filter(s -> s instanceof Square).forEach(s -> System.out.println(s)); 
        }
    }
    /**
     * My attempt at the method EXTRA problem. I had a general idea
     * for what I needed to do but my logic when making the method for ordering
     * the perimeters if flawed.
     */
    private static int compare(double p1, double p2)
    {

       int result = 0;
       if(p1 == p2)
       {
         result = 0;  
        }
       if(p1 < p2)
        {
         result = 1;  
        }
        if(p1 > p2)
       {
         result = -1;  
        }
       return result;
    }

}