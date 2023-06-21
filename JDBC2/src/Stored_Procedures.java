
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Stored_Procedures {
	public static void getStored_Procedures(int sal) {
		Connection con =CommonConnection.getConnection();
		try {//this is stored_produre fetches the data>>obviously can be used for mapulating data base(insert delete,create table)
			CallableStatement cs=con.prepareCall("call `FetchEMplSal>iinputsal`(?)");
			cs.setInt(1,sal);
			ResultSet rs=cs.executeQuery();//forgot to write execute 20 min wasted>>no error
			while(rs.next()) {
				System.out.println("empid is>>"+rs.getInt(1));
				System.out.println("first name is>>"+rs.getString(2));//these are columns of output-table
				System.out.println("surname is>>"+rs.getString(3));
				System.out.println("salary is>>"+rs.getInt(4));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("updated successfully");
		
                                /*below can also work. how?>>dont know how???*/		
		
//		Connection con =CommonConnection.getConnection();
//		try {//this is stored_produre fetches the data>>obviously can be used for mapulating data base(insert delete,create table)
//			?<<<PreparedStatement cs=con.prepareStatement("call `FetchEMplSal>inputsal`(?)");
//			cs.setInt(1,sal);
//			ResultSet rs=cs.executeQuery();//forgot to write execute 20 min wasted>>no error
//			while(rs.next()) {
//				System.out.println("empid is>>"+rs.getInt(1));
//				System.out.println("first name is>>"+rs.getString(2));//these are columns of output-table
//				System.out.println("surname is>>"+rs.getString(3));
//				System.out.println("salary is>>"+rs.getInt(4));
//			}
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//		System.out.println("updated successfully");	
//		
				
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  Salary here:");
		int salary=sc.nextInt();
		getStored_Procedures(salary);
		sc.close();	
	}

}
