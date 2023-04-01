import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecords {
	public static void getDeleteRecords(int employeeid) {
		Connection connection =CommonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("delete from employee where empid =?");
			ps.setInt(1, employeeid);
			System.out.println("deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id  to be deleted here");
		int id=scanner.nextInt();
		getDeleteRecords(id);
		scanner.close();
	}

}
