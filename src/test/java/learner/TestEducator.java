package learner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestEducator {
    private Educator educator;
    private Student student1;
    private Student student2;
    @BeforeEach
    public void setUp(){
        educator = Educator.MIKAILA;
        student1 = new Student(100L, "June Bug");
        student2 = new Student(101L, "Sponge Bob");
    }
    @Test
    @DisplayName("ensureEducatorIsInstanceOfTeacher")
    public void testImplementation(){
        assertInstanceOf(Teacher.class, educator);
    }

    @Test
    @DisplayName("ensureEducatorTimeWorkedIsIncremented")
    public void testTeach(){
        double numberOfHours = 20.0;
        double totalTimeWorked = educator.getTimeWorked() + numberOfHours;
        educator.teach(student1, numberOfHours);
        assertEquals(totalTimeWorked, educator.getTimeWorked());

    }

    @Test
    @DisplayName("ensureEducatorTimeWorkedIsIncrementedProperlyAfterLecturing")
    public void testLecture(){
        Learner[] learners = {student1, student2};
        double numberOfHours = 25.0;
        double totalTimeWorked = educator.getTimeWorked() + numberOfHours;
        educator.lecture(learners, numberOfHours);
        assertEquals(totalTimeWorked, educator.getTimeWorked());
    }

}