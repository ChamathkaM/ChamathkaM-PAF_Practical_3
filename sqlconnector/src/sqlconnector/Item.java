package sqlconnector;
import java.sql.DriverManager;
import java.sql.Connection;

public class Item {
	public Connection connect()
	{
	 Connection con = null;

	 try
	 {
		 Class.forName("com.mysql.jdbc.Driver");
		 con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myadmin/test",
	 "root", "");
		 //For testing
		 System.out.print("Successfully connected");
	 	}
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
	 	}

	 return con;
	}
	
	


}
