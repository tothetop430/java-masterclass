package learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Emp1", 20);
        Employee emp2 = new Employee("Emp2", 21);
        Employee emp3 = new Employee("Emp3", 22);
        Employee emp4 = new Employee("Emp4", 23);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp3);
        employeeList.add(emp1);
        employeeList.add(emp4);
        employeeList.add(emp2);

        employeeList.sort(Comparator.comparing(Employee::getName));

//        printEmployees(employeeList, "Employee with age greater than 21",
//                employee -> employee.getAge() > 21);
//        printEmployees(employeeList, "Employees with age less than or equal to 21",
//                employee -> employee.getAge() <= 21);

        printEmployees(employeeList, "Employee with age greater than 21",
                new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee employee) {
                        return employee.getAge() > 21;
                    }
                });
        printEmployees(employeeList, "Employees with age less than or equal to 21",
                new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee employee) {
                        return employee.getAge() <= 21;
                    }
                });
    }

    private static void printEmployees(List<Employee> list, String msg,
                                       Predicate<Employee> predicate) {
        System.out.println(msg);
        for (Employee employee: list) {
            if (predicate.test(employee)) {
                System.out.println("Employee Name: " + employee.getName());
                System.out.println("Employee Age: " + employee.getAge());
            }
        }
    }
}
