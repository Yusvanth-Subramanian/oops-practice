public class Encapsulation {

    // It is a process of binding data into a single unit.
    // Class is an example of encapsulation . It wraps all the data members and functions into one unit.

    private int studentAge;

    private String studentName;

    private String studentRollNo;

    private double studentCGPA;

    public Encapsulation() {
    }

    public Encapsulation(int studentAge, String studentName, String studentRollNo, double studentCGPA) {
        this.studentAge = studentAge;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(String studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }
}
