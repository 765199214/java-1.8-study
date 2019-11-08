package leiku.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat2 {
	public static void main(String[] args) throws Exception {
		String date = "2018-08-01 20:48:53.059";
		String str = "yyyy-MM-dd HH:mm:ss.SSS";
		
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		Date dates = sdf.parse(date);
		System.out.println(dates);//Wed Aug 01 20:48:53 CST 2018
	}
}
