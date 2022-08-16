
/**
 * Class Rectangle - Object-oriented Programming(abstract class and methods)
 *
 * @YUEN Yiu Yeung 
 * @2021-01-31
 */
public class Rectangle extends Shape
{
    private Point topLeft;
    private double width;
    private double height;
    
    public Rectangle(double x, double y, double w, double h) {
        super("Rectangle");
        this.topLeft = (new Point (x,y));
        setWidth(w);
        setHeight(h);
    }
    
    public double getWidth() {return width;}
    public double getHeight() {return height;}
    public Point getTopLeft() {return topLeft;}
    
    public void setWidth(double w) {
        this.width = w;
    }
    
    public void setHeight(double h) {
        this.height = h;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public String toString() {
        return "Width["+getWidth() + "]; " + "Height[" + getHeight() + "]" + "coordinates" + topLeft.toString();
    }
}
