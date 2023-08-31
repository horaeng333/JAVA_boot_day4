package test.com.oopsw.simple;

import com.oopsw.simple.Student;
import com.oopsw.simple.Teacher;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("2171256", "이정아", 'F');
        System.out.println(s1.getStudentNumber()+" "+s1.getName()+" "+s1.getGender());
        Teacher t1 = new Teacher("t001", "이순신", 'M');
        System.out.println(t1.getTeacherNumber()+" "+t1.getName()+" "+t1.getGender());
    }
}
