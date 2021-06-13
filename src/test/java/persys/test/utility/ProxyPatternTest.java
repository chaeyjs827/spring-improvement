package persys.test.utility;

import org.junit.Test;

import persys.test.base.BaseTestCase;
import persys.web.proxyPatternTest.CashPerf;
import persys.web.proxyPatternTest.Payment;
import persys.web.proxyPatternTest.Store;

public class ProxyPatternTest extends BaseTestCase{
	
//	@Autowired
//	private Store store;
	
	@Test
	public void storeTest() {
		Payment cashPerf = new CashPerf();
		Store store = new Store(cashPerf);
		store.buySomething(1000);
	}
	
	@Test
	public void paySecond() {
		Payment payment = new CashPerf();
		payment.paySecond();
	}
}
