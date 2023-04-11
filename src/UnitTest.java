import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class UnitTest {
    private static final int NUM_ITERATIONS = 1000;

    @Test
    void testAdd() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method testAddMethod = CollectionPerformanceTest.class.getDeclaredMethod("testAdd");
        testAddMethod.setAccessible(true);
        testAddMethod.invoke(null);

        // Test passes if no exceptions are thrown
    }

    @Test
    void testRemove() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method testRemoveMethod = CollectionPerformanceTest.class.getDeclaredMethod("testRemove");
        testRemoveMethod.setAccessible(true);
        testRemoveMethod.invoke(null);

        // Test passes if no exceptions are thrown
    }

    @Test
    void testGet() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method testGetMethod = CollectionPerformanceTest.class.getDeclaredMethod("testGet");
        testGetMethod.setAccessible(true);
        testGetMethod.invoke(null);

        // Test passes if no exceptions are thrown
    }

}
