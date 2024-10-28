package model;

import lib_genericP65v0.generic;

public class person {
	private generic<String,Integer>dt_p;
	
	public person() {
		dt_p=new generic<>("","",0,0);
	}
	public person(String name,int age,int dni,String email) {
		dt_p=new generic<>(name,email,age,dni);
	}
	public String getName() {
		return dt_p.getAttribute1();
	}
	public void setName(String name) {
		dt_p.setAttribute1(name);
	}
	public int getAge() {
		return dt_p.getAttribute3();
	}
	public void setAge(int age) {
		dt_p.setAttribute3(Integer.valueOf(age));
	}
	public int getDni() {
		return dt_p.getAttribute4();
	}
	public void setDni(int dni) {
		dt_p.setAttribute4(Integer.valueOf(dni));
	}
	public String getEmail() {
		return dt_p.getAttribute2();
	}
	public void setEmail(String email) {
		dt_p.setAttribute2(email);
	}
	public String toString() {
		return String.format("%s;%d;%d;%s", getName(),getAge(),getDni(),getEmail());
	}

}
