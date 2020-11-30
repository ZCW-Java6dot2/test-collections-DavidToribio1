package rocks.zipcode;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class TestVector {
    @Test
    public void testVectorAdd(){
        Vector vekey = new Vector();
        vekey.add(29);
        vekey.add(78);
        vekey.add(22);
        Integer expected = 78;
        Integer actual = (Integer) vekey.get(1);

        assertEquals(expected,actual);

    }
    @Test
    public void testVectorFirstElement(){
        Vector vekey = new Vector();
        vekey.add(29);
        vekey.add(78);
        vekey.add(22);
        Integer expected = 29;
        Integer actual = (Integer) vekey.firstElement();

        assertEquals(expected,actual);

    }
    @Test
    public void testVectorRemove(){
        Vector vekey = new Vector();
        vekey.add(29);
        vekey.add(78);
        vekey.add(22);
        vekey.remove(2);
        Integer expected = 78;
        Integer actual = (Integer) vekey.lastElement();

        assertEquals(expected,actual);

    }
}
