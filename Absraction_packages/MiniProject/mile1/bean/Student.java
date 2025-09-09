package abstraction_packages_exception_handling.miniproject.com.mile1.bean ;
public class Student {
    String name ; 
    int marks[] ; 
    String grade ;
 
    public Student() {

    }
    public Student( String grade , int[] marks , String name ) {
        this.grade = grade ;
        this.marks = marks ; 
        this.name = name; 
    }
 
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
 
    public String getName() {
        return name;
    }
    public int[] getMarks() {
        return marks;
    }
    public String getGrade() {
        return grade;
    }

    
}
