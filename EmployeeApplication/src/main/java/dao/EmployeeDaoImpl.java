/*package dao;

public interface EmployeeDaoImpl {

}
*/
package dao;

import java.util.HashMap;

import dto.Employee;
import exception.EmployeeException;



public interface EmployeeDaoImpl {

 

      public void insertEmployee(Employee emp);

     // public HashMap<Integer,Employee>getAllEmployees() throws EmployeeException;

      public Employee getEmployeeById(int id)throws EmployeeException;

     

}


