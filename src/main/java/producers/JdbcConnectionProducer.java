package producers;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionProducer {

    @Produces
    private Connection createConnection() {
        Connection connection = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            try {
                connection = DriverManager.getConnection("jdbc:derby:memory:test", "", "");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private void closeConnection(@Disposes Connection connection) throws SQLException {
        connection.close();
    }
}
