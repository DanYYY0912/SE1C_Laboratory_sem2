package Q5;

/********************************************************************************************************/
/**
* class inPlaceQuickSort - Sorting
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
public class inPlaceQuickSort {
    final static String className = "inPlaceQuickSort";
    final static String classDATE = "24-04-2021";
    
    static int[] element = {27, 12, 34, 8, 16, 2, 45, 26, 48, 16, 23, 24};
    
    public static void main(String [ ] args) {
        printHeader();
        
        qsort(0, element.length - 1);
        for (int i : element)
            System.out.print(i + " ");
            
        printFooter();
    }

    private static void qsort(int left, int right) {
        if(left >= right)
            return;
         
        int pivot = element[left];
        int pivotIndex = left;
        int storeIndex = pivotIndex + 1;
        
        for (int i = pivotIndex + 1; i <= right; i++) {
            if (element[i] < pivot) {
                swap(i, storeIndex);
                storeIndex++;
            }
        }
        swap(pivotIndex, storeIndex -1);
        int tmp = storeIndex - 1;
        
        qsort(left, tmp - 1);
        qsort(tmp + 1, right);
    }

    private static void swap(int n1, int n2) {
        int tmp = element[n1];
        element[n1] = element[n2];
        element[n2] = tmp;
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
        System.out.println("\n================================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////****************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/