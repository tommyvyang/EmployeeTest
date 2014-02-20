/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeetest;

/**
 * CSCI 2001-51
 * 3.14 Employee Class Assignment
 * 
 * Class Employee to be used in application EmployeeTest.
 * Employee will have first and last name as well as a monthly salary.
 * 
 * @author Kou Xiong
 */
public class Employee
{
    String firstName,   // employee's first name
            lastName;   // employee's last name
    double salary;  // employee's monthly salary
    
    
    public Employee( String _firstName, String _lastName, double _salary)
    {
        firstName = _firstName;
        lastName = _lastName;
        if ( _salary > 0)
            salary = _salary;
    } // end of Employee constructor
    
    public Employee()
    {
        // empty constructor
    } // end of empty constructor
    
    public void setFirstName( String name )
    {
        firstName = name;
    } // end of setFirstName
    
    public void setLastName( String name )
    {
        lastName = name;
    } // end of setLastName
    
    public void setSalary( double _salary )
    {
        if ( _salary > 0)
            salary = _salary;
    } // end of setMonthlySal
    
    public String getFirstName()
    {
        return firstName;
    } // end of getFirstName
    
    public String getLastName()
    {
        return lastName;
    } // end of getLastName
    
    public double getSalary()
    {
        return salary;
    } // end of getMonthlySal
}
