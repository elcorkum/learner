package learner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People{
    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }

    public People(){
        personList = new ArrayList<>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        Person person = null;
        for(Person p: personList){
            if(id == p.getId()){
                person = p;
                break;
            }
        }
        return person;
    }

    public boolean contains(Person person){
        boolean isPresent = false;
        if (personList.contains(person)){
            isPresent = true;
        }
        return isPresent;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        for(Person p: personList){
            if(id == p.getId()){
                personList.remove(p);
                break;
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    public Iterator<Person> iterator(){
        return personList.iterator();
    }

}
