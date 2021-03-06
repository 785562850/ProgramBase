package DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2017/10/2.
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
       List<Person> malePersons=new ArrayList<Person>();
        for (Person person:persons) {
            if("MALE".equalsIgnoreCase(person.getGender())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
