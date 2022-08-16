package Q4;

/********************************************************************************************************/
/**
* class BubbleSort - Sorting
*
* I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
* and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
* declare that the work submitted for the "ITP4510 Data Structures & Algorithms" is authentic record
* of my own work.
*
* @Name : YUEN Yiu Yeung
* @StdID: 200171873
* @Class: IT114105/1C
* @2021-04-24
*/
public class BubbleSort {
    final static String className = "BubbleSort";
    final static String classDATE = "24-04-2021";
    
    public static void main(String [ ] args) {
        printHeader();
        
        int [ ] arr = {21, 13, 8, 42, 19, 5, 34, 61};
        bubbleSort(arr);
        
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        
        printFooter();
        }
        
    public static void bubbleSort(int [] array) {
        for (int pass=0; pass < array.length-1; pass++) 
            for (int i=0; i < array.length-pass-1; i++) 
                if (array [ i ] > array [ i+1 ])
                    swap(array, i, i+1);
    }
    
    public static void swap (int [ ] array, int first, int second) {
        int temp = array [ first ];
        array [ first ] = array [ second ];
        array [ second ] = temp;
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