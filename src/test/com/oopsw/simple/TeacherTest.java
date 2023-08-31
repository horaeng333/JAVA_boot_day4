package test.com.oopsw.simple;

import com.oopsw.simple.Teacher;

public class TeacherTest {
    public static void main(String [] args) {
        Teacher t1 = new Teacher("2171256", "이정아", 'F');
        System.out.println(t1.getTeacherNumber()+ " " + t1.getName() + " " + t1.getGender());
    }

}
