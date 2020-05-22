package spring_aop07_aopHW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime_AspectJ {
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd - hh:mm:ss");
		String useTime = sdf.format(d);
		
		String path = "C:\\Users\\goott7-6\\Downloads\\log\\weapon_AspectJ.txt";
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		double actingTime = sw.getTotalTimeSeconds();
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(f);
		pw.println("무기 사용 시간 : " + useTime);
		pw.println("무기 수행 시간 : " + actingTime);
		pw.flush();
		pw.close();
		
		return obj;
	}

}
