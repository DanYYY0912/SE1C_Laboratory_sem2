package Q6;

/********************************************************************************************************/
/**
* class QuickVsBubble - Sorting
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
public class QuickVsBubble{
    final static String className = "QuickVsBubble";
    final static String classDATE = "24-04-2021";
    
    public static void main(String[] args){  
        printHeader();
        
        if(args.length<1){
            System.out.println("Too Few Arguments!");
            printFooter();
            return;
        }
        int n = Integer.parseInt(args[0]);
        
        int[] arrayQS=new int[n];
        int[] arrayBS=new int[n];
        
        for(int i=0;i<n;i++){
            int x = (int)(Math.random()*1000);
            arrayQS[i]=x;
            arrayBS[i]=x;
        }
        
        long startTime,endTime;
        
        startTime=System.nanoTime();
        quickSort(arrayQS,0,arrayQS.length-1);
        endTime=System.nanoTime();
        System.out.println("Quick Sort= "+(endTime-startTime));
                
        startTime=System.nanoTime();
        bubbleSort(arrayBS);
        endTime=System.nanoTime();
        System.out.println("Bubble Sort= "+(endTime-startTime));
        printFooter();
    }

    public static void quickSort(int[] arrayQS, int i, int i0) {
        if (i < i0) 
        { 
            int pi = partition(arrayQS, i, i0); 
            quickSort(arrayQS, i, pi-1); 
            quickSort(arrayQS, pi+1, i0); 
        } 
    }

    public static void bubbleSort(int[] arrayBS) {
        for(int i=0;i<arrayBS.length;i++){
            for(int j=0;j<arrayBS.length-i-1;j++){
                 if (arrayBS[j] > arrayBS[j+1]) 
                { 
                    int temp = arrayBS[j]; 
                    arrayBS[j] = arrayBS[j+1]; 
                    arrayBS[j+1] = temp; 
                } 
            }
        }
    }
    
    public static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
    
    private static void printHeader() {
        System.out.println('\u000C');
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*************///////////////////"
                           + "/////");
        System.out.println("************************"+className+"************************");
        System.out.println("=============================================================");
        System.out.println("Program created by YUEN Yiu Yeung, "+ classDATE +"\n");
    }
    
    private static void printFooter() {
        System.out.println("\n=============================================================");
        System.out.println("Thank you for using this <"+className+">.");
        System.out.println("The Program has terminated normally.");
        System.out.println("////////////////////////*************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                           + "\\\\\\");
    }
}

/********************************************************************************************************/