package student.store;

/**
 * Created by SteveGreen on 20/05/15.
 */
import student.Student;
import student.StudentStore;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.inject.Singleton;

@Singleton
public class DummyStudentStore implements StudentStore{

    private final Map<Integer, Student> studentMap;

    public DummyStudentStore(){
        studentMap = new HashMap<Integer, Student>();
    }


    @Override
    public boolean exists(Integer id) {
        return studentMap.containsKey(id);
    }

    @Override
    public Student load(Integer id) {
         return studentMap.get(id);
    }

    @Override
    public Student save(Student p) {
        if (p.getId() == null){
            p.setId(studentMap.size() + 1);
        }
        studentMap.put(p.getId(), p);
        return p;
    }
}
