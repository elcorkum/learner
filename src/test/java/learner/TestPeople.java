package learner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestPeople {
    private People people;

    @BeforeEach
    public void setUp(){
        people = new People();

    }

    @Test
    public void testAdd(){
        Person person1 = new Person(12001L, "Amina");
        Person person2 = new Person(12002L, "Amari");
        people.add(person1);
        people.add(person2);
        List<Person> expected = new ArrayList<>(List.of(person1, person2));
        assertEquals(expected, people.getPersonList());
    }

    @Test
    public void testRemove(){
        Person person1 = new Person(12001L, "Amina");
        Person person2 = new Person(12002L, "Amari");
        people.add(person1);
        people.add(person2);
        people.remove(person1);
        List<Person> expected = new ArrayList<>(List.of( person2));
        assertEquals(expected, people.getPersonList());
    }
    @Test
    public void testFindById(){
        Person person1 = new Person(12001L, "Amina");
        Person person2 = new Person(12002L, "Amari");
        people.add(person1);
        people.add(person2);
        assertEquals(person1, people.findById(12001L));
    }

}