package test.com.oopsw.simple;

import com.oopsw.simple.Employee;
import com.oopsw.simple.Manager;
import com.oopsw.simple.Worker;

public class WorkerTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("333", "호랭이");
        System.out.println(e1.getWorkerNumber()+""+e1.getName());
        Employee e2 = new Employee("666", "멍멍이");
        System.out.println(e2.getWorkerNumber()+""+e2.getName());

        Manager m1 = new Manager("사장", "123", "야옹이");
        System.out.println(m1.getPosition()+""+m1.getWorkerNumber()+""+m1.getName());
        Manager m2 = new Manager("부장", "456", "앵무새");
        System.out.println(m2.getPosition()+""+m2.getWorkerNumber()+""+m2.getName());

    }
}
