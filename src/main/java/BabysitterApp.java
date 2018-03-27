import java.util.Scanner;

public class BabysitterApp {

	private static double startTime;
	private static double bedTime;
	private static double endTime;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your start Time:");
		startTime = input.nextDouble();
		if(startTime < 17) {
			System.out.println("You must start by 17 o'clock");
			System.out.println("Enter your start Time:");
			startTime = input.nextDouble();
		}
		System.out.println("Enter Bed Time:");
		bedTime = input.nextDouble();
		System.out.println("Enter Time Left");
		endTime = input.nextDouble();
		if(endTime > 0 && endTime < 4) {
			System.out.println("You must leave by 4 o'clock");
			System.out.println("Enter Time Left");
			endTime = input.nextDouble();
		}
		
		Babysitter babysitter = new Babysitter(startTime, bedTime, endTime);
		
		System.out.println("You received $" + babysitter.getPay());
	}

}
