/********************************************************************************************************/
/**
 * Class TestFood - Object-oriented Programming(abstract class and methods)
 *
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
 * declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is authentic record
 * of my own work.
 *
 * @YUEN Yiu Yeung 
 * @2021-01-31
 */
public class TestFood {
    final static String className = "TestFood";
    final static String classDATE = "31-01-2021";
    
    public static void main( String s[] ) {
        
        TestFood test = new TestFood();
        test.printHeader();

        Food f[] = new Food[4];
        f[0] = new Drink( "Pepsi", 7, 250 );
        f[1] = new Coffee( "Cappuccino", 13, 200, true );
        f[2] = new Drink( "Orange Juice", -10, 180 );
        f[3] = new Coffee( "Ireland", -11, 200, false );
        
        for ( int i = 0; i < f.length; i++ ) {
            System.out.println( "Food " + i + ": " + f[i] );
        }
        
        test.printFooter();
    }
    
    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\********//////////////////"
                           +"//////");
        System.out.println("************************"+className+"************************");
        System.out.println("========================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n========================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           +"\\\\\\");
    }
}

/********************************************************************************************************/

