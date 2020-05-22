package spring_aop04_after_throw_advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TextMain {
	public static void main(String[] args) {
		
		ApplicationContext context =
				new GenericXmlApplicationContext("app.xml");
		
		Message msg = context.getBean("proxyBean", Message.class);
		
		msg.prtMsg();
		
		try {
			msg.prtThrowMessage();
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("catch");
		}
		
	}
}
