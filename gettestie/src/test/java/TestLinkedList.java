import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {

    @Test
    public void testLinkedListAdd(){
        LinkedList<String> actual = new LinkedList<>();
        actual.add("Its");
        actual.add("a");
        actual.add("new");
        actual.add("day");

        LinkedList<String> expected = new LinkedList<>(Arrays.asList("Its","a","new", "day"));
        assertEquals(expected,actual);
    }
    @Test
    public void testLinkedListUpdateValue(){
        LinkedList<String> actual = new LinkedList<>();
        actual.add("Its");
        actual.add("a");
        actual.add("new");
        actual.add("day");
        actual.set(2,"better");
        LinkedList<String> expected = new LinkedList<>(Arrays.asList("Its","a","better","day"));
        assertEquals(expected,actual);
    }

    @Test
    public void testLinkedListPollFirst(){
        LinkedList<String> two =new LinkedList<>(Arrays.asList("Its","a","better","day"));
        String expected = "Its";
        String actual = two.pollFirst();
        assertEquals(expected,actual);
    }
    @Test
    public void testLinkedListOfferFirst(){
        LinkedList<String> actual = new LinkedList<>(Arrays.asList("Its","a","better", "day"));
        actual.offerFirst("Me,");
        LinkedList<String> expected = new LinkedList<>(Arrays.asList("Me,","Its","a","better", "day"));
        assertEquals(expected,actual);
    }
}

