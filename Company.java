import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager();
        ((Manager) employees[0]).setNumberOfSubordinates(0);

        employees[1] = new Worker();
        employees[4] = new Worker();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}