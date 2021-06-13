package persys.web.proxyPatternTest;

public class Cash implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println(amount + "원 현금 결제");
	}

	@Override
	public void paySecond() {
		// TODO Auto-generated method stub
		
	}

	
	
}
