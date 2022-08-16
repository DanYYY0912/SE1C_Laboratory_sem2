/********************************************************************************************************/
/**
 * Class Divide - Exception
 *
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
 * declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is authentic record
 * of my own work.
 *
 * @YUEN Yiu Yeung 
 * @2021-02-21 
 */
import java.util.Random;
public class Divide {
    final static String className = "Divide";
    final static String classDATE = "21-02-2021";
    
    public static void main(String args[]) {
        
        Divide test = new Divide();
        test.printHeader();
        
        int a = 0;
        int n = 0;
        for (int i=0; i<10; i++) {
            n = (int) (Math.random()*10);
            try{
                a = 100 / n;
            } catch(ArithmeticException e) {
                System.out.println("Division By Zero");
            }
            System.out.println("n:" + n + ", a:" + a);
        }
            
        test.printFooter();
    }
    
    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\******//////////////////"
                           +"//////");
        System.out.println("************************"+className+"************************");
        System.out.println("======================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n======================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////******\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           +"\\\\\\");
    }
}

/********************************************************************************************************/