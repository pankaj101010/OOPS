public class Twowheeler extends Vehicles implements AllVehicles {
	@Override
	public int SetMaxSpeed(int maxspeed) {
		if (maxspeed > 120) {
			System.err.println("Two wheeler speed cant be greater than 120 kph");
		} else {
			Constants.maxspeed = maxspeed;
		}
		return Constants.maxspeed;
	}

	@Override
	public void setColor(String colorname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaterial(String materialtype) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNumberofLamps() {
		// TODO Auto-generated method stub
		
	}

}
