package v1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        List<Student> selStudents = new ArrayList<Student>();

        students.add(new Student("Rajith", 12, "male"));
        students.add(new Student("Manel", 23, "female"));
        students.add(new Student("Kelum", 34, "male"));

        for (Student student : students) {
            if(student.getAge()>18){
                selStudents.add(student);
            }
        }

        selStudents.stream().iterator().forEachRemaining(ac -> System.out.println(ac.getName()));
    }
}
