/********************************************************************************************************/
/************************************************************************************************
*                                                                      *
*      "Queue"                                                         *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 18-03-2021                                            *
* @Program     : Lab3.3Q3(b)                                           *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      18/03/2021    new today                                         *
*                                                                      *
************************************************************************************************/
public class LinkedQueueTimingB {
    final static String className = "LinkedQueueTiming";
    final static String classDATE = "18-03-2021";
    
    public static void main(String [] args) {
        printHeader();
        
        Queue queue = new LinkedQueue();
        if (args.length != 1) 
            System.out.println("java QueueTest <num>");
        else {
            int count = Integer.parseInt(args[0]);
            long startTime = System.nanoTime();
            for (int i=0; i<count; i++) {
                queue.enqueue(new Integer(i));
            }
            long endTime = System.nanoTime();
            System.out.println(endTime - startTime);
        }
        
        printFooter();
    }
    
    private static void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*****************///////////////////"
                           + "/////");
        System.out.println("************************"+className+"************************");
        System.out.println("=================================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n=================================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////*****************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/