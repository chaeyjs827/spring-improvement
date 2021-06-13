package persys.web.proxyPatternTest;

import org.springframework.util.StopWatch;

public class CashPerf implements Payment {

	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		cash.pay(100);
		
		stopWatch.stop();
		System.out.println(stopWatch.prettyPrint());
	}

	@Override
	@TryAnno
	public void paySecond() {
		// TODO Auto-generated method stub
		System.out.println("왜 안되누");
	}
	
	
}
