package persys.web.proxyPatternTest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TryAnnoAspect {

	/*
	 * Aspect 구현체 @Around을 사용한 메소드 안에서 JoinPoint란 파라미터를 받을 수 있음.
	 * JoinPoint는 사용하고자 하는 @어노테이션이 붙어있는 메소드(타겟)임
	 * => 예제에서 CashPeft의 pay에 @TryAnno를 사용 하고 있는데 JoinPoint는 pay(int amount)메소드임
	 * 
	 */
	
	@Around("@annotation(TryAnno)")
	public Object testAOP(ProceedingJoinPoint joinPoint) throws Throwable {
		Object proceed = joinPoint.proceed();
		System.out.println("오???");
		return proceed;
	}
}
