package persys.web.proxyPatternTest;

import org.springframework.stereotype.Component;

//@Component
public class Store {
	
	private Payment payment;
	
	public Store(Payment payment) {
		this.payment = payment;
	}
	
	public void buySomething(int amount) {
		payment.pay(amount);
	}
	
}
