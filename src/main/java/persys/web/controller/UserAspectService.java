package persys.web.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspectService {

	@Around("@annotation(LSG)")
//	@Around("execution(* persys.web.controller..*Controller.*(..))")
	public Object timeLog(ProceedingJoinPoint pjp) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("Start Time : " + startTime);
		Object result = pjp.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("End Time : " + (endTime-startTime));
		return result;
	}
	
}
