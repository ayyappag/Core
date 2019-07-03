package markerint;

public class MarkerTest {

	public static void main(String[] args) {
		DemoMarker marker = new DemoMarker();
		if(marker instanceof Marker)
			System.out.println(" Marker interface :) ");
	}
}
