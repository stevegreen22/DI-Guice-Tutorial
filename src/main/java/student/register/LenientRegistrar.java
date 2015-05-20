package student.register;

import student.Student;
import student.StudentStore;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by SteveGreen on 20/05/15.
 */

@Singleton
public class LenientRegistrar {

    private final StudentStore studentStore;

    @Inject
    public LenientRegistrar(StudentStore studentStore){
        this.studentStore = studentStore;
    }

    public boolean checkStudentStatus(Integer studentId){
        boolean status = false;

        Student student = studentStore.load(studentId);
        if (student != null && student.getCredits() != null){
            status = student.getCredits() >= 10.0;
        }
        return status;
    }

    public Student registerStudent(String name, Integer credits){
        Student s =  new Student();
        s.setName(name);
        s.setCredits(credits);
        return studentStore.save(s);
    }
}
