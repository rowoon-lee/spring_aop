package spring_aop02_after_returning_advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext  context = 
				new GenericXmlApplicationContext("app.xml");	//container에 있는 설정 읽어오기
		
		CustomerService cs = context.getBean("proxyBean", CustomerService.class);
		cs.printName();
		cs.printEmail();
		
	}
}
