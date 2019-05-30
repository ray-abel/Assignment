public class Employee {

private String firstName;
private String lastName;
private double salary;

public Employee(String fName, String lName, double sal)
{
firstName=fName;
lastName=lName;
salary=sal;

if(sal <0.0)
{
sal=0.0;
}
} 

// 
public void setFirstName(String fName)
{
firstName=fName; 
} 

public void setLastName(String lName)
{
lastName=lName;
} 

public void setSalary (double sal)
{
salary=sal;
}


public String getFirstName()
{
return firstName;
} 

public String getLastName()
{
return lastName;
} 

public double getSalary()
{
return salary;
} 
}