package jdbc;

/*Import the necessary Java libraries for JDBC.
 * Register the MySQL JDBC driver using Class.forName("com.mysql.cj.jdbc.Driver"). This step is used to load the MySQL JDBC driver class.
 * Establish a connection to the MySQL database. Ensure you replace "jdbc:mysql://localhost/Anudip", "your_username", and "your_password" with the correct database URL, username, and password.
 * Define an SQL SELECT query to retrieve placed students from the "student" table. The query includes a placeholder for the placement status.
 * Create a PreparedStatement to safely execute the SELECT query. This allows you to use placeholders and set values for the parameters.
 * Set the parameter for the placement_status using preparedStatement.setBoolean(1, true). This example sets it to true to retrieve placed students.
 * Execute the SELECT query using preparedStatement.executeQuery() and store the result set.
 * Iterate through the result set and retrieve values for each column (studentId, studentName, batch).
 * Display the records of placed students to the console.
 * Handle potential exceptions for class loading and SQL errors.
 * In the finally block, close the ResultSet, PreparedStatement, and Connection to release resources.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPlacedStudentsJDBC {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver registered");

            // Establish a connection to the "Anudip" database
            connection = DriverManager.getConnection("jdbc:mysql://localhost/PlacedStudents", "root", "root");
            System.out.println("Connection established");

            // Define an SQL SELECT query to retrieve placed students
            String selectQuery = "SELECT * FROM student WHERE placement_status = ?";

            // Create a PreparedStatement
            preparedStatement = connection.prepareStatement(selectQuery);

            // Set the parameter for placement_status (1 indicates placed, 0 indicates not placed)
            preparedStatement.setBoolean(1, true);

            // Execute the SELECT query
            resultSet = preparedStatement.executeQuery();

            // Display the records of placed students
            System.out.println("Placed Students:");
            while (resultSet.next()) {
                int studentId = resultSet.getInt("student_id");
                String studentName = resultSet.getString("student_name");
                String batch = resultSet.getString("batch");

                System.out.println("Student ID: " + studentId + ", Name: " + studentName + ", Batch: " + batch);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the ResultSet, PreparedStatement, and Connection
                if (resultSet != null) {
                    resultSet.close();
                }
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

