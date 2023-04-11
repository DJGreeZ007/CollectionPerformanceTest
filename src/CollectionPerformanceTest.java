import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Comparison class of two lists <b>ArrayList</b> and <b>LinkedList</b>.
 * @version 1.0
 */
public class CollectionPerformanceTest {
    /** number of tests */
    private static final int NUM_ITERATIONS = 1000;


    /**
     * Tests the add() method for both ArrayList and LinkedList
     */
    static void testAdd() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start, end;

        // ArrayList add() method
        start = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList.add(): " + NUM_ITERATIONS + " iterations took " + (end - start) + " ns");

        // LinkedList add() method
        start = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList.add(): " + NUM_ITERATIONS + " iterations took " + (end - start) + " ns");
    }

    /**
     * Tests the remove() method for both ArrayList and LinkedList
     */
    static void testRemove() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // populate lists
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start, end;

        // ArrayList remove() method
        start = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            arrayList.remove(0);
        }
        end = System.nanoTime();
        System.out.println("ArrayList.remove(): " + NUM_ITERATIONS + " iterations took " + (end - start) + " ns");

        // LinkedList remove() method
        start = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            linkedList.remove(0);
        }
        end = System.nanoTime();
        System.out.println("LinkedList.remove(): " + NUM_ITERATIONS + " iterations took " + (end - start) + " ns");
    }

    /**
     * Tests the get() method for both ArrayList and LinkedList
     */
    static void testGet() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // populate lists
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start, end;

        // ArrayList get() method
        start = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList.get(): " + NUM_ITERATIONS + " iterations took " + (end - start) + " ns");

        // LinkedList get() method
        start = System.nanoTime();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList.get() " + NUM_ITERATIONS + " iterations took " + (end - start) + " ns");
    }
}