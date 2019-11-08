package jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 增加
 * @author 76519
 *
 */
public class TestMysql3 {
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
		String sql = " insert into users (userId,userName,accountName,userPwd,userAge,createTime) values (?,?,?,?,?,?) ";
		// 根据conn接口 获取 操作数据库的对象
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 传入操作条件信息 ----- 下标从1开始
		pstmt.setInt(1, 0);//对于自增的主键    输入null  或  0   或sql语句不带userId项
		pstmt.setString(2, "马云");
		pstmt.setString(3, "mayun");
		pstmt.setString(4, "123456");
		pstmt.setInt(5, 33);
		//最为注意的一点    时间的格式
		//pstmt.setDate中的Date参数是java.sql.Date，----- 实例化一个java.sql.Date的对象   需要使用其构造方法   public Date(long date) 
		//===  long类型   从java.util.Date类中可以通过实例化后获取getTime()取得
		pstmt.setDate(6, new java.sql.Date(new java.util.Date().getTime()));
		//设置值后  需要执行操作
		System.out.println(pstmt.executeUpdate());
		
		// 资源使用类型 需要对其操作完成后 进行关闭操作
		pstmt.close();
		conn.close();
	}
}
