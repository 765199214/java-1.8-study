package refelect.sex类加载器.自定义类加载器;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 自定义一个类加载器 必须继承 java.lang.ClassLoader
 * 
 * @author 76519
 *
 */
class MyClassLoader extends ClassLoader {
	/**
	 * 实现一个自定义的类加载器的操作，传入类的名称后，要通过指定的文件路径进行加载
	 * 
	 * @param className
	 *            类的名称
	 * @return 返回类的Class对象
	 * @throws Exception
	 */
	public Class<?> loadData(String className) throws Exception {
		// 调用自己的私有方法 获取读取到的二进制数据
		byte[] classData = this.loadClassData();
		// 调用 父类 中的defindClass 实现 ClassLoader类的定义加载
		return super.defineClass(className, classData, 0, classData.length);
	}

	/**
	 * 通过指定的文件路径进行类的文件加载，就是进行二进制读取
	 * 
	 * @return 类文件数据
	 * @throws Exception
	 */
	private byte[] loadClassData() throws Exception {
		// 要操作文件 就需要流去读文件数据
		// InputStream inputStream = new FileInputStream(
		//new File("D:"+File.separator+"Member.class"));
		// 此处代码等效于上面代码-----------没有new File(...) 他有重载操作 可以不需要写new File()
		InputStream inputStream = new FileInputStream("D:" + File.separator + "Member.class");

		// 读取文件信息 但不知道文件的具体大小 -- 可以使用内存流进行读取
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();// 可以有一个方法取得所有的字节内容

		// 定义读取缓冲区
		byte[] data = new byte[20];
		int temp = 0;
		while ((temp = inputStream.read(data)) != -1) {
			byteArrayOutputStream.write(data, 0, temp);
		}
		// 写返回的数据
		byte[] ret = byteArrayOutputStream.toByteArray();// 这就是内存输出流的方法
		byteArrayOutputStream.close();
		inputStream.close();
		return ret;
	}
}

/**
 * 读取其他磁盘中的指定的class文件-----动态实现类的加载处理操作      -----  一般而言用不到   只作为了解
 * 
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) throws Exception {
		//类的全路径       缩减       refelect.sex类加载器.TestDemo   的代码流程
		Class<?> cls = new MyClassLoader().loadData("cn.mldn.vo.Member");
		//System.out.println(cls.newInstance());
		System.out.println("1-->"+cls.getClassLoader());
		System.out.println("2-->"+cls.getClassLoader().getParent());
		System.out.println("3-->"+cls.getClassLoader().getParent().getParent());
	}
}
