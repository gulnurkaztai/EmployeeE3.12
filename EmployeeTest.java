public class EmployeeTest {
    
    public static void main(String[] args){
        Employee employee1 = new Employee("Harry", 50000);
        System.out.println("Initial salary is " + employee1.getSalary());
        employee1.raiseSalary(10);
        System.out.println("Expected salary after a raise is 55000.0");
        System.out.println(employee1.getName()+"'s salary is now "+ employee1.getSalary()+" after a raise");
    }
}
