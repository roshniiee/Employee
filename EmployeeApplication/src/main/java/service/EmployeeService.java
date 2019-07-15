/*package service;

import dao.EmployeeDao;
import dto.Employee;
import exception.EmployeeException;

public class EmployeeService {
	 EmployeeDao daoobj=new EmployeeDao();
	public Employee getEmployeeById(int id) throws EmployeeException {
		   Employee e= daoobj.getEmployeeById(id);
	         return e;
		
		
		// TODO Auto-generated method stub
		
	}

	public void insertEmployee(Employee emp)throws EmployeeException {
		daoobj.insertEmployee(emp);
		// TODO Auto-generated method stub
		
	}

}
*/package service;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

import dao.*;

import dto.Employee;
import exception.EmployeeException;


public class EmployeeService implements EmployeeServiceImpl{	
    EmployeeDao daoobj=new EmployeeDao();
    Scanner sc=new Scanner(System.in);
     public void insertEmployee(Employee emp){
         
         
         daoobj.insertEmployee(emp);
         
     }
     
     
     
     

      public HashMap<Integer,Employee>getAllEmployees() throws EmployeeException{
    	  daoobj.getAllEmployees();
		return null;
          
          
      }

      
      
      
      
      
      
      
      
      
      
      
      public Employee getEmployeeById(int id)throws EmployeeException{
         Employee e= daoobj.getEmployeeById(id);
         return e;
          
      }


	//Method to validate employee name
   /* public boolean isEmpNameValid(String empName){
        
        
    }*/
   

    //Method to validate employee salary
   /* public boolean isEmpSalValid(int empSal){ 
        	while(true) {
			if(empSal>0)
           {
				return empSal;
			}
			else 
			{
				System.out.println("Salary should be greater than zero");
				System.out.println("Enter again: ");
				empSal = sc.nextInt();
			}
		
		return empSal;
		
      
        }*/
      public boolean isEmpSalValid(int empSal){ 
  	while(true) {
		if(empSal>0)
     {
			return true;
		}
		else 
		{
			System.out.println("Salary should be greater than zero");
			System.out.println("Enter again: ");
			empSal = sc.nextInt();
		}
	
	
	

  }
      }
      public boolean isEmpNameValid(String empName){
    		while(true) 
    		{
    			if(empName.length()>=3 && Character.isUpperCase(empName.charAt(0)) )
    	     {
    				return true;
    			}
    			else 
    			{
    				System.out.println("Invalid Name");
    				System.out.println("Enter again: ");
    			    empName = sc.next();
    			}
    		
      }
      }
}