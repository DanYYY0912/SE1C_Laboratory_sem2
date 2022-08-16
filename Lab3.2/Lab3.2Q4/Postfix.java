/********************************************************************************************************/
/************************************************************************************************
*                                                                                              *
*      "EvaPostfix - Stacks"                                                                   *
*                                                                                              *
* @Name        : YUEN YIU YEUNG                                                                *
* @StudentID   : 200171873                                                                     *
* @Class       : IT114105/1C                                                                   *
* @Date        : 12-03-2021                                                                    *
* @Program     : Lab3.2Q4                                                                      *
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
public class Postfix {
    final static String className = "EvaPostfix";
    final static String classDATE = "12-03-2021";
    
    public static void main(String [] args) {
        
        Postfix gate = new Postfix();
        gate.printHeader();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Postfix expression? ");
        String exp = keyboard.nextLine();
        
        try {
            int result = evalPostfix(exp);
            System.out.println("The result is " + result);
        } catch (Exception e) {
            System.out.println("Invalid postfix expression!");
            e.printStackTrace();
        }
    }

    public static int evalPostfix(String postfix) {
        ArrayStack s = new ArrayStack();
        int opd1, opd2;
        
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if(c == ' ')
                continue;
            if (Character.isDigit(c)) { 
                int value = Character.getNumericValue(c);
                s.push(value);
            } else {
                opd2 = (int)s.pop();
                opd1 = (int)s.pop();
                switch(c){
                    case '+':
                        s.push((opd1 + opd2));
                        break;
                    case '-':
                        s.push((opd1 - opd2));
                        break;
                    case '*':
                        s.push((opd1 * opd2));
                        break;
                    case '/':
                        s.push((opd1 / opd2));
                        break;
                }
            }
        }
        return (int)s.pop();
    } 
    
    public static String InfixToPostfix(String exp){
        String str = "";
        Stack s = new ArrayStack();
        char op = '\0';
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == ' ')
                continue;
            if(Character.isDigit(ch)){
                str += ch + " ";
            }else if(ch == '('){
                s.push(ch);
            }else if(ch == ')'){
                do{
                    op = (char)s.pop();
                    if(op != '(')
                        str += op + " ";
                }while(op == '(');
            }else{
                while(!s.isEmpty()){
                    op = (char)s.pop();
                    if((op == '*' || op == '/') && (ch == '+' || ch == '-')){
                        str += op + " ";
                    }else{
                        s.push(op);
                        break;
                    }
                }
                s.push(ch);
            }
        }
        while(!s.isEmpty()){
            op = (char)s.pop();
            str += op + " ";
        }
        return str;
    }

    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\**********///////////////////"
                           + "/////");
        System.out.println("************************"+className+"************************");
        System.out.println("=======================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n=======================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////**********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/