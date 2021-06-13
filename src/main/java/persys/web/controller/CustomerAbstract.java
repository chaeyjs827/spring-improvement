package persys.web.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomerAbstract {

//	public 
	
	@Around("@annotation(CYJ)")
	public Object startingMsg(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Method Starting");
		Object result = pjp.proceed();
		return result;
	}
	
}
