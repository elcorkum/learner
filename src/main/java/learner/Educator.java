package learner;

import java.util.List;

public enum Educator implements Teacher{
    MIKAILA(1L, "Mikaila"), OTHERPERSON(2L, "Other Instructor");

    private final Instructor instructor;
    private double timeWorked;
    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
        Instructors.getInstance().getInstructors().add(this.instructor);
    }
    public double getTimeWorked(){
        return this.timeWorked;
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }
}
