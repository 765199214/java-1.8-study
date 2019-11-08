package cn.链表.深层次操作;
//负责链表的操作
//1.在原来的链表中  追加  统计个数
//2.如果现在根元素为null或者保存的元素个数为0  则认为保存的链表为一个空的链表   则isEmpty()返回为true
public class LinkDemo2 {
	
	//将node定义为内部类，表示node只为link服务
	//定义私有  ----》专属
	private class Node{//负责数据与节点关系的匹配
		private Object data;//保存节点数据
		private Node next;//保存下一个节点
		public Node(Object data) {
			this.data = data;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		//第一次调用   this相当于link中的root   Link.root
		//第二次调用   this相当于Link下的root的next  Link.root.next
		//第三次调用   this相当于Link下的root的next下的next  Link.root.next.next
		public void addNode(Node newNode) {//处理节点关系
			if(this.next == null) {//当前节点 下一个为空，表示可以保存 
				this.next = newNode; //<--   (通过下面的this.next.addNode(newNode) 采用递归 依次找到  谁的后面是空   就将对象放在  后面)     
			}else {//现在当前节点的下一个不为空          |
				//采用递归的操作---------------
				this.next.addNode(newNode);
			}
			
		}
	}
	//-----------------以下为link类---------------------
	//1.在原link类中 追加一个保存个数的计数统计
	private int count = 0; //当前的保存个数
	//添加数据之前  首先需要创建一个根节点--->无根节点  无法进行数据的保存
	private Node root;
	//增加数据
	public void add(Object obj) {
		if(obj == null) {//人为追加规定，不允许存放空值
			return;//方法结束
		}
		//如果要想进行数据的保存，那么必须将我们的数据封装在Node的节点类中
		//如果没有封装，则无法确认好节点的先后顺序
		Node newNode = new Node(obj);
		if(this.root == null) {//当前没有根节点
			this.root = newNode;//第一个节点设置为根节点
		}else {
			//不是根节点(根节点已经存在了)
			//this.root.setNext(newNode);
			//应该交给Node去判断谁的节点后面为null  (把此时的节点顺序的处理交给node来完成---》所以node类中需要扩充一个方法实现目的--->addNode)
			this.root.addNode(newNode);
		}
		//个数追加
		this.count ++;
	}
	
	//1.取得保存数据的个数
	public int size() {
		return this.count;
	}
	//2.
	public boolean isEmpty() {
		//判断其中之一都可以   这里为了保险   但 意义不大
		return this.root == null && this.count == 0;
	}
}
