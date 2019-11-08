package cn.链表.深层次操作;

public class LinkTest {
	public static void main(String[] args) {
		//简单的链表结构
		/*Link all = new Link();
		all.add("hello");
		all.add("world");
		all.add("linkpower");*/
		
		//链表结构和其中追加数据个数的统计
		LinkDemo2 all = new LinkDemo2();
		System.out.println(all.size() +"==="+all.isEmpty());//0
		all.add("hello");
		all.add("world");
		all.add("linkpower");
		System.out.println(all.size()+"==="+all.isEmpty());//3
	}
}
