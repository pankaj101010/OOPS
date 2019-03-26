//Abstract classes can have 0 or more abstract methods
// Abstract class can have all methods as abstract
// Abstract class can have all of its methods as concrete.
// Abstract class is used to achieve zero to 100% abstraction
// Abstract methods should have modifyers as public and protected only
// Abstract methods can also not be given as static
// Abstract cant be also used in a class 

public abstract class Vehicles {
	public abstract int SetMaxSpeed(int maxspeed);
	public void m1() {  // We can create concrete methods
		int j=10;
	}
	public static void main(String[] args) {
		int i=10;	 // We can create instance variable
		Twowheeler t = new Twowheeler();
		System.out.println(t.SetMaxSpeed(110));
	}
}
