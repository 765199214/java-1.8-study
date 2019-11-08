package cn.链表.普通操作;

public class TestNode {
	public static void main(String[] args) throws Exception{
		//1.封装几个节点
		Node root = new Node("火车头");//假设存放的数据是String
		Node n1 = new Node("车厢A");
		Node n2 = new Node("车厢B");
		Node n3 = new Node("车厢C");
		//2.设置节点的关系
		root.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		
		//递归操作   打印数据(递归-->自己调用自己且有结束条件)
		print(root);
	}
	
	//递归操作   实现信息的全部遍历打印显示
	public static void print(Node node) {
		if(node != null) {
			//表示当前存在有节点
			System.out.println(node.getData());
			//不为空  继续向下取数据
			print(node.getNext());
		}
	}

}
