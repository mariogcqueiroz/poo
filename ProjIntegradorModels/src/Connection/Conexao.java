package Connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import Exceptions.BDexception;
public class Conexao {
private static Connection conecta =null;
	
	public static Connection openConnection() {
		if(conecta==null) {
			try {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			conecta= DriverManager.getConnection(url, props);
			
			}
			catch(SQLException e) {
				
				throw new BDexception(e.getMessage());
			}
		}
		return conecta;
	}
	
	public static void closeConnection() {
		if(conecta!=null) {
			try {
				conecta.close();
			}
			catch(SQLException e) {
				throw new BDexception(e.getMessage());
			}
		}
	}
	
private static Properties loadProperties() {
	try(FileInputStream fs = new FileInputStream("db.properties")) {
		Properties props = new Properties();
		props.load(fs);
		return props;
	}
	catch(IOException e) {
		throw new BDexception(e.getMessage());
	}

}
}
