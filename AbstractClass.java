/**
 *
 * @author 96simjoh6
 * Last update: 2015-03-18
 */

public abstract class AbstractClass extends GUI implements Comparable<AbstractClass>{
    
    public abstract String getGrade(); //Gets the grade from "list"-line which is sent to the class.
                                       //Then with compareTo, sorts the String from grade
    
    @Override
    public abstract String toString();
}
