package dz6;


import java.sql.Connection;
import java.sql.ResultSet;


public class PersonMapper {

    private Connection connection;

    public static Person map(ResultSet resultSet) {
        while (resultSet.next()) {
            Person person = new Person();
            person.setIdPerson(resultSet.getInt(1));
            person.setFirstName(resultSet.getString(2));
            person.setLastName(resultSet.getString(3));
            return person;
        }


    }
    public class PersonDAO {

        public Person findById(int idPerson){
            sql =  "SELECT IDPERSON, FIRSTNAME, LASTNAME FROM PERSON WHERE IDPERSON = ?";
            ResultSet rs = storage.execSQL(sql);
            Person person = PersonMapper.map(rs);
            return person;
        }
    }

}


