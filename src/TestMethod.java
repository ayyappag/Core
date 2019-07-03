import java.io.IOException;


public class TestMethod {

	public void method()  //throws IOException
	{
		String a =null;
		
		try {
			System.out.println("method :: " + a.length());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
