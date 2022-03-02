package learning;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	    try(Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/siddharth/Documents/Projects/java-masterclass/TestDB/testjava.db");
            Statement statement = connection.createStatement()) {
//            connection.setAutoCommit(false);
            statement.execute("CREATE TABLE IF NOT EXISTS" +
                    " contacts (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts values('Tanu', 123458, 'tanu@email.com')");
//            statement.execute("INSERT INTO contacts values('Mem1', 123459, 'mem1@email.com')");
//            statement.execute("INSERT INTO contacts values('Mem2', 123450, 'mem2@email.com')");
//            statement.execute("UPDATE contacts SET phone=123454 WHERE name='Siddharth'");
//            statement.execute("DELETE FROM contacts WHERE name='Mem2'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            while (results.next()) {
                System.out.println(results.getString("name") + " "
                        + results.getInt("phone") + " "
                        + results.getString("email"));
            }

            results.close();
        } catch (SQLException e) {
            System.out.println("Database Exception caught: " + e.getMessage());
        }
    }
}
