package spring_aop10_JacaConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConf.class);	//anotaion을 이용해서 config하는 javaconf 객체

		CustomerService cs = context.getBean("cs", CustomerService.class);
		cs.printName();
		cs.printEmail();
		
	}

}
