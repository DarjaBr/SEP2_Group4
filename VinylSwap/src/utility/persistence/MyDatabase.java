package utility.persistence;

import java.sql.Connection;
import java.util.ArrayList;

public class MyDatabase {
    private Connection connection;

    public MyDatabase(){}

    public ArrayList<Object[]> query(String sql, Object statementElements){
        return null;
    }

    public int update(String sql, Object statementElements){
        return 0;
    }
}
