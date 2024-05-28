package learner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person>{
    private List<E> personList;

    public List<E> getPersonList() {
        return personList;
    }

    public People(){
        personList = new ArrayList<>();
    }

    public void add(E e){
        personList.add(e);
    }

    public E findById(long id){
        E personElement = null;
        for(E e: personList){
            if(id == e.getId()){
                personElement = e;
                break;
            }
        }
        return personElement;
    }

    public  boolean contains(E e){
        boolean isPresent = false;
        if (personList.contains(e)){
            isPresent = true;
        }
        return isPresent;
    }

    public void remove(E e){
        personList.remove(e);
    }

    public void remove(long id){
        for(E e: personList){
            if(id == e.getId()){
                personList.remove(e);
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

    public abstract E[] toArray();

    public Iterator<E> iterator(){
        return personList.iterator();
    }

}
