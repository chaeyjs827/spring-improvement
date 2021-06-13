package persys.web.proxyPatternTest;

public class CreditCard implements Payment {

	Payment cash = new Cash();
	
	/*
	 * 
	 * 이 부분이 일종의 프록시 역할을 담당해줌
	 * Store 입장에서는 계속 Payment 인터페이스만 쓰지만, 
	 * Cash가 아닌 CreditCard를 쓰면 CreditCard에서 결제 방법을 결정함
	 * 
	 */
	
	@Override
	public void pay(int amount) {
		if(amount > 100) {
			System.out.println("원 신용카드 결제");
		} else {
			cash.pay(amount);
		}
	}

	@Override
	public void paySecond() {
		// TODO Auto-generated method stub
		
	}

}
