package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPriorityQueue {
    @Test
    public void testPriorityQueuePeek(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Y");
        pq.add("O");
        pq.add("!");

        String expected ="!";
        String actual = pq.peek();

        assertEquals(expected,actual);

    }
    @Test
    public void TestPrioirtyQueueOffer(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Y");
        pq.add("O");
        pq.offer("?");

        String expected = "?";
        String actual = pq.peek();

        assertEquals(expected,actual);
    }

    @Test
    public void testPriorityQueueToArray(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Y");
        pq.add("O");
        pq.offer("?");
        Object [] expected = {"Y","O","?"};
        Object [] actual = pq.toArray();

        assertTrue(expected.length == actual.length);
    }
}

