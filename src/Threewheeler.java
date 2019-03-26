
public class Threewheeler extends Vehicles {

	@Override
	public int SetMaxSpeed(int maxspeed) {
		if (maxspeed > 70) {
			System.err.println("Two wheeler speed cant be greater than 70 kph");
		} else {
			Constants.maxspeed = maxspeed;
		}
		return Constants.maxspeed;
	}

}
