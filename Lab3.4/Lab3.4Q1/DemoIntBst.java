/********************************************************************************************************/
/************************************************************************************************
*                                                                                               *
*      "Trees"                                                                                  *
*                                                                                               *
* @Name        : YUEN YIU YEUNG                                                                 *
* @StudentID   : 200171873                                                                      *
* @Class       : IT114105/1C                                                                    *
* @Date        : 30-03-2021                                                                     *
* @Program     : Lab3.4Q1                                                                       *
* @Declaration :                                                                                *
*     I understand the meaning of academic dishonesty, in particular plagiarism,                *
*     copyright infringement and collusion.                                                     *
*     I am aware of the consequences if found to be involved in these misconducts.              *
*     I hereby declare that the work submitted for the                                          *
*     “ITP4510 Data Structures & Algorithms” is authentic record of my own work.                *
* @Input       : AutoRun                                                                        *
* @Output      : AutoPrintRandomly                                                              *
* @History     :                                                                                *
*      30/03/2021    new today                                                                  *
*                                                                                               *
************************************************************************************************/
public class DemoIntBst {
    final static String className = "DemoIntBst";
    final static String classDATE = "30-03-2021";
    
    public static void main(String [] args) {
        
        printHeader();
        
        IntBst tree = new IntBst();
        for (int count=0; count<15; count++) {
            int rand = (int) Math.floor(Math.random()*26);
            int ch = (int) rand;
            tree.addNode(ch);
        }

        System.out.println("PreOrder:  " + tree.preorder());
        System.out.println("InOrder:   " + tree.inorder());
        System.out.println("PostOrder: " + tree.postorder());
        
        printFooter();
    }

    private static void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\**********///////////////////"
                           + "/////");
        System.out.println("************************"+className+"************************");
        System.out.println("==========================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n==========================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////**********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/