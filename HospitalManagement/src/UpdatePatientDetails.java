import java.sql.*;
public class UpdatePatientDetails {
	
	
	public void PDUpdate()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/hospitalmanagement";
		String username="root";
		String password="12345678";
		String Query="update hospitalpatientdetails set PatientFirstName= 'Dev'where PatientId=414";
		Connection con= DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	
	
	
	
	
	
	
	
	public static void main(String[]args) throws Exception{
		UpdatePatientDetails obj=new UpdatePatientDetails();
		obj.PDUpdate();
		
	}

}
