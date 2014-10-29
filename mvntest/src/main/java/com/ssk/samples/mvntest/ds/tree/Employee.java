package com.ssk.samples.mvntest.ds.tree;

import com.ssk.samples.mvntest.ds.stack.LinkedStack;

public class Employee implements Comparable{

	int id;
	String fname;
	String lname;
	int parentId;
	
	public Employee(int id,String fname,String lname,int parentId){
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.parentId = parentId;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	

	public int compareTo(Object o) {
		if(this.id==((Employee)o).id){
			return 0;
		}else{
			return -1;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"A","B",100);
		Employee e2 = new Employee(102,"P","S",101);
		Employee e3 = new Employee(103,"B","T",101);
		Employee e4 = new Employee(104,"C","R",103);
		Employee e5 = new Employee(105,"S","T",103);
		Employee e6 = new Employee(106,"K","K",104);
		Employee e7 = new Employee(107,"S","S",105);
		
		TreeNode<Employee> cio = new TreeNode<Employee>(e1);
		
		TreeNode<Employee> s1 = new TreeNode<Employee>(e2);
		cio.addChild(s1);
		TreeNode<Employee> d1 = new TreeNode<Employee>(e3);
		cio.addChild(d1);
		TreeNode<Employee> m1 = new TreeNode<Employee>(e4);
		d1.addChild(m1);
		TreeNode<Employee> m2 = new TreeNode<Employee>(e5);
		d1.addChild(m2);
		TreeNode<Employee> i1 = new TreeNode<Employee>(e6);
		m1.addChild(i1);
		TreeNode<Employee> i2 = new TreeNode<Employee>(e7);
		m2.addChild(i2);
		
		TreeUtil<Employee> util = new TreeUtil<Employee>();
		LinkedStack<Employee> hierarchy = new LinkedStack<Employee>();
		util.depthFirstSearch(cio, e7, hierarchy);
		while(hierarchy.topValue()!=null){
			Employee e = hierarchy.pop();
			System.out.print(e.fname+", "+e.lname+"-->");
		}
	}
	
}
