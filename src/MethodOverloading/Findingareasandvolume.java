package MethodOverloading;

public class Findingareasandvolume {

	public static void main(String[] args) {
		DifferentAreas d=new DifferentAreas();
		System.out.println(d.areaoffigure(20,30,40));
		System.out.println(d.areaoffigure(20,40.5));
		System.out.println(d.areaoffigure(23.3)); 
	}

}
