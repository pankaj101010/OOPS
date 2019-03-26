package CollectionFramework.ListPackage;

import java.util.Vector;

public class Vectorexample {
	public static void main(String[] args) {
		Vector<Integer>v=new Vector<Integer>();
		v.add(0,5);
		v.add(0,5);
		v.add(0,5);
		v.add(0,5);
		v.add(0,5);
		v.add(0,5);
		v.add(0,5);
		v.add(0,5);
		v.add(1, 2);
		v.add(5,10);
		System.out.println(v.get(5));
		System.out.println(v.size());
		System.out.println(v);
	}
}
