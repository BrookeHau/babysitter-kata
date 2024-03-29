
public class Babysitter {

	private double startTime;
	private double bedTime;
	private double endTime;
	private int payRate1 = 12;
	private int payRate2 = 8;
	private int payRate3 = 16;

	public Babysitter() {
		
	}
	public Babysitter(double startTime, double bedTime, double endTime) {
		this.startTime = convertHours(Math.round(startTime));
		this.bedTime = convertHours(Math.round(bedTime));
		this.endTime = convertHours(Math.round(endTime));
	}

	public double convertHours(double hour) {
		if (hour <= 4 && hour >= 0) {
			return hour += 24;
		}
		return hour;
	}

	public double getPay() {
		return payTier1() + payTier2() + payTier3();
	}

	public double payTier1() {
		return hoursBetweenStartAndBed() * payRate1;
	}

	public double hoursBetweenStartAndBed() {
		if (endTime < bedTime) {
			return endTime - startTime;
		}
		return bedTime - startTime;
	}

	public double hoursBetweenBedAndMidnight() {
		if(endTime < bedTime) {
			return 0;
		} if(endTime < 24) {
			return endTime - bedTime;
		}
		return 24 - bedTime;
	}

	public double payTier2() {
		return hoursBetweenBedAndMidnight() * payRate2;
	}

	public double payTier3() {
		return hoursBetweenMidnightAndEnd() * payRate3;
	}

	private double hoursBetweenMidnightAndEnd() {
		if(endTime < bedTime ) {
			return 0;
		} if(endTime < 24) {
			return 0;
		}
		return endTime - 24;
	}
}
