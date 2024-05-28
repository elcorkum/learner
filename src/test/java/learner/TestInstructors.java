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
        ArrayList<Instructor> instructors = new ArrayList<>(List.of(new Instructor(19L, "Mikaila"),
                                                                    new Instructor(20L, "Other teacher")));
        Instructors instance = Instructors.getInstance();
        List<Person> zipCodeInstructors = instance.getInstructors();

        assertEquals(instructors.size(), zipCodeInstructors.size());
    }

}