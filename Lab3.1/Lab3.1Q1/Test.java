/********************************************************************************************************/
/************************************************************************************************
*                                                                                              *
*      "Linked Lists"                                                                          *
*                                                                                              *
* @Name        : YUEN YIU YEUNG                                                                *
* @StudentID   : 200171873                                                                     *
* @Class       : IT114105/1C                                                                   *
* @Date        : 07-03-2021                                                                    *
* @Program     : Lab3.1Q1                                                                      *
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
        
        LinkedList s = new LinkedList();
        System.out.println(s);

        s.addToHead("Betty");
        s.addToTail("Dave");
        s.addToTail("Felix");
        s.addToTail("Jenny");
        System.out.println(s);

        System.out.println("count = " + s.getCount());
        System.out.println("Pos 0 = " + s.getItemAt(0));
        System.out.println("Pos 2 = " + s.getItemAt(2));
        System.out.println("Last  = " + s.getItemAt(s.getCount() - 1));

        s.addItemAt("Gary", 3);
        System.out.println(s);
        s.addItemAt("Apple", 0);
        System.out.println(s);
        System.out.println("count = " + s.getCount());
        System.out.println("Removing " + s.removeItemAt(2));
        System.out.println(s);
        System.out.println("Removing " + s.removeItemAt(0));
        System.out.println(s);
        System.out.println("Removing " + s.removeItemAt(3));
        System.out.println(s);
        
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


