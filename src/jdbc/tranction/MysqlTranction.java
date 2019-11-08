package jdbc.tranction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

/**
 * 数据库事务   ----   最好实验的是Statement(了解事务)
 * @author 76519
 *
 */
public class MysqlTranction {
	static final String Driver = "com.mysql.jdbc.Driver";
	static final String Url = "jdbc:mysql://127.0.0.1:3306/supermarket";
	static final String Username = "root";
	static final String Password = "root";
	
	public static void main(String[] args) throws Exception {
		//每个进程都是一个容器   这里将 驱动信息   加载至容器中
		Class.forName(Driver);
		//获取连接对象
		Connection conn = DriverManager.getConnection(Url, Username, Password);
		//Connection默认的是自动提交操作,这样会导致-----如果出现异常，异常操作前的执行会成功写入数据库    异常后的不会继续执行，如果同属一个业务流程，这就乱了
		//要么一起成功   要么一起失败
		
		conn.setAutoCommit(false);//关闭自动提交
		
		try {
			System.out.println("try执行");
			String sql = " INSERT INTO USERS (userName,accountName,userPwd) VALUES (?,?,?) ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < 10; i++) {
				if( i == 3) {
					pstmt.setString(1, "mldn-"+(50+i));
					pstmt.setString(5, "香蕉"+(50+i)+"号");//小标改成错误的
					pstmt.setLong(3, 123456789);
				}else {
					pstmt.setString(1, "mldn-"+(50+i));
					pstmt.setString(2, "香蕉"+(50+i)+"号");
					pstmt.setLong(3, 123456789);
				}
				pstmt.addBatch();//将操作追加到批处理中
			}
			//执行批处理
			int[] num = pstmt.executeBatch();
			System.out.println(Arrays.toString(num));
			//执行到这   应该是没有出错的  -----  进行事务的提交操作
			conn.commit();
		} catch (Exception e) {
			System.out.println("获取异常");
			e.printStackTrace();
			//只要发现异常  就进行回滚操作  ----  一起失败
			conn.rollback();
		} finally {
			//不管是否有异常出现  都需要关闭连接
			if(conn != null) {
				conn.close();
			}
			System.out.println("final执行");
		}
	}
}
