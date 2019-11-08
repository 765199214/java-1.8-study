package leiku.arrays.二叉树;

import java.util.Arrays;

/**
 * 实现一个二叉树
 * @author 76519
 *
 */
@SuppressWarnings("rawtypes")
class BinaryTree{
	private class Node{
		
		private Comparable data;//保存数据的操作   为什么要用Comparable  因为必须是Comparable子类，而且需要判断大小
		private Node left;//保存左边节点
		private Node right;//保存右边节点
		
		public Node(Comparable data) {
			this.data = data;
		}
		
		//二叉树  向左边或向右边进行赋值
		@SuppressWarnings("unchecked")
		public void addNode(Node newNode) {
			if(this.data.compareTo(newNode.data) >0) {
				if(this.left == null) {
					this.left = newNode;
				}else {
					this.left.addNode(newNode);
				}
			}else {
				if(this.right == null) {
					this.right = newNode;
				}else {
					this.right.addNode(newNode);
				}
			}
		}
		
		public void toArrayNode() {
			if(this.left != null) {//有左节点
				//不断找到最左边的数据   
				this.left.toArrayNode();
			}
			//打印
			BinaryTree.this.retData[BinaryTree.this.foot++] = this.data;
			if(this.right != null) {
				this.right.toArrayNode();
			}
		}
	}
	//--------------------------------
	private Node root;//任何的数据结构一定要抓住根
	
	//保存个数
	private int count;
	//存数据
	private Object[] retData;//返回数据
	private int foot = 0;//角标
	
	public Object[] toArray() {
		this.foot = 0 ;//角标先清零
		this.retData = new Object[this.count];
		this.root.toArrayNode();
		return this.retData;
	}
	
	
	//创建可以保存数据的方法
	public void add(Object data) {
		if(data == null ) return;
		Node newNode = new Node((Comparable) data);
		
		if(this.root == null) {
			this.root = newNode;
		}else {
			this.root.addNode(newNode);
		}
		this.count++;
	}
	
}
public class TestDemo {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.add("B");
		bt.add("X");
		bt.add("A");
		
		System.out.println(Arrays.toString(bt.toArray()));
	}

}
