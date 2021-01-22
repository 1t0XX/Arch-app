package dz6;

import java.util.HashMap;
import java.util.Map;

public class UnitOfWork {

    private static Map<Long, Person> personMap = new HashMap();

    public static void addPerson(Person person) {

       personMap.put((long) person.getIdPerson(), person);
    }

    public static Person getPerson(Long key) {
        return personMap.get(key);
    }

}
