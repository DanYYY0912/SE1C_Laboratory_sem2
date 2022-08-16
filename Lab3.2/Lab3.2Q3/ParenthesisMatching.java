/********************************************************************************************************/
/************************************************************************************************
*                                                                                              *
*      "ParenthesisMatching - Stacks"                                                          *
*                                                                                              *
* @Name        : YUEN YIU YEUNG                                                                *
* @StudentID   : 200171873                                                                     *
* @Class       : IT114105/1C                                                                   *
* @Date        : 12-03-2021                                                                    *
* @Program     : Lab3.2Q3                                                                      *
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
import java.util.*;
public class ParenthesisMatching {
    final static String className = "ParenthesisMatching";
    final static String classDATE = "12-03-2021";
    
    public static void main(String [ ] args) {
        printHeader();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Expression? ");
        String exp = keyboard.nextLine();
        
        if (parenthesisMatching(exp)) 
            System.out.println("Parenthesis matched");
        else
            System.out.println("Parenthesis not matched");

        printFooter();
    }

    public static boolean parenthesisMatching(String exp) {
        Stack stack = new ArrayStack(10);
        // complete this method
        
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else if(c == '}' || c == ']' || c ==')'){
                if (stack.isEmpty()) {
                    return false;
                } else if ((char)stack.top() == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*******************//"
                           + "//////////////////////");
        System.out.println("************************"+className+"************************");
        System.out.println("===================================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    public static void printFooter() {
        System.out.println("\n===================================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////*******************\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\\\\\\\\\\\\\\\\\");
    }
}
