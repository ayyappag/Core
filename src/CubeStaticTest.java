class Cube {

	int length = 10;
	int breadth = 10;
	int height = 10;
	public static int numOfCubes = 1; // static variable

	public static int getNoOfCubes() { // static method
		return numOfCubes;
	}

	public Cube() {
		numOfCubes++; //
	}
	

	public Cube(int i) {
		numOfCubes = numOfCubes+i; //
	}
	

	public Cube(int i , int j) {
		numOfCubes = numOfCubes+i+j; //
	}
	
}

public class CubeStaticTest {

	public static void main(String args[]) {
		Cube test = new Cube(5);
		System.out.println("Number of Cube objects = " + test.numOfCubes);
		System.out.println("Number of Cube objects = " + Cube.getNoOfCubes());
	}
}
