import dao.StudentDAO;
import hibernate.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.print("Hello World moodle");
        List<Student> rs = StudentDAO.getAllStudent();
        for (Student item:rs) {
            System.out.println(item.toString());

        }
    }
}
