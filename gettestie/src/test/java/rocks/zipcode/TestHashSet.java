package rocks.zipcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TestHashSet {
    @Test
    public void testHashSetAdd() {
        HashSet<Person> actual = new HashSet<Person>();
        Person david = new Person("David", 1990);
        Person stacey = new Person("Stacey", 1993);

        actual.add(david);
        actual.add(stacey);

        Person[] davidNStacey = {david, stacey};

        HashSet<Person> expected = new HashSet<Person>(Arrays.asList(davidNStacey));

        assertEquals(expected, actual);

    }

    @Test
    public void testHashSetRemove() {
        HashSet<Person> actual = new HashSet<Person>();
        Person david = new Person("David", 1990);
        Person stacey = new Person("Stacey", 1993);

        actual.add(david);
        actual.add(stacey);
        actual.remove(stacey);

        Person[] extra = {david};
        HashSet<Person> expected = new HashSet<Person>(Arrays.asList(extra));
        assertEquals(expected, actual);
    }

    @Test
    public void testHashSetIsEmpty() {
        HashSet<Person> actual = new HashSet<Person>();
        Person david = new Person("david", 1990);
        Person stacey = new Person("stacey", 1993);

        actual.add(david);
        actual.add(stacey);

        assertEquals(false, actual.isEmpty());

    }

    @Test
    public void testHashSetClear() {
        HashSet<Person> actual = new HashSet<Person>();
        Person david = new Person("david", 1990);
        Person stacey = new Person("stacey", 1993);

        actual.add(david);
        actual.add(stacey);
        actual.clear();

        HashSet<Person> expected = new HashSet<Person>();
        assertEquals(expected, actual);
    }

    @Test
    public void testHashSetSize() {
        HashSet<Person> actual = new HashSet<Person>();
        Person david = new Person("david", 1990);
        Person stacey = new Person("stacey", 1993);

        actual.add(david);
        actual.add(stacey);

        int expected = 2;
        int actualSize = actual.size();

        assertEquals(expected, actualSize);
    }
    @Test
    public void testHashSetEqualsT(){
        HashSet<Person> first = new HashSet<Person>();
        Person david = new Person("David", 1990);
        Person stacey = new Person("Stacey", 1993);

        first.add(david);
        first.add(stacey);
        Person[] davidNStacey ={david,stacey};

        HashSet<Person> second = new HashSet<Person>(Arrays.asList(davidNStacey));
        boolean expected = true;
        boolean actual = first.equals(second);

        assertEquals(expected,actual);
    }
    @Test
    public void testHashSetEqualsF() {
        HashSet<Person> first = new HashSet<Person>();
        Person david = new Person("David", 1990);
        Person stacey = new Person("Stacey", 1993);

        first.add(david);
        first.add(stacey);

        Person[] davidNStacey = {stacey};

        HashSet<Person> second = new HashSet<Person>(Arrays.asList(davidNStacey));
        boolean expected = false;
        boolean actual = first.equals(stacey);

        assertEquals(expected,actual);
    }
}
