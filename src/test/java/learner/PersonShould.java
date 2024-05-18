package learner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonShould {
    private final long ID = 56478;
    private String name;

    @BeforeEach
    public void setUp(){
        name = "Peter Pan";
    }

    @Test
    @DisplayName("constructorShouldSetNameAndIdParametersCorrectly")
    public void testConstructor(){
        Person p = new Person(ID, name);
        assertEquals(56478, p.getId());
        assertEquals(name, p.getName());
    }

    @Test
    @DisplayName("setNameCorrectly")
    public void testSetName(){
        Person person = new Person(ID, name);
        String newName = "Bowzer";
        person.setName(newName);
        assertEquals("Bowzer", person.getName());
    }

}