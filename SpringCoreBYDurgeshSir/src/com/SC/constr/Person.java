package com.SC.constr;

public class Person {
private String name;
private int  personid;
private Cirtificate certi;
 public Person(String name, int personid ,Cirtificate certi) {
	 this.name=name;
	 this.personid=personid;
	 this.certi=certi;
 }
public String toString() {
	return this.name+":"+this.personid+"{"+this.certi.name+"}";
}
}
