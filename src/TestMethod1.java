
public class TestMethod1 {

	public static void main(String[] args) {
		
	}
	
	public void mt()  //( not allow)throws NullPointerException
	// (  allow) throws Exception 
	// if you are using try catch : throws not required
	{
		TestMethod name = new TestMethod();
		name.method();
	}
}
