import java.sql.*;
public class postgres implements Database
{
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
   private Statement st;
   public void connect()
   {
	   try
	   {
	     Class.forName("org.postgresql.Driver");
		 con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/hetvi","admin","admin");
		 System.out.println("connect");
	   }
	   catch(Exception er)
	   {
		   //System.out.println("class not found");
		   er.printStackTrace();
	   }
   }
}