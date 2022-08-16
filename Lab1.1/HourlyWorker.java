
/**
 * Class HourlyWorker - Object-oriented Programming (Polymorphism)
 *
 * @YUEN Yiu Yeung 
 * @2021-01-30
 */
public class HourlyWorker extends Worker {
    private double wage;
    private double hours;

    public HourlyWorker(String name, double w, double h) {
        super(name);
        setWage(w);
        setHours(h);
    }
    public void setWage(double w) {
        wage = w;
    }
    public void setHours(double h) {
        hours = h;
    }
    public double earnings() {
        salary = wage*hours;
        return salary;
    }
    public String toString() {
        return super.toString() + " earned $" + earnings() + " for " + hours + " hours";
    }
}

