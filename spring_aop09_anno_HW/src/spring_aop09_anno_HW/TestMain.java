package spring_aop09_anno_HW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		 Weapon w = context.getBean("weapon", Weapon.class); 
		/* Weapon w = context.getBean("weapon", Weapon.class); */
		
		w.fire();
		w.reload();

		
	}
}
