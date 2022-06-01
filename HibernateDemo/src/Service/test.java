package Service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) throws SQLException {
		System.out.println("Connectin to database");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("created");
	}

}
