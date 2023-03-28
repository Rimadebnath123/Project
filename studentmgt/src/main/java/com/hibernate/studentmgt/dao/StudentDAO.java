package com.hibernate.studentmgt.dao;


	import com.hibernate.studentmgt.entity.Student;
	import com.hibernate.studentmgt.entity.Address;
	public interface StudentDAO {
		
		
		public Student getStudent(int sid);
		public void deleteStudent(int sid);
		public void updateStudent(int sid, String name, String contact,Address address);
		public void insertStudent(int sid,String name, String contact,Address address);
	}


