package spring_aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {

		//spring 설정 파일에 있는 애를 가져와야 하니까 ApplicationContext로
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = context.getBean("execute", CustomerService.class); //biz실행되기 전에 가로채기! -> execute로 수정
		cs.printName();
		cs.printEmail();
	} 
	
}
