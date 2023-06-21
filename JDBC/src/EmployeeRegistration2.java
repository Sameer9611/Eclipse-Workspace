import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeRegistration2 {
//dynamic entries or qweries
//String a="sameer"; 
//String sql1 ="insert into employee(firstname,lastname,salary) values(a,'ghogare','42000');";
	// >>>this is not possible,cannot add string to string total illegal qwery>>Unknown column 'a' in 'field list'

//Hence, prepare statements makes values() dyanmic ie. ?,?,?,? can be assigned later. (static can also be used ie String sql1 ="insert into employee(firstname,lastname,salary) values('sameer','ghogare','31000');";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name here:");
		String firstname=sc.nextLine();
		System.out.println("enter last name here:");
		String lastname=sc.nextLine();
		System.out.println("enter salary");
		int salary=sc.nextInt();
		sc.close();
		
		
		
		String sql1 ="insert into employee(firstname,lastname,salary) values(?,?,?);";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Lenovo@9611");
			PreparedStatement ps=connection.prepareStatement(sql1);//here itself it uses the qwery and compiles it; and we can enter multiples entries without need of recompiling this
			//use preparestatement if 1 qwery needs to excute multiple times,dynamic inputs,fast etc(cannot use multiple qweries as they are used directly in execte(we can have multiple executes, but not PS)
			ps.setString(1,firstname );//>setString(parameterIndex, String x)
			//ps.setString(1, "majnu");>>overrides 1
			ps.setString(2,lastname );
			ps.setInt(3,salary);//>setInt(parameterIndex, int x)>
			ps.execute();
			
			ps.setString(1,"nayan" );
			ps.setString(2,"shewale" );//one qwery multiple times usage>>preparedStatement is used>hardcoded
			ps.setInt(3,45000);
			ps.execute();//4)create qwery and pass to execute.statement//gets handled by SQLException(for non select type commands use any, executeupdate(String sql) etc)
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
}//here sql qwery is given as argument where connection.prepStatement()is stored in object of prep.Statement
//basic logic is that we are going to make changes in values() hence we need to compile the qwery to set the values
