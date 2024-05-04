public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
        }

        System.out.println(employees[3]);

        employees[3].setSalary(2000);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
