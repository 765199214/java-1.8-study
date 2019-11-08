package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestOracle {
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:supermarket";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	
	public static void main(String[] args) throws Exception {
		//启动一个java程序   ----  就是一个进程  --- 容器
		//进行数据库驱动的加载  并加载至容器中
		Class.forName(DRIVER);//容器就是一个主线程
		//通过DriverManager类  取得连接对象
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println(conn);
		conn.close();
	}
}
