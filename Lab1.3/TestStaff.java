/********************************************************************************************************/
/**
 * Class TestStaff - Object-oriented Programming(Interface)
 *
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
 * declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is authentic record
 * of my own work.
 *
 * @YUEN Yiu Yeung 
 * @2021-01-31 
 */
public class TestStaff {
    final static String className = "TestStaff";
    final static String classDATE = "31-01-2021";
    
    public static void main(String args[]) {
        
        TestStaff test = new TestStaff();
        test.printHeader();
        
        PartTimeStaff p1 = new PartTimeStaff("John", 123, 'B', 20);
        PartTimeStaff p2 = new PartTimeStaff("Mary", 124, 'A', 22);
        p1.display();
        p2.display();
        
        test.printFooter();
    }
    
    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*********//////////////////"
                           +"//////");
        System.out.println("************************"+className+"************************");
        System.out.println("=========================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n=========================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////*********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           +"\\\\\\");
    }
}

/********************************************************************************************************/
