package leiku.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		String str = "yyyy-MM-dd HH:mm:ss.SSS";
		//当前时间对象
		Date date = new Date();
		//定义转换类  同时设置模板
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		
		//将日期格式化处理 
		String ss = sdf.format(date);
		System.out.println(ss);
	}
}
