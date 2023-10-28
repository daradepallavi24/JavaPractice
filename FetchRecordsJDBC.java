package jdbc;

/*Import the necessary Java libraries for JDBC.
 * Register the MySQL JDBC driver using Class.forName("com.mysql.cj.jdbc.Driver"). 
 * This step is used to load the MySQL JDBC driver class.
 * Establish a connection to the MySQL database using DriverManager.getConnection.
 *  Make sure to replace "jdbc:mysql://localhost/TableSQL" with the appropriate database URL for your MySQL server and specify the correct username and password.
 * Create a Statement object to execute SQL queries.
 * Define the SQL query to fetch all records from the "example_table."
 * Execute the SQL query using statement.executeQuery(selectQuery) to retrieve the records.
 * Iterate through the result set using a while loop and retrieve values for each column (ID, name, email, username, and password).
 * Display the fetched records to the console.
 * Handle potential exceptions for class loading and SQL errors.
 * In the finally block, close the ResultSet, Statement, and Connection to release resources.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecordsJDBC {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver registered");

            // Establish a connection to the MySQL database
            connection = DriverManager.getConnection("jdbc:mysql://localhost/FetchRecords", "root", "root");
            System.out.println("Connection established");

            // Create a Statement
            statement = connection.createStatement();

            // Define the SQL query to fetch all records from the table
            String selectQuery = "SELECT * FROM records";

            // Execute the SQL query
            resultSet = statement.executeQuery(selectQuery);

            // Display the records
            System.out.println("Records in the table:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Username: " + username + ", Password: " + password);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the ResultSet, Statement, and Connection
                if (resultSet != null) {
                    resultSet.close();
                }
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

