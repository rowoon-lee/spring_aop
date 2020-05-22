package spring_aop09_anno_HW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class CheckTime_AspectJ {
	
	@Pointcut("execution (public * fire())")
	public void pointcut() {}
	
	@Around("pointcut()")
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable{
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD - hh:mm:ss");
		
		//ProceedingJoinPoint는 aop : around만 지원한다
		
		String useTime = sdf.format(d);
		
		String path = "C:\\Users\\goott7-6\\Downloads\\log\\weapon3.txt";
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(f);
		pw.println(useTime + " : 무기 사용 시각");
		pw.flush();
		pw.close();
			
		return obj;
	}
}
