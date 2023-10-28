package jdbc;

/*Import the necessary Java libraries for JDBC.
 * Register the MySQL JDBC driver using Class.forName("com.mysql.cj.jdbc.Driver"). This step is used to load the MySQL JDBC driver class.
 * Establish a connection to the MySQL database using DriverManager.getConnection. Make sure to replace the database URL, username, and password with the correct values.
 * Define an SQL INSERT query with parameters using a PreparedStatement. The query includes placeholders for the values to be inserted.
 * Create a PreparedStatement to safely insert data. This allows you to use placeholders and set values for the parameters.
 * Set values for the parameters using preparedStatement.setInt and preparedStatement.setString methods.
 * Execute the INSERT statement using preparedStatement.executeUpdate() and store the number of rows affected.
 * Display a message indicating whether the insertion was successful or not.
 * Handle potential exceptions for class loading and SQL errors.
 * In the finally block, close the PreparedStatement and Connection to release resources.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentRecordsJDBC {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver registered");

            // Establish a connection to the MySQL database
            connection = DriverManager.getConnection("jdbc:mysql://localhost/StudentsRecords", "root", "root");
            System.out.println("Connection established");

            // Define an SQL INSERT query with parameters
            String insertQuery = "INSERT INTO student (student_id, first_name, student_age) VALUES (?, ?, ?)";

            // Create a PreparedStatement to safely insert data
            preparedStatement = connection.prepareStatement(insertQuery);

            // Set values for the parameters
            int studentId = 1;  // You can change this value for each student
            String studentName = "John Doe";
            int studentAge = 20;

            preparedStatement.setInt(1, studentId);
            preparedStatement.setString(2, studentName);
            preparedStatement.setInt(3, studentAge);

            // Execute the INSERT statement
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Student record inserted successfully.");
            } else {
                System.out.println("Failed to insert student record.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the PreparedStatement and Connection
                if (preparedStatement != null) {
                    preparedStatement.close();
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

