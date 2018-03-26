
public class Babysitter {

	private int startTime;
	private int bedTime;
	private int endTime;
	private int payRate1 = 12;
	private int payRate2 = 8;
	private int payRate3 = 16;

	public Babysitter(int startTime, int bedTime, int endTime) {
		this.startTime = startTime;
		this.bedTime = bedTime;
		this.endTime = endTime;
	}

	public int getPay() {
		return payBeforeBedTime();
	}

	public int payBeforeBedTime (){
		return hoursBeforeBedTime() * payRate1;
	}
	
	public int hoursBeforeBedTime() {
		return bedTime - startTime;
	}
}
