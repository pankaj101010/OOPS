
public class Fourwheeler extends Vehicles {

	@Override
	public int SetMaxSpeed(int maxspeed) {
		if (maxspeed > 250) {
			System.err.println("Two wheeler speed cant be greater than 250 kph");
		} else {
			Constants.maxspeed = maxspeed;
		}
		return Constants.maxspeed;
	}

}
