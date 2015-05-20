package student;

/**
 * Created by SteveGreen on 20/05/15.
 */
public interface Registrar {
    boolean checkStudentStatus(Integer studentid);
    Student registerStudent(String name, Integer credits);
}
