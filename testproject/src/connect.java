import java.sql.*;
public class connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","rootpasswordgiven");
        	    	System.out.println("Success....");
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}

}
