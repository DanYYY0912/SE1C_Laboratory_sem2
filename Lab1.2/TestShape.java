/********************************************************************************************************/
/**
 * Class TestShape - Object-oriented Programming(abstract class and methods)
 *
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
 * declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is authentic record
 * of my own work.
 *
 * @YUEN Yiu Yeung 
 * @2021-01-31 
 */
public class TestShape {
    final static String className = "TestShape";
    final static String classDATE = "31-01-2021";
    
    public static void main( String [] args ) {
        
        TestShape test = new TestShape();
        test.printHeader();
        
        Shape[] myShapes = new Shape[3];
        myShapes[0] = new Circle( 10.5, 20, 25 );
        myShapes[1] = new Rectangle( 30.5, 23.5, 15.5, 20.5 );
        myShapes[2] = new Circle( 8, 9.5, 10.5 );

        for ( int i = 0; i < myShapes.length; i++ ) {
            System.out.println(myShapes[i].getName() + "="
                    + myShapes[i].toString() + "; Area="
                    + myShapes[i].getArea() );
        }
        
        test.printFooter();
    }
    
    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*********//////////////////"
                           +"//////");
        System.out.println("************************"+className+"************************");
        System.out.println("==========================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n==========================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////*********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           +"\\\\\\");
    }
}    

/********************************************************************************************************/

