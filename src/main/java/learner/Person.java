package learner;

public class Person {
    private final long ID;
    private String name;
    public Person(long id, String name){
        this.ID = id;
        this.name = name;
    }
    public long getId(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
