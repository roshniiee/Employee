/*package dao;

import java.util.HashMap;

import dto.Employee;
import exception.EmployeeException;

public class EmployeeDao {
	  private static HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
	public void insertEmployee(Employee emp) {
		 map.put(emp.getempId(),emp);
		// TODO Auto-generated method stub
		
	}
	public Employee getEmployeeById(int id) throws EmployeeException{
		Employee e=map.get(id);
		System.out.println(e);
		return e;
		// TODO Auto-generated method stub
		
	}

}
*/

package dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import dto.Employee;
import exception.EmployeeException;

public class EmployeeDao implements EmployeeDaoImpl {
    private static HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
	
    //Getter and Setter for map   
    public static void setMap(HashMap<Integer,Employee> map)
    {
		EmployeeDao.map=map;
    }  

    public static HashMap<Integer,Employee> getMap()
    {
		return map;
    }  

    public void insertEmployee(Employee emp){
        map.put(emp.getempId(),emp);
        
    }
    
    
     public HashMap<Integer,Employee>getAllEmployees() throws EmployeeException{
    	
    	if(map.isEmpty()) {
    		throw new EmployeeException("No employee found");
    		
    	}
    	else {

    		Set keys=map.keySet();
    		Iterator itr=keys.iterator();
    		int key;
    		Employee value;
    		while(itr.hasNext())
    		{
    			key=(Integer) itr.next();
    			value=map.get(key);
    			System.out.println(key+":"+value);
    		}
    	}
    
    		return null;
    	}
		
    	 
    	
		
    
     
     
     
     
     
     
	public Employee getEmployeeById(int id)throws EmployeeException{
	
		
		Employee e=map.get(id);
		if(map.containsKey(id))
		{
		System.out.println(e);
		}
		else
		{
			throw new EmployeeException("There is no Employee with this ID");
		}
		return e;
		
	    
	}


    //implement interface methods

}
