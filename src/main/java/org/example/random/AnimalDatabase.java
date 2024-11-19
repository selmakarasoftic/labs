package src.main.java.org.example.random;
import java.sql.*;
public class AnimalDatabase {
    private static final String CONNECTION_STRING = "jdbc:mysql://oop.ibu.edu.ba:3306/oopgroup2";
    private static final String USERNAME = "oopuser";
    private static final String PASSWORD = "ooppassWD";

    private Connection connection = null;

    public AnimalDatabase() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAnimals(String name, int id) {
        String query = "SELECT * FROM animals WHERE name = ? AND id > ?";
        try (PreparedStatement statement = this.connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setInt(2, id);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " -> " + rs.getString("name") + " -> " + rs.getString("type"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AnimalDatabase db = new AnimalDatabase();
        db.getAnimals("exampleName", 5);
    }
}
