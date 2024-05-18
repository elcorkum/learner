package learner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorShould {
    private Instructor instructor;

    @BeforeEach
    public void setUp(){
        instructor = new Instructor(13456L, "Guru");
    }

    @Test
    @DisplayName("ensureInstructorIsInstanceOfTeacher")
    public void testImplementation(){
        assertInstanceOf(Teacher.class, instructor);
    }

    @Test
    @DisplayName("ensureInstructorIsInstanceOfPerson")
    public void testInheritance(){
        assertInstanceOf(Person.class, instructor);
    }

    @Test
    @DisplayName("ensureInstructorTeachesProperly")
    public void testTeach(){
        //given
        Student student1 = new Student(78695L, "Bariki");
        double numberOfHours = 15.5;
        double totalStudyTime = 0.0;
        //when
        instructor.teach(student1, numberOfHours);
        double expected = totalStudyTime + numberOfHours;
        double actual = student1.getTotalStudyRime();
        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ensureInstructorLecturesProperly")
    public void testLecture(){
        //given
        Student student2 = new Student(78696L, "Mlawa");
        Student student3 = new Student(78697L, "Jowi");
        Student[] students = {student2, student3};
        double numberOfHours = 20.8;
        double totalStudyTime = 0.0;
        //when
        instructor.lecture(students, numberOfHours);
        double expected = totalStudyTime + numberOfHours/students.length;
        //then
        assertEquals(expected, student2.getTotalStudyRime());
        assertEquals(expected, student2.getTotalStudyRime());

    }



}