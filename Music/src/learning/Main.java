package learning;

import learning.model.DataSource;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.openConnection()) {
            System.out.println("Failed to Open DataSource Connection!");
        }
        else {
            System.out.println("Establised DataSource Connection");
            dataSource.closeConnection();
            System.out.println("Finally Closed DataSource Connection");
        }
    }
}
