package jihemap.自定义map参数类型;

import java.util.HashMap;
import java.util.Map;

class Persion{
	private String userName;
	public Persion(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persion other = (Persion) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	
}
/**
 * 自定义map集合的key的参数类型    需要对自定义的类  覆写hashCode()和equals()
 * 一般情况下直接使用integer或者String  是因为这些类已经覆写了上述的两种方法
 * @author 76519
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		Map<Persion, String> map = new HashMap<Persion, String>();
		map.put(new Persion("香蕉"), "不拿拿");
		System.out.println(map.get(new Persion("香蕉")));
		//如果不覆写equals()和hashCde()，运行此代码返回为null  ------   必须覆写Object类的equals()和hashCode()
	}
}
