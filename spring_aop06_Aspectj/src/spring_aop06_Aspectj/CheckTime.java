package spring_aop06_Aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime {
	//Aspectj에서 가져와야 대므로 상속받지 x
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		
		// 메소드 이름 체크
		String methodName = pjp.getSignature().getName();
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		//수행시키기 pjp통해
		Object obj= pjp.proceed();
		
		sw.stop();
		
		System.out.println("메소드 이름 : " + methodName);
		System.out.println("수행 시간 : " + sw.getTotalTimeSeconds());
		
		return obj;
		
	}

}
