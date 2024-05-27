package learner;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People{
    private ArrayList<Instructor> zipCodeInstructors;

    private Instructors(){
        zipCodeInstructors = new ArrayList<>(List.of(new Instructor(19L, "Mikaila"),
                                                        new Instructor(20L, "Other teacher")));
    }
    private static class InstructorsHolder {
        static final Instructors INSTANCE = new Instructors();
    }
    public static Instructors getInstance(){
        return InstructorsHolder.INSTANCE;
    }

    public ArrayList<Instructor> getInstructors(){
        return zipCodeInstructors;
    }
}
