package dz6;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Storage {
    public ResultSet execSQL(sql) {
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setInt(1, idPerson);
    }
}
