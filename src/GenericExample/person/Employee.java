/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericExample.person;

/**
 *
 * @author Producer
 */
public class Employee {
    String fName;
    String lName;
    String employeeId;

    public Employee(String fName, String lName, String employeeId) {
        this.fName = fName;
        this.lName = lName;
        this.employeeId = employeeId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    @Override
    public String toString()
    {
        return "Employee: "+ fName+" "+lName+" "+employeeId;
    }
    
}
