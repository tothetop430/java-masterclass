package learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	    try(Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/siddharth/Documents/Projects/java-masterclass/TestDB/testjava.db");
            Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        } catch (SQLException e) {
            System.out.println("Database Exception caught: " + e.getMessage());
        }
    }
}
