package refelect.sex类加载器;
//自定义类        一定要在classPath中
class Member {
	@Override
	public String toString() {
		return "Member6666";
	}
}

public class TestDemo {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Member.class;
		System.out.println(cls.getClassLoader());
		System.out.println(cls.getClassLoader().getParent());
		System.out.println(cls.getClassLoader().getParent().getParent());
		
		//了解类加载器(系统的)    ----  比较啰嗦
		System.out.println(Class.forName("refelect.sex类加载器.Member")
						.getClassLoader().loadClass("refelect.sex类加载器.Member").newInstance());
	}
}
