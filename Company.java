import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Manager();
        ((Manager) employees[0]).setNumberOfSubordinates(0);
        employees[0].setSalary(7500);

        employees[1] = new Worker();
        employees[4] = new Worker();

        int nonManagersCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagersCount++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(nonManagersCount);
        employees[0].setSalary(7500);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                if (i == 0) {
                    employees[i] = new Manager();
                    ((Manager) employees[i]).setNumberOfSubordinates(nonManagersCount);
                    employees[i].setSalary(7500);
                }

                else if (i == 1 || i == 4) {
                    employees[i] = new Worker();
                } else {
                    employees[i] = new Employee();

                }

            }
        }

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(nonManagersCount);
                employee.setSalary(7500);

            }
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}