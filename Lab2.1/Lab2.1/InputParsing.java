/********************************************************************************************************/
/**
 * Class InputParsing - Exception
 *
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
 * declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is authentic record
 * of my own work.
 *
 * @YUEN Yiu Yeung 
 * @2021-02-21 
 */
import javax.swing.JOptionPane;
public class InputParsing {
    final static String className = "InputParsing";
    final static String classDATE = "21-02-2021";
    
    public static void main(String args[]) {
        
        InputParsing test = new InputParsing();
        test.printHeader();
        
        String input;
        int num=0;
        int total=0;
        int average=0;
        int [] a = {80, 60, 72, 85, 90};
        String output;

        output = "The 5 marks are:";
        for (int i=0; i<5; i++) 
            output += " "+a[i];
        output += "\nAverage of how many numbers?";
        input = JOptionPane.showInputDialog(output);

        try {
            System.out.println("Input length = " + input.length());
            num = Integer.parseInt(input);
            total = 0;
            for (int i=0; i<num; i++) 
                total += a[i];
            average = total / num;
            if (num == 0)
                throw new ArithmeticException();
            if (num < 0)
                throw new NegativeNumberException();
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No more than 5 please!");
            e.printStackTrace();
            return;
        } catch (NumberFormatException e) {
            System.out.println("Integer Please!");
            e.printStackTrace();
            return;
        } catch (NullPointerException e) {
            System.out.println("Input length = 0 \nCancelled \n");
            e.printStackTrace();
            return;
        } catch (ArithmeticException e) {
            System.out.println("Don't input zero!");
            e.printStackTrace();
            return;
        } catch (RuntimeException e) {
            System.out.println( "Run time error!" );
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println( "Something wrong!" );
            if (num >= 0)
            test.printFooter();
        } finally {
            System.out.println("Number = " + num);
            test.printFooter();
        }
        System.out.println("Average over first " + num + " numbers = " 
        + average);
    }
    
    public static class NegativeNumberException extends ArithmeticException {
        public NegativeNumberException() {
            super("No negative number please!");
        }
    }
   
    private void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\************//////////////////"
                           +"//////");
        System.out.println("************************"+className+"************************");
        System.out.println("============================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n============================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           +"\\\\\\");
    }
}

/********************************************************************************************************/