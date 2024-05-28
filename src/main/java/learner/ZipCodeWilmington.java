package learner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipCodeWilmington {
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    private static class ZipCodeWilmingtonHolder{
        static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    }

    public static ZipCodeWilmington getInstance(){
        return ZipCodeWilmingtonHolder.INSTANCE;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] studentsInClass =  students.getStudents().toArray(new Student[0]);
        teacher.lecture(studentsInClass, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        People<Instructor> people = Instructors.getInstance();
        Instructor instructor = people.findById(id);
        instructor.lecture(students.getStudents().toArray(new Student[0]), numberOfHours);

    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studentsStudyHours = new HashMap<>();
        for(Student s: students.getStudents()){
            studentsStudyHours.put(s, s.getTotalStudyTime());
        }
        return studentsStudyHours;
    }
}
