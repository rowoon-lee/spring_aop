package spring_aop07_aopHW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		 Weapon w = context.getBean("proxy", Weapon.class); 
		/* Weapon w = context.getBean("weapon", Weapon.class); */
		
		w.fire();
		w.reload();

		
	}
}
