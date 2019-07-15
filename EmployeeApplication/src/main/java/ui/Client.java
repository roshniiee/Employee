/*package ui;

import java.util.*;

import dto.Employee;
import exception.EmployeeException;
import service.EmployeeService;




public class Client {
static EmployeeService serviceobj=new EmployeeService();
static Employee empobj;
	public static void main(String[] args) throws EmployeeException 
	{
	    	int ch;
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
	System.out.println(" 1-Add Employee\n 2-Get All Employee Details \n 3-Get Employee By Id \n 4-Exit MENU \n");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
			System.out.println("Enter the id \n");
			int id=sc.nextInt();
			System.out.println("Enter the name \n");
			String name=sc.next();
			System.out.println("Enter the salary \n");
			int salary=sc.nextInt();
		System.out.println("Employee Information stored successfully for "+id);	
		empobj=new Employee(id,name,salary);
		serviceobj.insertEmployee(empobj);
				break;
		
             case 2:
            	
				break;
          case 3:
              System.out.println("Enter id ");
	int eid=sc.nextInt();
	serviceobj.getEmployeeById(eid);
              break;
             case 4:
				System.out.println("END");
				System.exit(0);
			}
			System.out.print("Do you want to continue (y/n)...? : ");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice=='Y')
				continue;
			else {
				System.out.println("Thank You !");
				System.exit(0);
			}
	}while(ch!=3);
		sc.close();

		//implement a menu driven program based on sample input / output shown
	}

}
*/

package ui;

import java.util.*;

import dto.Employee;
import exception.EmployeeException;
import service.*;


public class Client {
static EmployeeService serviceobj=new EmployeeService();
static Employee empobj;
	public static void main(String[] args) throws EmployeeException 
	{
	    	int ch;
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
	System.out.println(" 1-Add Employee\n 2-Get All Employee Details \n 3-Get Employee By Id \n 4-Exit MENU \n");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
			System.out.println("Enter the id \n");
			int id=sc.nextInt();
			System.out.println("Enter the name \n");
			String name=sc.next();
			serviceobj.isEmpNameValid(name);
			System.out.println("Enter the salary \n");
			int salary=sc.nextInt();
		
		serviceobj.isEmpSalValid(salary);
		
		empobj=new Employee(id,name,salary);
		serviceobj.insertEmployee(empobj);
		System.out.println("Employee Information stored successfully for "+id);	
				break;
		
             case 2:
            	serviceobj.getAllEmployees();
				break;
          case 3:
              System.out.println("Enter id ");
	int eid=sc.nextInt();
	serviceobj.getEmployeeById(eid);
              break;
             case 4:
				System.out.println("END");
				System.exit(0);
				break;
             default:
            	
            		System.out.println("Enter correct choice");
            			System.out.println(" 1-Add Employee\n 2-Get All Employee Details \n 3-Get Employee By Id \n 4-Exit MENU \n");
            			System.out.print("Enter your choice : ");
            			ch = sc.nextInt();

            		
            	 
			}
			System.out.print("Do you want to continue (y/n)...? : ");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice=='Y')
				continue;
			else {
				System.out.println("Thank You !");
				System.exit(0);
			}
	}while(ch!=3);
		
		sc.close();

		//implement a menu driven program based on sample input / output shown
	}

}
