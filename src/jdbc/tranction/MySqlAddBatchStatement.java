package jdbc.tranction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;

/**
 * 使用PreparedStatement实现    数据批处理
 * @author 76519
 *
 */
public class MySqlAddBatchStatement {
	static final String Driver = "com.mysql.jdbc.Driver";
	static final String Url = "jdbc:mysql://127.0.0.1:3306/supermarket";
	static final String UerName = "root";
	static final String PassWord = "root";
	
	public static void main(String[] args) throws Exception {
		Class.forName(Driver);
		Connection conn = DriverManager.getConnection(Url, UerName, PassWord);
		String sql = " INSERT INTO USERS (userName,accountName,userPwd) "
				+ " VALUES ('#username','#accountname','#userpwd') ";
		Statement statement = conn.createStatement();
		
		for (int i = 0; i < 10; i++) {
			//statement的addBatch直接传入的sql语句   
			//使用String.replace  ，将sql中给定的标识符进行转换
			statement.addBatch(sql.replaceFirst("#username", "mldn-"+(10+i))
					.replaceFirst("#accountname", "香蕉"+(10+i)+"号")
					.replaceFirst("#userpwd", "123456789"));
		}
		int[] num = statement.executeBatch();//执行批处理
		System.out.println(Arrays.toString(num));//[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]  只要不全是0就说明有成功
		conn.close();
		
	}
}
