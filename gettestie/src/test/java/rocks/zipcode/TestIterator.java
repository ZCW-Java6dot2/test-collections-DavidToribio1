package rocks.zipcode;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class TestIterator {
    @Test
    public void testIterator(){
        ArrayList<Integer> first = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            first.add(i);
        }
        Iterator kobe = first.iterator();
        while (kobe.hasNext()){
            int i = (Integer) kobe.next();
            if (i % 2 != 0)
                kobe.remove();

        }
        Integer [] expected = {0,2,4,6,8};
        Integer [] actual = first.toArray(new Integer[first.size()]);

        assertEquals(expected,actual);
    }

}
