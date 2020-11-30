package rocks.zipcode;

import org.junit.Test;
import org.junit.runner.notification.RunListener;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestHashMap {
    @Test
    public void testHashMapGet(){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0,"I");
        hm.put(1,"am");
        hm.put(2,"truth");
        String expected = "truth";
        String actual = hm.get(2);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashMapContainsKey(){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0,"I");
        hm.put(1,"am");
        hm.put(2,"truth");
        boolean expected = false;
        boolean actual = hm.containsKey(3);
        assertEquals(expected,actual);
    }
    @Test
    public void testHashMapReplace(){
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(0,"I");
        hm.put(1,"am");
        hm.put(2,"truth");
        String expected = "truth";
        hm.replace(2,"truth");
        String actual = hm.get(2);
        assertEquals(expected,actual);
    }
}
