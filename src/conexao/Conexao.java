package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:/Users/Juliano/Desktop/banco.db");
    }
}
