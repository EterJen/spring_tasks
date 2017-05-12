package pers.eter.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ShowTime {
	public static void showTime01() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
	}
	
	@Scheduled(cron="0/5 * * * * ?")
	public static void showTime02() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"+"通过注解").format(new Date()));
	}
}
