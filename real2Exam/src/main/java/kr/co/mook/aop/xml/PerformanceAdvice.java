package kr.co.mook.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceAdvice {
	
	public Object trace( ProceedingJoinPoint joinPoint) throws Throwable {
		
		String targetMethodInfo = joinPoint.getSignature().getName();
		System.out.println( targetMethodInfo + " start");
		
		long start = System.currentTimeMillis();
		
		try {
			Object result = joinPoint.proceed();
			return result;
			
		} finally{
			long end = System.currentTimeMillis();
			System.out.println(targetMethodInfo + " end");
			
			System.out.println(targetMethodInfo + "실행시간 => " + (end - start) + " ms");
		}
 		
	}

}
