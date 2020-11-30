package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
public class TestArrayDeque {

    @Test
    public void testArrayDequeAdd(){
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add("the");
        deque.add("new");
        deque.add("day");
        ArrayDeque<String> expected = new ArrayDeque<String>(Arrays.asList("the", "new","day"));

        Assert.assertTrue(expected.size() == deque.size() &&
            expected.containsAll(deque) && deque.containsAll(expected));

    }

    @Test
    public void testArrayDequeRemoveFirst(){
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add("the");
        deque.add("new");
        deque.add("day");
        deque.removeFirstOccurrence("new");
        ArrayDeque<String> expected = new ArrayDeque<String>(Arrays.asList("the", "day"));

        Assert.assertTrue(expected.size() == deque.size()
            && expected.containsAll(deque) && deque.containsAll(expected));
    }
    @Test
    public void testArrayDequeElement(){
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add ("its");
        deque.add("the");
        deque.add("new");
        deque.offer("man");
        ArrayDeque<String> expected = new ArrayDeque<String>(Arrays.asList("its", "the", "new", "man"));

        Assert.assertTrue(expected.size() == deque.size() &&
            expected.containsAll(deque) && deque.containsAll(expected));

    }
    @Test
    public void testArrayDequePop(){
        ArrayDeque<String> actual = new ArrayDeque<String>();
        actual.add("the");
        actual.add("new");
        actual.add("day");
        actual.pop();
        ArrayDeque<String> expected = new ArrayDeque<String>(Arrays.asList("the","new"));

        Assert.assertTrue(expected.size() == actual.size()
            && expected.containsAll(actual) && actual.containsAll(expected));

    }

}
