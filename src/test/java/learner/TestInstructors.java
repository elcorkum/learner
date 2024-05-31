package learner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestInstructors {

    @Test
    @DisplayName("To ensure instructors instance contains list of instructores")
    void testInstructorsSingleton(){
        Educator educator1 = Educator.MIKAILA;
        Educator educator2 = Educator.OTHERPERSON;
        Instructors instance = Instructors.getInstance();
        List<Person> zipCodeInstructors = instance.getInstructors();
        assertEquals(2, zipCodeInstructors.size());
    }
}