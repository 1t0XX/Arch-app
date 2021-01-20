package dz6;

public class Main {

    public static void main(String[] args) {
        PersonMapper personMapper = new PersonMapper(connection);
        Person person = personMapper.findById(1);

        person.getFirstName();
        person.getIdPerson();
    }
}
