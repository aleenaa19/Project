/* 6.Create a class Employee with id,name,age,gender,department,yearOfJoining,Salary.
6.1 Create employee list by adding details of employees.
6.2 Print the name of all departments in the organization
6.3What is the average age of male and female employees
6.4Get the details of highest paid employee in the organization?
6.5 Count the number of employees in each department?
6.6Separate the employees who are younger or equal to 25 years from
   those employees who are older than 25 years */

package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;

    // Constructor
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', age=" + age + ", gender='" + gender + "', department='" + department + "', yearOfJoining=" + yearOfJoining + ", salary=" + salary + "}";
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {


// 6.1 Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 30, "Female", "HR", 2015, 60000));
        employees.add(new Employee(2, "Bob", 25, "Male", "IT", 2018, 75000));
        employees.add(new Employee(3, "Charlie", 35, "Male", "Finance", 2012, 90000));
        employees.add(new Employee(4, "David", 40, "Male", "HR", 2010, 80000));
        employees.add(new Employee(5, "Eva", 22, "Female", "IT", 2020, 65000));
        employees.add(new Employee(6, "Frank", 28, "Male", "Finance", 2016, 95000));
        employees.add(new Employee(7, "Grace", 23, "Female", "HR", 2019, 62000));

        // 6.2 Print the name of all departments in the organization
        System.out.println("Departments in the organization:");
        employees.stream().map(Employee::getDepartment)
                .distinct().forEach(System.out::println);

        //6.3 What is the average age of male and female employees'
        double avgMaleAge = employees.stream()
                .filter(e -> e.getGender().equals("Male"))
                .mapToInt(Employee::getAge).average().orElse(0);
        double avgFemaleAge = employees.stream()
                .filter(e -> e.getGender().equals("Female"))
                .mapToInt(Employee::getAge).average().orElse(0);
        System.out.println("\nAverage age of male employees: " + avgMaleAge);
        System.out.println("Average age of female employees: " + avgFemaleAge);

        // 6.4 Get the details of highest paid employee in the organization
        Employee highestSalary=employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
        System.out.println("HIGHEST SALARY IS "+highestSalary);
        System.out.println(" ");

        // 6.5 Count the number of employees in each department
        System.out.println("\nNumber of employees in each department:");
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((dept, count) -> System.out.println(dept + ": " + count));

        // 6.6 Separate employees who are younger or equal to 25 years from those older than 25 years
        System.out.println("\nEmployees younger or equal to 25 years:");
        employees.stream().filter(e -> e.getAge() <= 25).forEach(System.out::println);

        System.out.println("\nEmployees older than 25 years:");
        employees.stream().filter(e -> e.getAge() > 25).forEach(System.out::println);



    }
}




