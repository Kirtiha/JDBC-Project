import java.sql.*;
public class InsertPatientDetails {
	
	
	public void PDInsert()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/hospitalmanagement";
		String username="root";
		String password="12345678";
		String Query="insert into hospitalpatientdetails values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con= DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 413);
		pst.setString(2,"Kirtiha");
		pst.setString(3, "Venkatesan");
		pst.setInt(4, 21);
		pst.setString(5, "Female");
		pst.setString(6, "2002-11-22");
		pst.setString(7, "2024-9-5");
		pst.setString(8, "Fever");
		pst.setString(9, "No History");
		pst.setString(10, "98765");
		pst.setString(11, "No:7,School Road, Annanagar, Chennai -600101");
		pst.setString(12, "123");
		pst.executeUpdate();
		con.close();
	}
	
	
	

	
	
	
	
	public static void main(String[]args) throws Exception{
		InsertPatientDetails obj=new InsertPatientDetails();
		obj.PDInsert();
		

		
	}


}
