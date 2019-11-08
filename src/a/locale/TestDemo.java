package a.locale;

import java.util.ResourceBundle;

public class TestDemo {
	public static void main(String[] args) {
		//文件需要放在classpath下   若放在包中  则需要再文件名称前加上包名
		 ResourceBundle resourceBundle = ResourceBundle.getBundle("a.locale.Message");
		 System.out.println(resourceBundle.getString("msg.info"));
	}
}
