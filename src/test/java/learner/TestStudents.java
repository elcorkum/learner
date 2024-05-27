package learner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestStudents {
    @Test
    @DisplayName("To ensure all students in my cohort are in Students singleton class")
    void testStudentsSingleton(){
        ArrayList<Student> students = new ArrayList<>(List.of(new Student(1L, "Ab"),
                new Student(2L, "Ashya"),
                new Student(3L, "Alvaro"),
                new Student(4L, "Alex"),
                new Student(5L, "Cesar"),
                new Student(6L, "Elizabeth"),
                new Student(7L, "Eyuel"),
                new Student(8L, "Nadin"),
                new Student(9L, "Jacob"),
                new Student(10L, "Alex"),
                new Student(11L, "Juan"),
                new Student(12L, "Kalil"),
                new Student(13L, "Isaiah"),
                new Student(14L, "Rashawn"),
                new Student(15L, "Ryan"),
                new Student(16L, "Rene"),
                new Student(17L, "Gwyn"),
                new Student(18L, "Nick")));

        Students instance = Students.getInstance();
        ArrayList<Student> c15Students = instance.getStudents();
        assertEquals(students.size(), c15Students.size());
    }

}