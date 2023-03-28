package com.hibernate.studentmgt.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	//import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.CascadeType;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;
	@Entity
	@Table(name="Stu")
	public class Student 
	{
	  
	@Id
	 // @GeneratedValue
	  @Column(name="s_id" )
	  private int sid;
	  @Column(name="s_name",nullable=false,length=30)
	  private String sname;
	  @Column(name="s_contact",nullable=false,length=10,unique=true)
	  private String contact;
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "aid")
	  private Address address;
	  public Student() {
			
		}
	  public Student(int sid, String sname, String contact,Address address) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.contact = contact;
			this.address= address;
		}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
//	public Student(String sname, String contact) {
//		super();
//		this.sname = sname;
//		this.contact = contact;
	//}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", contact=" + contact + ", address=" + address + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	  
	}


