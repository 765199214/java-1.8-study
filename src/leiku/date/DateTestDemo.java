package leiku.date;

import java.util.Date;

public class DateTestDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		
		long time1 = System.currentTimeMillis();
		long time2 = new Date().getTime();
		System.out.println(time1 +" \n"+time2);
	}

}
