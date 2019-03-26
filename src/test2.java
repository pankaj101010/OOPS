
public class test2 {
	static int eid;
	static {
		eid=222;
	}
	static void disp() {
		System.out.println(test2.eid);
	}

	public static void main(String[] args) {
		test2.disp();
	}
}
