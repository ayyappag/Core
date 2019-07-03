import java.util.Arrays;

public class OwnException extends Exception {
	
	private int id;

	public OwnException() {
		
	}

	public OwnException(int i) {
		super();
		this.id=i;
		System.out.println(" enter the exceeding limit " +id);
	}
	
	

	/*@Override
	public String toString() {
		return "OwnException [getMessage()=" + getMessage()
				+ ", getLocalizedMessage()=" + getLocalizedMessage()
				+ ", getCause()=" + getCause() + ", toString()="
				+ super.toString() + ", fillInStackTrace()="
				+ fillInStackTrace() + ", getStackTrace()="
				+ Arrays.toString(getStackTrace()) + ", getStackTraceDepth()="
				+ getStackTraceDepth() + ", getSuppressed()="
				+ Arrays.toString(getSuppressed()) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}*/


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return (super.getMessage()+" : exception id:"+id);
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}
	

	
	
	
	
}
