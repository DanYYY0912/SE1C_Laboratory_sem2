
/**
 * Class Shape - Object-oriented Programming(abstract class and methods)
 *
 * @YUEN Yiu Yeung 
 * @2021-01-31
 */
public abstract class Shape {
    protected String name;
    
    public Shape( String n ) {
        name = n;
    }
    public abstract double getArea();
    
    public String getName() { return name; }
}

