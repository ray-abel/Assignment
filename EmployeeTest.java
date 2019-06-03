public class EmployeeTest{
    public static void main(String [] args){

        Employee emp = new Employee("tola", "sam", 1000.00 );
        Employee emp1 = new Employee("lola", "ray", 0.00 );

        double r = (0.1 * emp.getSalary()) + emp.getSalary();
        double p = (0.1 * emp1.getSalary()) + emp1.getSalary();

        
        System.out.println(emp.getFirstName() + " "+ emp.getLastName() + " yearly salary is: " + (emp.getSalary() * 12));
        System.out.println(emp1.getFirstName() + " "+ emp1.getLastName() + " yearly salary is: " + (emp1.getSalary() * 12));
        System.out.println();
        System.out.println(emp.getFirstName() + " "+ emp.getLastName() + " 10% raise yearly salary is: " + (r * 12));
        System.out.println(emp1.getFirstName() + " "+ emp1.getLastName() + " 10% raise yearly salary is: " + (p * 12));




    }
}