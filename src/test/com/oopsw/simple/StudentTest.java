package test.com.oopsw.simple;

import com.oopsw.simple.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentNumber("2171256");
        s1.setName("이정아");
        s1.setGender('F');

        Student s2 = new Student();
        s2.setStudentNumber("2171233");
        s2.setName("홍길동");
        s2.setGender('M');

        System.out.println(s1.getStudentNumber()+ " "
                + s1.getName() + " " + s1.getGender());

        System.out.println(s2.getStudentNumber()+ " "
                + s2.getName() + " " + s2.getGender());
    }
}
