import java.io.File;
import java.io.FileInputStream;

public class TestDemo {
	public static void main(String[] args) {
		File f;
		FileInputStream ft;
		int a = 300;
		assert (a == 200) :"error";
		System.out.println(a);
		
		/*System.out.printf("姓名:%s", "香蕉\n");
		System.out.printf("年龄:%d", 20);
		System.out.printf("工资:%2.2f",3000.258);*/
	}
}
