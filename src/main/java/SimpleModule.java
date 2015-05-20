import com.google.inject.AbstractModule;
import student.Registrar;
import student.StudentStore;
import student.register.LenientRegistrar;
import student.store.DummyStudentStore;

/**
 * Created by SteveGreen on 20/05/15.
 */
public class SimpleModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(StudentStore.class).to(DummyStudentStore.class);
        bind(Registrar.class).to(LenientRegistrar.class);
    }
}
