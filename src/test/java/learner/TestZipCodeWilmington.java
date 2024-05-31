package learner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestZipCodeWilmington {

    @Test
    @DisplayName("To check hostLecture leads to proper increment of student total study time")
    public void testHostLecture(){
        Educator educator1 = Educator.MIKAILA;
        Educator educator2 = Educator.OTHERPERSON;
        ZipCodeWilmington instance = ZipCodeWilmington.getInstance();
        List<Person> zipCodeInstructors = instance.getInstructors().getInstructors();
        ArrayList<Student> zipCodeStudents = instance.getStudents().getStudents();
        Instructor instructor = (Instructor) zipCodeInstructors.get(0);
        double expectedForEachStudent = (36.0 / zipCodeStudents.size()) + zipCodeStudents.get(0).getTotalStudyTime();
        instance.hostLecture(instructor, 36.0);

        assertEquals(expectedForEachStudent, zipCodeStudents.get(0).getTotalStudyTime());

    }

    @Test
    @DisplayName("ensureEducatorCanHostLecture")
    public void testHostLectureWithEducator(){
        ZipCodeWilmington instance2 = ZipCodeWilmington.getInstance();
        ArrayList<Student> zipCodeStudents = instance2.getStudents().getStudents();
        Educator educator = Educator.MIKAILA;
        double numberOfHours = 18.0;
        double timeWorked = educator.getTimeWorked() + numberOfHours;

        instance2.hostLecture(educator, numberOfHours);
        double expectedForEachStudent = 18.0 / zipCodeStudents.size();
        assertEquals(timeWorked, educator.getTimeWorked());
        assertEquals(expectedForEachStudent, zipCodeStudents.get(0).getTotalStudyTime());
    }

}