package com.hibernate.studentmgt.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.studentmgt.entity.Address;
import com.hibernate.studentmgt.dao.StudentDAO;
import com.hibernate.studentmgt.entity.Student;
import com.hibernate.studentmgt.util.HiberUtil;

public class StudentDAOimpl implements StudentDAO{
	
		
		HiberUtil hu=new HiberUtil();
		Session session=hu.getSession();
		
		@Override
		public void insertStudent(int sid,String sname,String contact,Address address) {
			Transaction tx=session.beginTransaction();
			Student stu=new Student(sid,sname,contact,address);
			//stu.setAddress(address);
			 session.save(stu);
			tx.commit();
		     System.out.println("Record inserted successfully....");
		}

		

		@Override
		public void updateStudent(int sid,String sname,String contact,Address address) {
			Student stu=getStudent(sid);
			stu.setSname(sname);
			stu.setContact(contact);
			stu.setAddress(address);
			Transaction tx=session.beginTransaction();
			
			session.update(stu);
			tx.commit();
			System.out.println("Updated Successfully....");
			
		}
		@Override
		public Student getStudent(int sid) {
			
			return session.get(Student.class, sid);
			
		}


			
		@Override
		public void deleteStudent(int sid) {
			Student stu=session.get(Student.class,sid);
			Transaction tx=session.beginTransaction();
			session.delete(stu);
			tx.commit();
		}


	}