package spring_aop03_befor_hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//출력
		
		/*
		 * --------------------------------------------
		 * 메인 업무 메소드 실행 전에 호출된 공통 관심사 출력부분
		 * -------------------------------------------
		 * 
		 * 계좌이체를 시작합니다
		 * '반장님' 계좌에서 10000원 출금되었습니다.
		 * '잔액' : 990000 원
		 * 
		 */
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		Bank b = context.getBean("proxyBean", Bank.class);
		
		b.transfter(10000);
	}
}
