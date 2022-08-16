/********************************************************************************************************/
/************************************************************************************************
*                                                                                              *
*      "Linked Lists"                                                                          *
*                                                                                              *
* @Name        : YUEN YIU YEUNG                                                                *
* @StudentID   : 200171873                                                                     *
* @Class       : IT114105/1C                                                                   *
* @Date        : 07-03-2021                                                                    *
* @Program     : Lab3.1Q2                                                                      *
* @Input       : AutoRun(noNeed)                                                               *
* @Output      : AutoPrint                                                                     *
* @History     :                                                                               *
*      07/03/2021    new today                                                                 *
*                                                                                              *
* @Declaration :                                                                               *
*     I understand the meaning of academic dishonesty, in particular plagiarism,               *
*     copyright infringement and collusion.                                                    *
*     I am aware of the consequences if found to be involved in these misconducts.             *
*     I hereby declare that the work submitted for the                                         *
*     “ITP4510 Data Structures & Algorithms” is authentic record of my own work.               *                                                       *
************************************************************************************************/
public class Test {
    final static String className = "Test";
    final static String classDATE = "07-03-2021";
    
    public static void main(String [] args) {
        
        Test gate = new Test();
        gate.printHeader();
        
        Comparator c = new StringComparator();
        LinkedList s = new LinkedList(c);
        System.out.println(s);

        s.insertInOrder("Betty");
        System.out.println(s);
        s.insertInOrder("Dave");
        System.out.println(s);
        s.insertInOrder("Catherine");
        System.out.println(s);
        s.insertInOrder("Thomas-1");
        System.out.println(s);
        s.insertInOrder("Sandra");
        System.out.println(s);
        s.insertInOrder("Thomas-2");
        System.out.println(s);
        s.insertInOrder("Alice-1");
        System.out.println(s);
        s.insertInOrder("Alice-2");
        System.out.println(s);
        
        System.out.println("(iv):\n"
                           + "Since the program removed an item that is determined by Person's age");
        
        gate.printFooter();
    }

    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\****///////////////////"
                           + "/////");
        System.out.println("************************"+className+"************************");
        System.out.println("====================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n====================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////****\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/