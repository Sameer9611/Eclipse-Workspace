import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchRecords {
	public static void getFetchRecords() {
		Connection connection =CommonConnection.getConnection();
		
		
		System.out.println("--------------------------------------------------------------------------------------------");	
		/*Example no 1 : fetching everything by itterating the result set rowwise*/
		try {
			PreparedStatement ps =connection.prepareStatement("Select * from employee");
			ResultSet rs=ps.executeQuery();
			System.out.println(rs);//com.mysql.cj.jdbc.result.ResultSetImpl@2357d90a
			while(rs.next()) {//not hasNext>>.next :  resultset
				System.out.println("id>>"+rs.getInt(1));//iterates contents of that column rowwise takes argument of column no.of the output-table
				System.out.println("goodname is>>"+rs.getString(2));
				System.out.println("surname is>>"+rs.getString(3));
				System.out.println("Pagar is>>"+rs.getInt(4));
			}			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("--------------------------------------------------------------------------------------------");	
		/*Example no 2 : fetching a particular column by itterating the result set*/
		try {
			PreparedStatement ps1 =connection.prepareStatement("Select empid from employee");
			ResultSet rs1=ps1.executeQuery();
			System.out.println(rs1);//com.mysql.cj.jdbc.result.ResultSetImpl@2357d90a
			while(rs1.next()) {//not hasNext>>.next :  resultset
				System.out.println("id>>"+rs1.getInt(1));//iterates contents of that coloumn rowwise
			
			}			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("--------------------------------------------------------------------------------------------");	
		/*Example 3: more customfetch*/
		
		try {
			PreparedStatement ps2 =connection.prepareStatement("Select empid from employee where firstname='sameer';");//select sum(salary) from employee;
			ResultSet rs2=ps2.executeQuery();
			System.out.println(rs2);//com.mysql.cj.jdbc.result.ResultSetImpl@2357d90a
			while(rs2.next()) {//not hasNext>>.next :  resultset
				System.out.println("id>>"+rs2.getInt(1));//iterates contents of that result coloumn rowwise
			
			}			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------------------------------------------------------------------------------");	
		/*Example 3: more custom fetch:Sum*/
		
		try {
			PreparedStatement ps2 =connection.prepareStatement("select sum(salary) from employee;");
			ResultSet rs2=ps2.executeQuery();
			System.out.println(rs2);//com.mysql.cj.jdbc.result.ResultSetImpl@2357d90a
			while(rs2.next()) {//not hasNext>>.next :  resultset
				System.out.println("total Salary is>>"+rs2.getInt(1));//output table will have 1 column hence (1) , if (2) out of range
			
			}			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	System.out.println("--------------------------------------------------------------------------------------------");	
	/*Example 3: qwery:call a stored procedure*/

		try {
			PreparedStatement ps =connection.prepareStatement("call `fetchEmployeeSalaryASC`;");//using stored procedure:order by salary
			ResultSet rs=ps.executeQuery();
			System.out.println(rs);//com.mysql.cj.jdbc.result.ResultSetImpl@2357d90a
			while(rs.next()) {//not hasNext>>.next :  resultset
				System.out.println("id>>"+rs.getInt(1));//iterates contents of that column rowwise takes argument of column no.of the output-table
				System.out.println("goodname is>>"+rs.getString(2));
				System.out.println("surname is>>"+rs.getString(3));
				System.out.println("Pagar is>>"+rs.getInt(4));
			}			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		getFetchRecords();
	}

}
