package kr.co.mook.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
	
	@Before("execution(public * kr.co.mook.service..*.*(..))")
	public void before(JoinPoint joinPoint) {
		String aopInfo = joinPoint.getSignature().getName();

		System.out.println(aopInfo + "를 실행전 내용임 " );
		
		for( Object arg : joinPoint.getArgs()) {
			System.out.println("joinpoint args 정보 " + arg);
		}
	}
	
	@After("execution(public * kr.co.mook.service..*.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("after 실행");
	}
}
