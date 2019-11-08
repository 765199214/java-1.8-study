package jdbc.tranction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

/**
 * 使用PreparedStatement实现    数据批处理
 * @author 76519
 *
 */
public class MySqlAddBatch {
	static final String Driver = "com.mysql.jdbc.Driver";
	static final String Url = "jdbc:mysql://127.0.0.1:3306/supermarket";
	static final String UerName = "root";
	static final String PassWord = "root";
	
	public static void main(String[] args) throws Exception {
		Class.forName(Driver);
		Connection conn = DriverManager.getConnection(Url, UerName, PassWord);
		String sql = " INSERT INTO USERS (userName,accountName,userPwd) VALUES (?,?,?) ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		for (int i = 0; i < 10; i++) {
			pstmt.setString(1, "mldn-"+i);
			pstmt.setString(2, "香蕉"+i+"号");
			pstmt.setLong(3, 123456789);
			
			pstmt.addBatch();//将操作追加到批处理中(**************)
		}
		
		int[] num = pstmt.executeBatch();//执行批处理(**************)
		
		System.out.println(Arrays.toString(num));//[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]  只要不全是0就说明有成功
		conn.close();
		
		//PreparedStatement 和  Statement都对批处理有好的提升和操作方式
	}
}
