import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Student {

    public int id;

    public String name;

    public String rollNo;

    public int age;

    public Student(int id, String name, String rollNo, int age) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String args[]){

        String names[]={"Yusvanth","Yoga","Gokul","Vimal","Vasanth","Hariesh"};
        String roll[]={"20CSR243","20CSR241","20CSR060","20CSR236","20CSR229","20CSR206"};
        int id[]= IntStream.range(1,7).toArray();
        int age[] = IntStream.range(1,7).map(i->20).toArray();

        Student students[] = new Student[6];

        for(int i=0;i<6;i++){
            students[i] = new Student(id[i],names[i],roll[i],age[i]);
        }

        Arrays.stream(students).forEach(student->System.out.print("Student Details : \nName : "+student.getName()
        +"\nRoll Number : "+student.getRollNo()+"\nId : "+student.getId()+"\nAge : "+student.getAge()+"\n\n"));


    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", age=" + age +
                '}';
    }
}
