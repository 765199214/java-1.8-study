package cn.demo;

//实现开大需求
public class Test {
	public static void main(String[] args) {
		//1.设置类  对象间的关系
		Dept dept = new Dept(10, "秘书部", "武汉");
		Emp ea = new Emp(7369, "小吴", "作业员", 5000.0, 0.0);
		Emp eb = new Emp(7566, "小刘", "受理员", 6000.0, 0.0);
		Emp ec = new Emp(7839, "小罗", "管理员", 8000.0, 0.0);
		//设置部门领导的关系
		ea.setMgr(eb);
		eb.setMgr(ec);//ec对象无领导
		//设置部门
		ea.setDept(dept);
		eb.setDept(dept);
		ec.setDept(dept);
		//设置部门  雇员关系
		dept.setEmps(new Emp[] {ea,eb,ec});
		
		//2.数据的取得
		//输出部门信息
		System.out.println(dept.getInfo());
		//部门中的所有雇员
		for (int i = 0; i < dept.getEmps().length; i++) {
			System.out.println("\t|-"+dept.getEmps()[i].getInfo());
			//雇员的领导
			if(dept.getEmps()[i].getMgr() != null) {
				System.out.println("\t\t|-"+dept.getEmps()[i].getMgr().getInfo());
			}
			
		}
	}
}
