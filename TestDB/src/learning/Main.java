package learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	    try(Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/siddharth/Documents/Projects/java-masterclass/TestDB/testjava.db");
            Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            statement.execute("CREATE TABLE IF NOT EXISTS" +
                    " contacts (name TEXT, phone INTEGER, email TEXT)");
            statement.execute("INSERT INTO contacts values('Siddharth', 123456, 'sid@email.com')");
        } catch (SQLException e) {
            System.out.println("Database Exception caught: " + e.getMessage());
        }
    }
}
