/********************************************************************************************************/
/**
 * Class TestWorker - Object-oriented Programming (Polymorphism)
 *
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
 * declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is authentic record
 * of my own work.
 *
 * @YUEN Yiu Yeung 
 * @2021-01-30 
 */
public class TestWorker
{
    final static String className = "TestWorker";
    final static String classDATE = "30-01-2021";
    
    public static void main(String [] args) {
       
       TestWorker test = new TestWorker();
       test.printHeader();
       
       Worker [] w = new Worker[3];
       w[0] = new Worker("Peter");
       w[1] = new CommissionWorker("John",120,10);
       w[2] = new HourlyWorker("Mary",25,40);
       
       for (int i = 0; i < w.length; i++)
           System.out.println(w[i]);

       test.printFooter();
       
    }
    
    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\**********//////////////////"
                           +"//////");
        System.out.println("************************"+className+"************************");
        System.out.println("==========================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n==========================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////**********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           +"\\\\\\");
    }
}

/********************************************************************************************************/
