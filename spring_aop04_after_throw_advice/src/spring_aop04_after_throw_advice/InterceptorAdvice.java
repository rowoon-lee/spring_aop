package spring_aop04_after_throw_advice;

import org.springframework.aop.ThrowsAdvice;

// ThrowsAdvice는 만들어져있는 메소드가 없음 => 무슨 에러가 터질지 모르기 때문에 존재하지 않음 => 직접 메소드 만들기
public class InterceptorAdvice implements ThrowsAdvice{
	
	
	public void afterThrowing(IllegalArgumentException e) {
		System.out.println("InterceptorAdvice Exception");
	}
	
}
