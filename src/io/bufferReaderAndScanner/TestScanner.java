package io.bufferReaderAndScanner;

import java.util.Scanner;

/**
 * Scanner是一个专门进行输入流处理的类
 * @author 76519
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//实例一
		/*System.out.print("请输入信息：");
		if(scanner.hasNext()) {//如果有输入的内容     ----   hasNext()不判断空字符串
			System.out.println("输入的信息为："+scanner.next());
		}*/
		
		//实例二    ---- 可以接收各种类型
		/*System.out.println("请输入年龄：");
		if(scanner.hasNextInt()) {
			//接受的数据类型  就是  int
			int age = scanner.nextInt();
			System.out.println("接收到的年龄数据："+age);
		}else {
			//能够自动的判断输入的数据类型
			System.out.println("输入的不是数字");
		}*/
		
		//实例三    -----   对接收的数据类型使用正则表达式进行判断
		System.out.println("请输入生日：");
		if(scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")) {//java正则表达式    \\转义-->\
			//String birthday = scanner.next();
			String birthday = scanner.next("\\d{4}-\\d{2}-\\d{2}");
			System.out.println("--->"+birthday);
		}else {
			System.out.println("不合规范");
		}
		
		scanner.close();
	}
}
