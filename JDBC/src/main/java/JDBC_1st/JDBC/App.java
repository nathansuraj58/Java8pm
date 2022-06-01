package JDBC_1st.JDBC;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
    	try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qafox","root","root");
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from students");
			while(rs.next()) {
				System.out.println(rs.getString("id"));
			}
					} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
