/********************************************************************************************************/
/************************************************************************************************
*                                                                                              *
*      "Reverse - Stacks"                                                                      *
*                                                                                              *
* @Name        : YUEN YIU YEUNG                                                                *
* @StudentID   : 200171873                                                                     *
* @Class       : IT114105/1C                                                                   *
* @Date        : 12-03-2021                                                                    *
* @Program     : Lab3.2Q1                                                                      *
* @Input       : AutoRun                                                                       *
* @Output      : AutoPrint                                                                     *
* @History     :                                                                               *
*      12/03/2021    new today                                                                 *
*                                                                                              *
* @Declaration :                                                                               *
*     I understand the meaning of academic dishonesty, in particular plagiarism,               *
*     copyright infringement and collusion.                                                    *
*     I am aware of the consequences if found to be involved in these misconducts.             *
*     I hereby declare that the work submitted for the                                         *
*     “ITP4510 Data Structures & Algorithms” is authentic record of my own work.               *                                                       *
************************************************************************************************/
package adtStack;
public class Reverse {
    final static String className = "Reverse";
    final static String classDATE = "12-03-2021";
    
    public static void main(String [ ] args) {
        
        Reverse gate = new Reverse();
        gate.printHeader();
        
        String [ ] arr = {"Abby", "Boris", "Cat", "Dino", "Elvis"};
        Stack stack = new LinkedStack();
        for (int i=0; i<arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i=0; i<arr.length; i++) {
            arr[i] = (String) stack.pop();
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
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
