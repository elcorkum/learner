package learner;

import java.util.ArrayList;
import java.util.List;

public class Students extends People<Student>{

    private ArrayList<Student> c15Students;
    private static class LazyHolder{
        static final Students INSTANCE = new Students();
    }
    private Students(){
        c15Students = new ArrayList<>(List.of(new Student(1L, "Ab"),
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
    }

    @Override
    public Student[] toArray() {
        return c15Students.toArray(new Student[0]);
    }

    public static Students getInstance(){
        return LazyHolder.INSTANCE;
    }

    public ArrayList<Student> getStudents(){
        return c15Students;
    }

}
