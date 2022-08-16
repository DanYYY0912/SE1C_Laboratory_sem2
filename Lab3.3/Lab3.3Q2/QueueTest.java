/********************************************************************************************************/
/************************************************************************************************
*                                                                      *
*      "Queue"                                                         *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 18-03-2021                                            *
* @Program     : Lab3.3Q2                                              *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      18/03/2021    new today                                         *
*                                                                      *
************************************************************************************************/
public class QueueTest {
    final static String className = "QueueTest";
    final static String classDATE = "18-03-2021";
    
    public static void main(String [] args) {
        QueueTest gate = new QueueTest();
        gate.printHeader();
        
        Queue queue = new ArrayQueue();
        
        queue.enqueue("Alex");
        System.out.println("Front: " + queue.front());
        System.out.println(queue);
        queue.enqueue("Sandy");
        System.out.println("Front: " + queue.front());
        System.out.println(queue);
        queue.enqueue("Betty");
        System.out.println("Front: " + queue.front());
        System.out.println(queue);
        System.out.println("Removed: " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Removed: " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Removed: " + queue.dequeue());
        System.out.println(queue);
        
        gate.printFooter();
    }
    
    private static void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*********///////////////////"
                           + "/////");
        System.out.println("************************"+className+"************************");
        System.out.println("=========================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n=========================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////*********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/