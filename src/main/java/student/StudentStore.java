package student;

/**
 * Created by SteveGreen on 20/05/15.
 */
public interface StudentStore {

    boolean exists(Integer id);
    Student load(Integer id);
    Student save(Student p);

}
