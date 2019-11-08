package a.locale.two;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo2 {
	public static void main(String[] args) {
		//获取本地locale
		Locale locale = Locale.getDefault();
		ResourceBundle resourceBundle = ResourceBundle.getBundle("a.locale.two.Message", locale);
		String msg = resourceBundle.getString("msg.info");
		System.out.println(MessageFormat.format(msg, "张三"));//武汉,张三，{1}，{2}，欢迎您！
		System.out.println(MessageFormat.format(msg, "张三","李四","王五"));
	}

}
