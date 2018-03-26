import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void shouldGetPay() {
		Babysitter babysitter = new Babysitter(0, 0, 0);
		int pay = babysitter.getPay();
		assertThat(pay, is(0));
	}

	@Test
	public void calculatePayTilBedTime() {
		Babysitter babysitter = new Babysitter(17, 19, 4);
		int pay = babysitter.getPay();
		assertThat(pay, is(24));
		
	}
}
