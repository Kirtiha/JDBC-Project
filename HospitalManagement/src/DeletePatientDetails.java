import java.sql.*;
public class DeletePatientDetails {
	
	
	public void PDDelete()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/hospitalmanagement";
		String username="root";
		String password="12345678";
		String Query="delete from hospitalpatientdetails where PatientId='416'";
		Connection con= DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	
	
	
	
	
	
	
	
	public static void main(String[]args) throws Exception{
		DeletePatientDetails obj=new DeletePatientDetails();
		obj.PDDelete();
		
	}

}
