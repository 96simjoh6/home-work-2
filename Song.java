/**
 *
 * @author 96simjoh6
 * Last update: 2015-03-18
 */

public class Song extends AbstractClass{
    protected String name, author, type;
    protected int grade;
    
    public Song( String name, String author, int grade){ //Used with readFile(); newLine(); saveLine(); from Libary.java
        this.name = name;                                //Takes the output from function and saves it away in a String
        this.author = author;                            //Then with the toString and compareTo returns the String sorted from grade.
        this.grade = grade;                              //And with the right order which is "Song: name author grade";
        type = "Song";
    }
    
    @Override
    public String getGrade(){
        return Integer.toString(grade);
    }
    
    @Override
    public String toString(){
        return type + ":" + "," + name + "," + author + "," + Integer.toString(grade) + ",";
    }
    
    @Override
    public int compareTo(AbstractClass compare) {
        return (Integer.toString(grade)).compareToIgnoreCase(compare.getGrade());
    }
}
