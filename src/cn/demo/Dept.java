package cn.demo;
/**
 * 部门信息表
 * @author Administrator
 *
 */
public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	
	//所有的雇员
	private Emp[] emps;
	

	public Emp[] getEmps() {
		return emps;
	}

	public void setEmps(Emp[] emps) {
		this.emps = emps;
	}
	
	

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getInfo() {
		return "[dept] deptno=" + this.deptno + ",dname=" + this.dname + ",loc=" + this.loc;
	}

	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
}
