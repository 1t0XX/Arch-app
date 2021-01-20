package dz6;

public class Person {
    private int idPerson;
    private String lastName;
    private String firstName;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getIdPerson() {
        return idPerson;
    }
}

// create table person(
//          idperson int primary key,
//          lastname varchar(32),
//          firstname varchar(32))
//