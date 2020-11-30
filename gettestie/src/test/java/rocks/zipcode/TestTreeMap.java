package rocks.zipcode;

import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TestTreeMap {
    @Test
    public void testTreeMapPut(){
        TreeMap tree = new TreeMap();
        tree.put(1,"carrots");
        tree.put(2,"celery");
        tree.put(3,"onion");
        String expected = "carrots";
        String actual = (String) tree.get(1);

        assertEquals(expected,actual);

    }
    @Test
    public void testTreeMapFirstKey(){
        TreeMap tree = new TreeMap();
        tree.put(1,"carrots");
        tree.put(2,"celery");
        tree.put(3,"onion");

        Integer expected = 1;
        Integer actual = (Integer) tree.firstKey();

        assertEquals(expected,actual);
    }
    @Test
    public void testTreeMapSize(){
        TreeMap tree = new TreeMap();
        tree.put(1,"carrots");
        tree.put(2,"celery");
        tree.put(3,"onion");

        Integer expected = 3;
        Integer actual = tree.size();

        assertEquals(expected,actual);
    }
}
