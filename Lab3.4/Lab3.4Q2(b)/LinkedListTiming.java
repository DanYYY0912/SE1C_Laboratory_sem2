/********************************************************************************************************/
/************************************************************************************************
*                                                                                               *
*      "Trees"                                                                                  *
*                                                                                               *
* @Name        : YUEN YIU YEUNG                                                                 *
* @StudentID   : 200171873                                                                      *
* @Class       : IT114105/1C                                                                    *
* @Date        : 30-03-2021                                                                     *
* @Program     : Lab3.4Q2(b)                                                                    *
* @Declaration :                                                                                *
*     I understand the meaning of academic dishonesty, in particular plagiarism,                *
*     copyright infringement and collusion.                                                     *
*     I am aware of the consequences if found to be involved in these misconducts.              *
*     I hereby declare that the work submitted for the                                          *
*     “ITP4510 Data Structures & Algorithms” is authentic record of my own work.                *
* @Input       : AutoRun                                                                        *
* @Output      : AutoPrint                                                                      *
* @History     :                                                                                *
*      30/03/2021    new today                                                                  *
*                                                                                               *
************************************************************************************************/
import java.io.*;
import java.util.*;
public class LinkedListTiming {
    final static String className = "LinkedListTiming";
    final static String classDATE = "30-03-2021";
    
    public static void main(String [ ] args) {
        LinkedList sll = new LinkedList();
        try {
            printHeader();
            Scanner fin = new Scanner(new File(args[0]));
            String line;
            while (fin.hasNextLine()) {
                line = fin.nextLine(); 
                line = line.trim();
                sll.addToHead(line);
            }
            fin.close();
            long startTime = System.nanoTime();
            String ans = sll.search(args[1]);  
            long endTime = System.nanoTime();
            if (ans==null)
                System.out.println("Not found; Time used: " + (endTime - startTime));
            else
                System.out.println("Found; Time used: " + (endTime - startTime));
            printFooter();
        }
        catch (FileNotFoundException e) {
            System.out.println("Failed to open " + args[0]);
            printFooter();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: BstTiming <word_file> <search_word>");
            printFooter();
        }
    }
    
    private static void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\****************///////////////////"
                           + "/////");
        System.out.println("************************"+className+"************************");
        System.out.println("================================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n=================================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////****************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/