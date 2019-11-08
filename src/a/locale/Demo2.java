package a.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class Demo2 {
	public static void main(String[] args) {
		//获取本地locale
		//Locale.getDefault();
		Locale locale = new Locale("zh","CN");
		//Locale locale = new Locale("en","US");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("a.locale.Message", locale);
		System.out.println(resourceBundle.getString("msg.info"));
		
		//运行发现：指定了国家区域信息后     读取到的数据应该是Message_zh_CN.properties文件中的内容(这里设置的是中国locale)
		
		//说明：
			//如果已经给出了具体的语言的资源信息，原有的Message.properties就没有任何用处了
	}

}
