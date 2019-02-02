package com.bl.DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;
	
	public Employees(){
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list){
		this.empList=list;
	}
	public void LoadData()
	{
		empList.add("Aayush");
		empList.add("aman");
		empList.add("manju");
		empList.add("sudhkar");
		empList.add("rakshit");
		empList.add("Adithiya");
		empList.add("chandrashree");

	}
	public List<String> getEmpList() {
		return empList;
	}
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmpList()){
			temp.add(s);
		}
		return new Employees(temp);
}
}
