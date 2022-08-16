/********************************************************************************************************/
/**
 * Class Person - Linked Lists
 *
 * @YUEN Yiu Yeung 
 * @2021-03-07
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "(" + name + ", " + age + ")";
    }
}

/********************************************************************************************************/
