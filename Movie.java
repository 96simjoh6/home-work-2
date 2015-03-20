/**
 *
 * @author 96simjoh6
 * Last update: 2015-03-18
 */

//Only commenting on Song.java, since both files are pretty identical.

public class Movie extends AbstractClass{
    protected String name, author, type;
    protected int grade;
    
    public Movie(String name, String author, int grade){
        this.name = name;
        this.author = author;
        this.grade = grade;
        type = "Movie";
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
        return (Integer.toString(grade)).compareTo(compare.getGrade());
    }
}
