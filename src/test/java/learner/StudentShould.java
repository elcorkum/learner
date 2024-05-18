package learner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentShould {
    private Student student;
    private double totalStudyTime;

    @BeforeEach
    public void setUp(){
        student = new Student(34567, "Aslan");
        totalStudyTime = 0.0;
    }

    @Test
    @DisplayName("ensureThatStudentIsInstanceOfLearner")
    public void testImplementation(){
        assertInstanceOf(Learner.class, student);
    }

    @Test
    @DisplayName("ensureThatStudentIsInstanceOfPerson")
    public void testInheritance(){
        assertInstanceOf(Person.class, student);
    }

    @Test
    @DisplayName("ensureToTalStudyTimeIsCorrectlyComputed")
    public void testLearn(){
        double numberOfHours = 20.5;
        student.learn(numberOfHours);
        double expected = totalStudyTime + numberOfHours;
        double actual = student.getTotalStudyRime();
        assertEquals(expected, actual);
    }

}