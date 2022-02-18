package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Emp2", 20);
        Employee emp2 = new Employee("Emp4", 21);
        Employee emp3 = new Employee("Emp1", 22);
        Employee emp4 = new Employee("Emp5", 23);
        Employee emp5 = new Employee("Emp3", 24);

        final List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(employeeList, (x, y) -> x.getName().compareTo(y.getName()));

        System.out.println("After Sorting Employees");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
