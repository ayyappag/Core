import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamConstants;
import java.io.Serializable;

class SerializationBox implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private byte serializableProp = 10;
	volatile int t =50;

	public byte getSerializableProp() {
		return serializableProp;
	}
	public int getT() {
		return t;
	}
}

public class SerializationSample {

	public static void main(String args[]) throws IOException,
			ClassNotFoundException {
		SerializationBox serialB = new SerializationBox();
		String a = "abc";
		String b = "abc";
		System.out.println("a = " + a.hashCode() + " : b==" + b.hashCode());
		serialize("serial.out", serialB);
		SerializationBox sb = (SerializationBox) deSerialize("serial.out");
		System.out.println("getSerializableProp:"+sb.getSerializableProp());
		System.out.println("volatile value :: "+ sb.getT());

	}

	public static void serialize(String outFile, Object serializableObject)
			throws IOException {
		FileOutputStream fos = new FileOutputStream(outFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serializableObject);
		System.out.println("hashcode :: "  + oos.hashCode());
		System.out
				.println(" serialize stream version == " + ObjectStreamConstants.STREAM_VERSION);
	}

	public static Object deSerialize(String serilizedObject)
			throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(serilizedObject);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("hashcode :: "  + ois.hashCode());
		System.out.println(" deSerialize stream version == "
				+ ObjectStreamConstants.STREAM_VERSION);
		return ois.readObject();
	}
	
	
}