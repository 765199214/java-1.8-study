package tree;

/**
 * 二叉树的节点类
 * @author 76519
 *
 */
public class Node {
	private Object data;//节点数据
	private Node leftChild;//左子节点的引用
	private Node rightChild;//右子节点的引用
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	public Node(Object data, Node leftChild, Node rightChild) {
		super();
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	public Node() {
		super();
	}
	
	
}
