import java.io.*;
import java.sql.*
class DBConnection
{
	public ststic void main(String str[])
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql\"+ user="" assword=" ");
		Statement st=con.CreateStatement();
		String query="select * from student";
		ResultSet rs=new ResultSet(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		rs.close();
		st.close();
		con.close();
	}
}