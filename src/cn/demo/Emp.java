package cn.demo;
/**
 * 雇员信息表
 * @author Administrator
 *
 */
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private double sql;
	private double comm;
	
	//描述雇员领导
	private Emp mgr;
	//描述雇员所在部门
	private Dept dept;
	
	public Emp getMgr() {
		return mgr;
	}

	public void setMgr(Emp mgr) {
		this.mgr = mgr;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSql() {
		return sql;
	}

	public void setSql(double sql) {
		this.sql = sql;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public Emp(int empno, String ename, String job, double sql, double comm) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sql = sql;
		this.comm = comm;
	}

	public String getInfo() {
		return "[emp] empno=" + this.empno + ",empname=" + this.ename + ",job=" + this.job + ",sql=" + this.sql
				+ ",comm=" + this.comm;
	}

}
