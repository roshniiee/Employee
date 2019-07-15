/*package service;

public interface EmployeeServiceImpl {

}
*/
package service;

import java.util.HashMap;

import dto.Employee;
import exception.EmployeeException;

public interface EmployeeServiceImpl
{
	 public void insertEmployee(Employee emp);

     // public HashMap<Integer,Employee>getAllEmployees() throws EmployeeException;

      public Employee getEmployeeById(int id)throws EmployeeException;
}
