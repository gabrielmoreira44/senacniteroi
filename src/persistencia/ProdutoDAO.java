package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoDAO {
		
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		
		// método open
		public void open() throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto3", "root", "");
			
		} // fim open
		
		// método close
		public void close() throws Exception {
			conn.close();
		} // fim  close
		
		
		// esta parte não precisa, mas é bom ter para ver se está funcionando
		public static void main(String[] args) {
			try {
				ProdutoDAO d = new ProdutoDAO();
				d.open();
				d.close();
				System.out.println("Conectei...");
						
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erro ao conectar...");
			}
				
			} // fim main
			
}
