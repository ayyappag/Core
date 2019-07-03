package coreconcepts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBdrive {

	public static void main(String[] args) throws IOException,
			InstantiationException, IllegalAccessException {

		System.out.println("Listing all table name in Database!");
		Connection con = null;

		String url = "jdbc:oracle:thin:@ 129.1.30.188:1521:MISYSEOD";
		String driver = "oracle.jdbc.OracleDriver";
		String user = "system";
		String pass = "system";

		File f = new File("D:/java_mat/hello");
		if(f.exists())
			System.out.println("exists");
		else
			f.createNewFile();
		FileWriter fstream = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(fstream);

		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection created --- " + con);
			String query = "select * from wasadmin.account where PRODUCTID in ('savings','CAwOD')";
			java.sql.Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(query);
			int i = 0;
			while (set.next()) {
				String accountid = set.getString("ACCOUNTID");
				i++;
				String testQuery = "INSERT INTO WASADMIN.INTERESTRECALC (ACCOUNTID, VALUEDATE, VERSIONNUM) VALUES('"
						+ accountid
						+ "', to_date('2012-07-06', 'YYYY-MM-DD'), 0);";

				System.out.println("" + testQuery);
				out.write("" + testQuery);
				out.newLine();
			}
			out.close();
			System.out.println("total count  " + i);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
