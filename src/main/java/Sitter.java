
public class Sitter {

	private int startTime;
	private int bedTime;
	private int endTime;
	
	
	public Sitter(int startTime, int bedTime, int endTime) {
		this.startTime = startTime;
		this.bedTime = bedTime;
		this.endTime = endTime;
	}
	
	public int hourWorkedForPay1(){
		if(endTime < bedTime) {
			return endTime - startTime;
		}
		return bedTime - startTime; 
	}
	
	public int hoursWorkedForPay2(){
		if(endTime < 24 && endTime > bedTime) {
		return endTime - bedTime ; 
		}
		return 0;
	}
}
