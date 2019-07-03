
public class Distance implements Comparable {
	private int feet;
	private int inches;
	private final int DEFAULT_FT = 1;
	private final int DEFAULT_IN = 1;

	// constructors
	public Distance() {
		feet = DEFAULT_FT;
		inches = DEFAULT_IN;
	}

	public Distance(int ft, int in) {
		feet = ft;
		inches = in;
	}

	// get methods
	public int getFeet() {
		return feet;
	}

	public int getInch() {
		return inches;
	}

	// set methods - validate + whole integers only
	public void setFeet(int ft) {
		feet = ft;
	}

	public void setInch(int in) {
		inches = in;
	}

	// method to add two distance objects

	public Distance add(Distance k) {
		Distance p = new Distance();
		p.inches = this.inches + k.inches;
		p.feet = this.feet + k.feet;

		while (p.inches > 12) {
			p.inches = p.inches - 12;
			p.feet++;
		}
		return p;
	}

	// method to subtract two distance objects

	public Distance sub(Distance d) {
		Distance k = new Distance();
		k.inches = this.inches - d.inches;
		k.feet = this.feet - d.feet;
		while (k.inches < 0) {
			k.inches = k.inches + 12;
			k.feet--;
		}
		return k;
	}

	// equals() - compares two distance objects for equality
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		if (!(obj instanceof Distance))
			return false;
		Distance d = (Distance) obj;
		if (this.feet == d.feet && this.inches == d.inches)
			return true;
		else
			return false;
	}

	// hashCode() - same hash code for equal objects
	@Override
	public int hashCode() {
		return ((Integer) feet).hashCode() + inches;
	}

	// compareTo() - compares two distance objects ( <, >, == )
	@Override
	public int compareTo(Object obj) {
		Distance k = new Distance();
		Distance k1 = new Distance();
		k1 = (Distance) obj;
		if (k.getFeet() > k1.getFeet()) {
			return 1;
		} else if (k.getFeet() == k1.getFeet()) {
			if (k.getInch() > k1.getInch()) {
				return 1;
			} else if (k.getInch() == k1.getInch()) {
				return 0;
			} else {
				return -1;
			}

		} else
			return -1;
	}
/*
	@Override
	public String toString() {
		return String.format("%d' %d\"", feet, inches);
	}*/

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches
				+ ", DEFAULT_FT=" + DEFAULT_FT + ", DEFAULT_IN=" + DEFAULT_IN
				+ "]";
	}
	
	
	
	
}
