package cn.链表.普通操作;
/**
 * 链表工作类：1.存数据  2.指向下一个节点
 * @author Administrator
 *
 */
//只有node类在保存数据的同时  设置数据的先后关系
public class Node {
	private Object data;
	//除了数据之外还需要下一个节点(车厢后面挂的一定还是个车厢)
	private Node next;
	//车厢里面一定要保存有数据
	public Node(Object data) {
		this.data = data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getData() {
		return this.data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return this.next;
	}

}
