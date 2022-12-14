/********************************************************************************************************/
/**
 * Class InputParsing2 - Exception
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
public class InputParsing2 {
    final static String className = "InputParsing2";
    final static String classDATE = "21-02-2021";
    
    public static void parseInput(int[] numArray, String input) {
        
        InputParsing2 test = new InputParsing2();
        test.printHeader();
        
        int num=0;
        int total=0;
        double average=0.0;

        try {
            System.out.println("Input length = " + input.length());
            num = Integer.parseInt (input);
            if(num == 0)
                 throw new ArithmeticException();
            if (num < 0)
                 throw new NegativeNumberException();
            total = 0;
            for (int i = 0; i < num; i++)
                total += numArray[i];
            average = total / num;
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
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        } catch (ArithmeticException e) {
            System.out.println("Don't input zero!");
            e.printStackTrace();
            return;
        } catch (RuntimeException e) {
            System.out.println("Run time error!");
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Something wrong!");
            e.printStackTrace();
        } finally {
            System.out.println("Number = " + num);
            test.printFooter();
        }
            System.out.println("Average over first " + num + " numbers = " 
            + average);
            
        test.printFooter();
    }

    public static class NegativeNumberException extends ArithmeticException {
        public NegativeNumberException() {
            super("No negative number please!");
        }
    }

    public static void main( String[] args ) {
        String input;
        int [] a = {80, 60, 72, 85, 90};
        String output;

        output = "The 5 marks are:";
        for (int i=0; i<5; i++) 
            output += " "+a[i];
        output += "\nAverage of how many numbers?";

        do {
            input = JOptionPane.showInputDialog(output);
            try {
                parseInput(a, input);
            } catch (Exception e) {
                System.out.println("Number should be in 1 to 5!");
            }
        } while (JOptionPane.showConfirmDialog(null, "Enter again?", 
                "elect an option", JOptionPane.OK_CANCEL_OPTION)
                == JOptionPane.OK_OPTION);
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