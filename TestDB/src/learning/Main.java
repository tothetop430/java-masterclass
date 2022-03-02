package learning;

import java.sql.*;

public class Main {

    public static final String connectionString = "jdbc:sqlite:/Users/siddharth/Documents/Projects/java-masterclass/TestDB/testjava.db";

    public static final String TABLE_NAME = "contacts";
    public static final String COL_NAME = "name";
    public static final String COL_PHONE = "phone";
    public static final String COL_EMAIL = "email";

    public static void main(String[] args) {
	    try(Connection connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
                    " (" + COL_NAME + " TEXT, " + COL_PHONE + " INTEGER, " + COL_EMAIL + " TEXT)");

            statement.execute("INSERT INTO " + TABLE_NAME + " values(" +
                    "'mem1'" + ", " + "123" + ", " + "'mem1@email.com'" +
                    ")");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_NAME);
            while (results.next()) {
                System.out.println(results.getString(COL_NAME) + " "
                        + results.getInt(COL_PHONE) + " "
                        + results.getString(COL_EMAIL));
            }
            results.close();
        } catch (SQLException e) {
            System.out.println("Database Exception caught: " + e.getMessage());
        }
    }
}
