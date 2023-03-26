import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMultipleRecords {
	
	public static void getMultipleRecords(String fn,String ln,int sl) {
		Connection connection=CommonConnection.getConnection();
		try {
			PreparedStatement ps =connection.prepareStatement("insert into employee(firstname,lastname,salary) values(?,?,?)");
			ps.setString(1,fn );
			ps.setString(2,ln );//one qwery multiple times usage>>preparedStatement is used>hardcoded
			ps.setInt(3,sl);
			ps.execute();//4)create qwery and pass to execute.statement//gets handled by SQLException(for non select type commands use any, executeupdate(String sql) etc)
			System.out.println("Entry successful");//>hence placed here ad if exception occurs does not jump back
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number of Employee:");
		int i =sc.nextInt();
		for(int x=1;x<=i;x++) {		
		System.out.println("enter first name here:");
		String firstname=sc.next();
		System.out.println("enter last name here:");
		String lastname=sc.next();//have problem with nextLine() :soultion at stackoverflow url=https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo#:~:text=It's%20because%20when%20you%20enter,buffer%20from%20the%20first%20input.
		
		
		System.out.println("enter salary");
		int salary=sc.nextInt();
		getMultipleRecords(firstname,lastname,salary);
		}
		sc.close();

	}

}
