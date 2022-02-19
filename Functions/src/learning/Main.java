package learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Emp1 L1", 20);
        Employee emp2 = new Employee("Emp2 L2", 21);
        Employee emp3 = new Employee("Emp3 L3", 22);
        Employee emp4 = new Employee("Emp4 L4", 23);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp3);
        employeeList.add(emp1);
        employeeList.add(emp4);
        employeeList.add(emp2);

        employeeList.sort(Comparator.comparing(Employee::getName));

        printEmployees(employeeList, "Employee with age greater than 21",
                employee -> employee.getAge() > 21);
        printEmployees(employeeList, "Employees with age less than or equal to 21",
                employee -> employee.getAge() <= 21);

        System.out.println("***********************************");

        Function<Employee, String> getLastName = employee ->
                employee.getName()
                        .substring(employee.getName().indexOf(" ") + 1);

        Function<Employee, String> getFirstName = employee ->
                employee.getName()
                        .substring(0, employee.getName().indexOf(" "));

        System.out.println(getName(getFirstName, employeeList.get(1)));
        System.out.println(getName(getLastName, employeeList.get(1)));
    }

    private static String getName(Function<Employee, String> getname, Employee employee) {
        return getname.apply(employee);
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
