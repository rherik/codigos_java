package crud_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {
	public Connection conectaBD() {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:5050/senhas?user=root&password=";
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return conn;
	}
}

