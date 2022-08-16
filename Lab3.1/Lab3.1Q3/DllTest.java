/********************************************************************************************************/
/************************************************************************************************
*                                                                                              *
*      "Linked Lists"                                                                          *
*                                                                                              *
* @Name        : YUEN YIU YEUNG                                                                *
* @StudentID   : 200171873                                                                     *
* @Class       : IT114105/1C                                                                   *
* @Date        : 07-03-2021                                                                    *
* @Program     : Lab3.1Q3                                                                      *
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
public class DllTest {
    final static String className = "DllTest";
    final static String classDATE = "07-03-2021";
    
    public static void main(String [ ] args) {
        
        DllTest gate = new DllTest();
        gate.printHeader();
        
        DoublyList d = new DoublyList();
        d.addToHead( new Integer(23) );
        d.addToTail(new Integer(42));
        d.addToTail(new Character('n'));
        d.addToTail(new String("hello"));
        d.addToHead(new String("apple"));
        System.out.println(d);
        System.out.println(d.forward());
        System.out.println(d.backward());
        
        gate.printFooter();
    }
    
    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*******///////////////////"
                           + "/////");
        System.out.println("************************"+className+"************************");
        System.out.println("=======================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n=======================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////*******\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/

