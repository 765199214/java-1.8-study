package jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * preparedStatement写in
 * @author 76519
 *
 */
public class TestMysql4 {
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://127.0.0.1:3306/supermarket";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args) throws Exception {
		Object[] intArray = new Object[] {"1","3","4","5","7",9};
		// 数据库驱动加载至容器中 --- 容器：一个java项目的进程就是一个容器
		Class.forName(DRIVER);
		// 通过 DriverManager 类取得连接对象
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println(conn);
		//查询sql
		String sql = " select userId,userName,accountName,userPwd,userAge,createTime from users "
				+ " where userId in (?) ";
		/*String s = String.join(",",sb.toString()).trim();
		System.out.println(s);
		String newSql = String.format(sql.replace("?", "%s"), s);*/
		String newSql = String.format(sql.replace("?", "%s"), getStringFromArray(intArray));
		PreparedStatement pstmt = conn.prepareStatement(newSql);
		System.out.println(pstmt.toString());
		// 获取查询的结果集
		ResultSet resultSet = pstmt.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
		}

		// 资源使用类型 需要对其操作完成后 进行关闭操作
		pstmt.close();
		conn.close();
	}
	
	public static String getStringFromArray(Object ... objects ) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < objects.length; i++) {
			if(i == objects.length - 1) {
				sb.append(objects[i]);
			}else {
				sb.append(objects[i]).append(",");
			}
		}
		return sb.toString().trim();
	}
}
