package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMysql {
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://127.0.0.1:3306/supermarket";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";
	
	public static void main(String[] args) throws Exception {
		//数据库驱动加载至容器中      ---  容器：一个java项目的进程就是一个容器
		Class.forName(DRIVER);
		//通过  DriverManager  类取得连接对象  
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println(conn);
		//创建数据库操作对象
		Statement state = conn.createStatement();
		/**
		 * Statement  类可以进行数据库的操作   ：必须接收完整的sql
		 * 第一种：增、删、改     int executeUpdate(String sql) throws SQLException;
		 * 第二种：查询    ResultSet executeQuery(String sql) throws SQLException;
		 */
		
		//添加
		/*String sql = "insert into users(userName,accountName,userPwd,userSex,userAge) "
				+ "values ('香蕉不拿拿','banana',123456,'男',25)";
		int num = state.executeUpdate(sql);
		System.out.println("更改数量："+num);*/
		
		//删除
		/*String sql = "delete from users where userId = 15";
		int num = state.executeUpdate(sql);
		System.out.println("更改数量："+num);*/
		
		//修改
		/*String sql = "update users set userSex = '中' where userId =16";
		int num = state.executeUpdate(sql);
		System.out.println("更改数量："+num);*/
		
		//查询
		String sql = "select userId,userName,accountName,userPwd,userSex,userAge from users";
		//获取到结果集
		ResultSet resultSet = state.executeQuery(sql);
		while(resultSet.next()) {
			//resultSet.getString(columnLabel)   --  resultSet.getString("age")//按名称取数据
			//resultSet.getString(columnIndex)   --  resultSet.getString(4) //按下标取数据
			
			System.out.println(resultSet.getInt(1) +" "+ resultSet.getString(2) + " "+resultSet.getString(3));
		}
		
		//资源使用类型  需要对其操作完成后   进行关闭操作
		state.close();
		conn.close();
	}
}
