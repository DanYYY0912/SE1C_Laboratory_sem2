/********************************************************************************************************/
/**
 * Class PersonComparator - Linked Lists
 *
 * @YUEN Yiu Yeung 
 * @2021-03-07
 */
public class PersonComparator implements Comparator {
    public boolean isEqualTo(Object item1, Object item2){
        return (((Person)item1).getAge() == ((Person)item2).getAge());
    }
	
    public boolean isLessThan(Object item1, Object item2){
        return (((Person)item1).getAge() < ((Person)item2).getAge());
    }
	
    public boolean isLessThanOrEqualTo(Object item1, Object item2){
        return (((Person)item1).getAge() <= ((Person)item2).getAge());
    }
	
    public boolean isGreaterThan(Object item1, Object item2){
	return (((Person)item1).getAge() > ((Person)item2).getAge());
    }
	
    public boolean isGreaterThanOrEqualTo(Object item1, Object item2){
        return (((Person)item1).getAge() >= ((Person)item2).getAge());
    }
}

/********************************************************************************************************/
