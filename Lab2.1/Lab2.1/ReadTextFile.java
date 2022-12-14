/********************************************************************************************************/
/**
 * Class ReadTextFile - Exception
 *
 * I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
 * and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
 * declare that the work submitted for the “ITP4510 Data Structures & Algorithms” is authentic record
 * of my own work.
 *
 * @YUEN Yiu Yeung 
 * @2021-02-21 
 */
import java.util.*;
import java.io.*;
public class ReadTextFile {
    final static String className = "ReadTextFile";
    final static String classDATE = "21-02-2021";

    public static void main(String args[]) throws FileNotFoundException  {
        
        ReadTextFile test = new ReadTextFile();
        test.printHeader();
        
        String filename = "";
        String line;
        try {
            filename = args[0];
            Scanner fin = new Scanner(new File(filename));
            while (fin.hasNextLine()) {
                line = fin.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failed to open file hello.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: java ReadTextFile <filename>");
        }

        test.printFooter();
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