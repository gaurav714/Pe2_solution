package com.stackroute.Pe2;

class Member{
	protected String name="";
	protected int age;
	protected double salary;
	
}
public class MemberVariable {
	Member m=new Member();
	MemberVariable(String name,int age, double salary)
	{
		m.name=name;
		m.age=age;
		m.salary=salary;
		
	}
	public String getValues() {
		String result=m.name+" "+m.age+" "+m.salary;
		return result;
	}

}

