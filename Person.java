import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.text.NumberFormat;
import java.io.*;

abstract class Person implements Comparable<Person> {
    private int dobYear, dobMonth, dobDay;

    public Person() {};
    
    public Person(int d, int m, int y)
    {
        this.dobYear =y;
        this.dobMonth=m;
        this.dobDay =d;
    }
    
    public void setDob(int d, int m, int y)
    {
        this.dobYear =y;
        this.dobMonth=m;
        this.dobDay =d;
    }
    

    public int getDobYear()
    {
        return this.dobYear;
    }
    public int getDobMonth()
    {
        return this.dobMonth;
    }
    public int getDobDay()
    {
        return this.dobDay;
    }

    abstract double getPay();
    abstract String getSector();    
    abstract String getContact();
    
    public String toString()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return "["+getDobDay()+"]"+getContact() +" to be paid "+ formatter.format(getPay()) +" in the "+getSector() +" sector";
    }
    
    public int compareTo(Person other)
    {

        return (this.getDobDay()>other.getDobDay()?1:(this.getDobDay()<other.getDobDay()?-1:0));    
    }
}