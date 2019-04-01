package MethodOverloading;

public class DifferentAreas {
	/**
	 * Finds the area of Rectangle
	 * @param l input parameter as length l in double
	 * @param b input parameter as breadth b in double
	 * @return  Area of Rectangle calculated in double for any input rectangle
	 */
	public double areaoffigure(double l,double b) {
		return l*b;
	}
	/**
	 * 
	 * @param l ({@code l} as  double length
	 * @param b ({@code b} as double breadth
	 * @param h ({@code h} as double height
	 * @return double volume of cube
	 */
	public double areaoffigure(double l,double b,double h) {
		return l*b*h;
	}
	public double areaoffigure(double l) {
		return Math.pow(l, 2);
	}
	public double areaoffigure(float l,float b,float h) {
		float s=0;
		s=(l+b+h)/2;
		return Math.sqrt(s*(s-l)*(s-b)*(s-h));
	}
}
