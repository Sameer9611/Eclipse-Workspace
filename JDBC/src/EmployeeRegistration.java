import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//java. lang. Class
public class EmployeeRegistration {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String sql1 ="insert into employee(firstname,lastname,salary) values('sameer','ghogare','31000');";
		String sql2="select * from employee";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//1)load the driver class>>tell to handle checked exception>>ClassnotFoundException
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Lenovo@9611");//2)establish connection//>>tells to handle checked exception>>SQLException
			Statement statement=connection.createStatement();//3)create statement object//gets handled by SQLException 
			statement.execute(sql1);//4)create qwery and pass to execute.statement//gets handled by SQLException(for non select type commands use any, executeupdate(String sql) etc)
			System.out.println(statement.executeQuery(sql2));//only selecttype is used to return the Resultset return type executeQuery >>>com.mysql.cj.jdbc.result.ResultSetImpl@c8e4bb0
			System.out.println("Entry successful");//>hence placed here ad if exception occurs does not jump back
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		//System.out.println("Entry successful");>>even if exception occure this gets print
		//hence dont place here
		
	}
	

}
