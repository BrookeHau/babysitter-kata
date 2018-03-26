import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void shouldGetPay() {
		Babysitter babysitter = new Babysitter(17, 19, 4);
		double pay = babysitter.getPay();
		assertThat(pay, is(128.0));
	}

	
	
	@Test
	public void getPayAfterBedTime() {
		Babysitter babysitter = new Babysitter(17, 19, 4);
		double pay = babysitter.payTier2();
		assertThat(pay, is(40.0));
	}
	
	@Test
	public void payBetweenMidnightAndEndTime() {
		Babysitter babysitter = new Babysitter(17, 19, 4);
		double pay = babysitter.payTier3();
		assertThat(pay, is(64.0));
	}
	
	@Test
	public void testRounding() {
		Babysitter babysitter = new Babysitter(17.6, 18.7, 3.75);
		double pay = babysitter.payTier1();
		assertThat(pay, is(12.0));
	}
}
