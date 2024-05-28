package learner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestPeople {
    private People<Student> students;
    private People<Instructor> instructors;

    @BeforeEach
    public void setUp(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();

    }

    @Test
    public void testAdd(){
        Student student1 = new Student(12001L, "Amina");
        Student student2 = new Student(12002L, "Amari");
        students.add(student1);
        students.add(student2);
        List<Person> expected = new ArrayList<>(List.of(student1, student2));
        assertEquals(expected, students.getPersonList());
    }

    @Test
    public void testRemove(){
        Student student1 = new Student(12001L, "Amina");
        Student student2 = new Student(12002L, "Amari");
        students.add(student1);
        students.add(student2);
        students.remove(student1);
        assertFalse(students.getPersonList().contains(student1));
    }
    @Test
    public void testFindById(){
        Instructor instructor1 = new Instructor(12001L, "Amina");
        Instructor instructor2 = new Instructor(12002L, "Amari");
        instructors.add(instructor1);
        instructors.add(instructor2);
        assertEquals(instructor1, instructors.findById(12001L));
    }

}