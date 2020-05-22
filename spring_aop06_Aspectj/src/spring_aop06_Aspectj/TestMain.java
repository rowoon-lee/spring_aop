package spring_aop06_Aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = context.getBean("cs", CustomerService.class);
		cs.printEmail();
		cs.printName();
		
	}

}
