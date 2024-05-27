package learner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestZipCodeWilmington {

    @Test
    @DisplayName("To check hostLecture leads to proper increment of student total study time")
    public void testHostLecture(){
        ZipCodeWilmington instance = ZipCodeWilmington.getInstance();
        ArrayList<Instructor> zipCodeInstructors = instance.getInstructors().getInstructors();
        ArrayList<Student> zipCodeStudents = instance.getStudents().getStudents();
        Instructor instructor = zipCodeInstructors.get(0);
        instance.hostLecture(instructor, 36.0);

        double expectedForEachStudent = 36.0 / zipCodeStudents.size();

        assertEquals(expectedForEachStudent, zipCodeStudents.get(0).getTotalStudyTime());

    }

}