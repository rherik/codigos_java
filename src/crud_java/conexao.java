package crud_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conexao {
    public Connection conectaBD(){
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3307/banco_de_senhas?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e, null, 0);
        }
        return conn;
    }
}
