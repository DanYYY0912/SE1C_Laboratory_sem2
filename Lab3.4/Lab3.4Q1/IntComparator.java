/********************************************************************************************************/
/**
 * Class IntBstNode - Trees
 *
 * @YUEN Yiu Yeung 
 * @2021-03-30
 */
public class IntComparator implements Comparator {
    public boolean isEqualTo (Object item1, Object item2){
        return (int) item1 == (int) item2;
    }
    public boolean isLessThan (Object item1, Object item2){
        return (int) item1 < (int) item2;
    }
    public boolean isLessThanOrEqualTo (Object item1, Object item2){
        return (int) item1 <= (int) item2;
    }

    public boolean isGreaterThan (Object item1, Object item2){
        return (int) item1 > (int) item2;
    }

    public  boolean isGreaterThanOrEqualTo (Object item1, Object item2){
        return (int) item1 >= (int) item2; 
    }
}

/********************************************************************************************************/