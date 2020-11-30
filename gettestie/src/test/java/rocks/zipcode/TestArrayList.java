package rocks.zipcode;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestArrayList {
    @Test
    public void testArrayListAdd(){
        Person david = new Person("David",1990);
        Person stacey = new Person("Stacey",1993);
        Person justin = new Person("Justin",1992);

        Person[] davidNStacey = {david,stacey};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(davidNStacey));
        actual.add(justin);
        Person[] all = {david,stacey,justin};
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));
        assertEquals(expected,actual);
    }
    @Test
    public void testArrayListRemove(){
        Person david = new Person("David",1990);
        Person stacey = new Person("Stacey",1993);
        Person justin = new Person("Justin",1992);

        Person[] all = {david,stacey,justin};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(all));
        actual.remove(justin);
        Person[] davidNStacey = {david,stacey};
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(davidNStacey));
        assertEquals(expected,actual);
    }
    @Test
    public void testArrayListIndexof(){
        Person david = new Person("David", 1990);
        Person stacey = new Person("Stacey", 1993);
        Person justin = new Person("Justin",1992);

        Person[] all = {david,stacey,justin};
        ArrayList<Person> up = new ArrayList<>(Arrays.asList(all));
        int actual = up.indexOf(justin);
        int expected = 2;
        assertEquals(expected,actual);

    }
    @Test
    public void testArrayListToArray(){
        Person david = new Person("David", 1990);
        Person stacey = new Person("Stacey", 1993);
        Person justin = new Person("justin", 1992);

        Person[] expected = {david,stacey,justin};
        ArrayList<Person> up = new ArrayList<>(Arrays.asList(expected));

        Person[] actual = new Person[up.size()];

        actual = up.toArray(actual);

        assertEquals(expected,actual);
    }
}


