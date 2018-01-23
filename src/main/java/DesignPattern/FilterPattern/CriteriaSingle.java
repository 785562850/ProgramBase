package DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2017/10/2.
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons=new ArrayList<Person>();
        for (Person person:persons) {
            if("SINGLE".equalsIgnoreCase(person.getGender())){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}

