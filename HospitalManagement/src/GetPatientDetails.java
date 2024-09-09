import java.sql.*;
public class GetPatientDetails {
	
	
	public void PDGet()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/hospitalmanagement";
		String username="root";
		String password="12345678";
		String Query="select*from hospitalpatientdetails";
		Connection con= DriverManager.getConnection(url, username, password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("PatientId"+rs.getInt(1));
			System.out.println("PatientFirstName"+rs.getString(2));
			System.out.println("PatientLastName"+rs.getString(3));
			System.out.println("PatientAge"+rs.getInt(4));
			System.out.println("PatientSex"+rs.getString(5));
			System.out.println("PatientDOB "+rs.getString(6));
			System.out.println("VisitingDate"+rs.getString(7));
			System.out.println("PatientConcern"+rs.getString(8));
			System.out.println("PatientMedicalHistory"+rs.getString(9));
			System.out.println("PatientPhoneNo"+rs.getString(10));
			System.out.println("PatientAddress"+rs.getString(11));
			System.out.println("PharmacyId "+rs.getString(12));
			
		}
		
		con.close();
	}
	
	
	
	
	
	
	
	
	public static void main(String[]args) throws Exception{
		GetPatientDetails obj=new GetPatientDetails();
		obj.PDGet();
		
		
	}

}
