
package rocks.zipcode;

import org.junit.Test;

import java.util.NavigableSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TestTreeSet {
    @Test
    public void testTreeSetContains(){
        TreeSet tset = new TreeSet();
        tset.add("A");
        tset.add("B");
        tset.add("C");
        tset.add("C");

        boolean expected = true;
        boolean actual = tset.contains("C");
        assertEquals(expected,actual);

    }
    @Test
    public void testTreeSetHigher(){
        TreeSet tset = new TreeSet();
        tset.add(10);
        tset.add(20);
        tset.add(30);

        Integer expected = 20;
        Integer actual = (Integer) tset.higher(18);
        assertEquals(expected,actual);

    }
    @Test
    public void testTreeSetReverseOrder(){
        TreeSet tset = new TreeSet();
        tset.add(10);
        tset.add(20);
        tset.add(30);

        TreeSet tset2 = new TreeSet();
        tset2.add(30);
        tset2.add(20);
        tset2.add(10);
        NavigableSet expected = tset2;
        NavigableSet actual =  tset.descendingSet();
        assertEquals(expected,actual);

    }
}
