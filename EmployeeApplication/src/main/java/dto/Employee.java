/*package dto;

public class Employee {

	public int empId;
	public String empName;
	public int empSal;
	
	public int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId=empId;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName=empName;
	}
	public int getempSal() {
		return empSal;
	}
	public void setempSal(int empSal) {
		this.empSal=empSal;
	}
	public Employee(int empId,String empName,int empSal)
	{
	    this.empId=empId;
	    this.empName=empName;
	    this.empSal=empSal;
	}
	//public getters and setters
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

    // public 3 argument constructor in the order empId,empName,empSal
}
*/
package dto;

public class Employee {

	public int empId;
	public String empName;
	public int empSal;
	
	public int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId=empId;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName=empName;
	}
	public int getempSal() {
		return empSal;
	}
	public void setempSal(int empSal) {
		this.empSal=empSal;
	}
	public Employee(int empId,String empName,int empSal)
	{
	    this.empId=empId;
	    this.empName=empName;
	    this.empSal=empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	//public getters and setters

    // public 3 argument constructor in the order empId,empName,empSal
}
