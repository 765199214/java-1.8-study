package tree;

public interface ITree {
	// 查找节点
	public Node find(Object key);

	// 插入新节点
	public boolean insert(Object key);

	// 删除节点
	public boolean delete(Object key);
}
