package spring_aop10_JacaConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//스프링 컨테이너에 bean등록을하기 위한 방법을 xml 대신 자바객체가 그 역할을 수행

@Configuration
@EnableAspectJAutoProxy  //자동으로 찾아줘!(xml에서 <aop:aspectj-autoproxy />)
public class JavaConf {
	
	//메인업무
	@Bean(name = "cs")
	public CustomerServiceImple cs() {
		CustomerServiceImple csi = new CustomerServiceImple();
		csi.setName("갑순이");
		csi.setEmail("soonie@town.com");
		
		return csi;
	}
	
	//advice 객체 선언
	@Bean
	public CheckTime ct() {
		CheckTime ckt = new CheckTime();
		ckt.publicPointcut();
		return ckt;
	}
	
}
