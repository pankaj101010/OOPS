
public class Statickeyword {
	{
		System.out.println("Instance Block 1");
	}
	// This is a instance block and it will be executed only if objects are created.
	// Static block are especially used to define static variables.
	{
		System.out.println("Instance Block 2");
	}
	static {
		System.out.println("Static Block 1 is loaded first and also only one time");
	}
	static {
		System.out.println("Static Block 2 is loaded first and also only one time");
	}

	Statickeyword() {
		System.out.println("0 arg constructor");
	}

	// This is a constructor block and it will be executed only if objects are
	// created.
	Statickeyword(int a) {
		System.out.println("1 arg constructor");
	}

	// without main method we cannot print or do anything except workingon static
	// block
	
	public static void main(String[] args) throws ClassNotFoundException{
		// new Statickeyword();
		// new Statickeyword();
		Class.forName("B");
		Class.forName("C");
	}
}
