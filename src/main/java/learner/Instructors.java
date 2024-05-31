package learner;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor>{
    private List<Person> zipCodeInstructors;

    private Instructors(){
        zipCodeInstructors = new ArrayList<>();
//        List.of(new Instructor(19L, "Mikaila"),
//                new Instructor(20L, "Other teacher"))
    }

    @Override
    public Instructor[] toArray() {
        return zipCodeInstructors.toArray(new Instructor[0]);
    }

    private static class InstructorsHolder {
        static final Instructors INSTANCE = new Instructors();
    }
    public static Instructors getInstance(){
        return InstructorsHolder.INSTANCE;
    }

    public List<Person> getInstructors(){
        return zipCodeInstructors;
    }


}
