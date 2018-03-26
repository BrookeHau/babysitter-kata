import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void shouldGetPay() {
		Babysitter babysitter = new Babysitter();
		int pay = babysitter.getPay();
		assertThat(pay, is(0));
	}

}
