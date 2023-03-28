package com.hibernate.studentmgt;


	import  com.hibernate.studentmgt.dao.StudentDAO;
	import com.hibernate.studentmgt.daoimpl.StudentDAOimpl;
	import com.hibernate.studentmgt.entity.Student;

	import java.util.Scanner;
	import com.hibernate.studentmgt.entity.Address;
	
	public class App4 
	{
	    public static void main( String[] args )
	    {
	    	StudentDAO sdao=new StudentDAOimpl();
	    	
	        System.out.println("1. Create :");
	    	System.out.println("2.  Delete :");
	    	System.out.println("3. update :");
	    	System.out.println("4. Retrieve :");
	    	System.out.println("5. Exit");
	    	
	    	int k;
				 do{
						System.out.println("Enter your Choice :");
						Scanner sc=new Scanner(System.in);
						
						int input = sc.nextInt();
						switch (input) {
						//create
						case 1:
							System.out.println("Enter  Id ");
							int sid=sc.nextInt();
							System.out.println("Enter name: ");
							String sname=sc.next();
							System.out.println("Enter contact: ");
							String contact=sc.next();
							System.out.println("Enter the house no:");
				    		int hno=sc.nextInt();
				    		System.out.println("Enter the City name:");
				    		String city=sc.next();
				    		System.out.println("Enter the State:");
				    		String state=sc.next();
				    		System.out.println("Enter the Pin code:");
				    		String pin=sc.next();
				  
							Address add=new Address(hno, city, state,pin );
							sdao.insertStudent(sid,sname,contact,add);
							System.out.println("Reord insert successfully...");
							break;
							//delete
						case 2:
							System.out.println("Enter Id ");
							 sid=sc.nextInt();
							 sdao.deleteStudent(sid);
						System.out.println("Reord deleted successfully...");
						break;
							
							//update
						case 3:
							System.out.println("Enter Id: ");
							 sid=sc.nextInt();
							System.out.println("Enter name: ");
							 sname=sc.next();
							System.out.println("Enter contact: ");
							contact=sc.next();
							System.out.println("Enter the house no:");
				    		 hno=sc.nextInt();
				    		System.out.println("Enter the City name:");
				    		 city=sc.next();
				    		System.out.println("Enter the State:");
				    		 state=sc.next();
				    		System.out.println("Enter the Pin code:");
				    		 pin=sc.next(); 
							 add=new Address(hno, city, state,pin );
							sdao.updateStudent(sid,sname,contact,add);
							 break;
						//retrieve
						case 4: 
							System.out.println("Enter Student Id ");
							sid=sc.nextInt();
							System.out.println(sdao.getStudent(sid));
							break;
						case 5: 
							System.exit(0);
						}
						System.out.println("Do you want to continue?(1/0): ");
						 k=sc.nextInt();
				    	}
						while(k==1);
				  
		
				        
				        }
				    }
