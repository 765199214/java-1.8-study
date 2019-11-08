package jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 分页查询
 * @author 76519
 *
 */
public class TestMysql {
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://127.0.0.1:3306/supermarket";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args) throws Exception {
		// 数据库驱动加载至容器中 --- 容器：一个java项目的进程就是一个容器
		Class.forName(DRIVER);
		// 通过 DriverManager 类取得连接对象
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println(conn);

		// 书写sql语句
		String sql = "select userId,userName,userPwd,userAge from users where userId limit ?,?";
		// 根据conn接口 获取 操作数据库的对象
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 传入操作条件信息 ----- 下标从1开始
		pstmt.setInt(1, 0);
		pstmt.setInt(2, 5);
		
		// 获取查询的结果集
		ResultSet resultSet = pstmt.executeQuery();
		while (resultSet.next()) {
			// resultSet.getString(columnLabel) -- resultSet.getString("age")//按名称取数据
			// resultSet.getString(columnIndex) -- resultSet.getString(4) //按下标取数据

			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
		}

		// 资源使用类型 需要对其操作完成后 进行关闭操作
		pstmt.close();
		conn.close();
	}
}
