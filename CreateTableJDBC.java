package jdbc;

/*Import the necessary Java libraries for working with JDBC and SQL.
 * Register the MySQL JDBC driver using Class.forName("com.mysql.cj.jdbc.Driver"). 
 * This step is used to load the MySQL JDBC driver class.
 * Establish a connection to the MySQL database using DriverManager.getConnection. 
 * Make sure to replace "jdbc:mysql://localhost/TableSQL" with the appropriate database URL for your MySQL server and specify the correct username and password.
 * Create a Statement object to execute SQL queries.
 * Define the SQL query for creating a table named "example_table" with several columns, including an auto-increment primary key.
 * Execute the SQL query using statement.execute(createTableSQL) to create the table.
 * Handle potential exceptions for class loading and SQL errors.
 * In the finally block, you close the Statement and Connection to release resources.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableJDBC {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver registered");

            // Establish a connection to the MySQL database
            connection = DriverManager.getConnection("jdbc:mysql://localhost/TableSQL", "root", "root");
            System.out.println("Connection established");

            // Create a Statement
            statement = connection.createStatement();

            // Define the SQL query to create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS example_table ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(255),"
                    + "email VARCHAR(255),"
                    + "username VARCHAR(255),"
                    + "password VARCHAR(255)"
                    + ")";

            // Execute the SQL query to create the table
            statement.execute(createTableSQL);
            System.out.println("Table created successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the Statement and Connection
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
