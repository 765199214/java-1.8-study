package cn.shuzu;
/**
 * 泛型数组
 * @author 76519
 *
 * @param <T>
 */
public class TestArray<T> {
	private T[] array;

	public TestArray(int size) {
		this.array = (T[]) new Object[size];
	}
}
