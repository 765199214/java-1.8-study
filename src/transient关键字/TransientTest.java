package transient关键字;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
	public static void main(String[] args) {
		//User 必须进行   实现  序列化操作  ---->java.io.NotSerializableException
		User user = new User();
		user.setUsername("香蕉");
		user.setPasswd("123456");
		
		System.out.println("测试前");
		System.out.println("username: " + user.getUsername());
        System.err.println("password: " + user.getPasswd());
        
        //将对象信息写入至   磁盘文件中      ----  对象必须进行实现Serizable接口
        try {
			ObjectOutputStream outputStream = new ObjectOutputStream(
						new FileOutputStream("D:"+File.separator+"user.txt"));
			outputStream.writeObject(user);
			outputStream.flush();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        //将磁盘文件信息读取出来
        try {
			ObjectInputStream is = new ObjectInputStream(
							new FileInputStream("D:"+File.separator+"user.txt"));
			user = (User) is.readObject();
			is.close();
			
			System.out.println("\nread after Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.err.println("password: " + user.getPasswd());

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
        
        
	}
}
