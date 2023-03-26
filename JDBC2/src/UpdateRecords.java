import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecords {
	public static void getUpdateRecords(int sal,int empid) {
		Connection con =CommonConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("update employee set salary=? where empid=? ");
			ps.setInt(1,sal);
			ps.setInt(2,empid);
			ps.execute();//forgot to write execute 20 min wasted>>no error

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("updated successfully");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  Salary here:");
		int salary=sc.nextInt();
		System.out.print("Enter Employee Id to update here:");
		int employeeId=sc.nextInt();
		getUpdateRecords(salary,employeeId);
		sc.close();
	}

}
