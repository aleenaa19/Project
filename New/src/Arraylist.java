import java.util.*;


 class Employee
{
    int id;
    String name;
    double salary;
    public Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name= name;

    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
        //System.out.println("\n");
    }
}


public class Arraylist {

    static Scanner sc=new Scanner(System.in);
    static ArrayList<Employee> employee=new ArrayList<>();

    public static void addEmployee()
    {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee newEmployee = new Employee(id, name, salary);
        employee.add(newEmployee);
        System.out.println("Employee added successfully!\n");
    }
    public static void displayDetails()
    {
        if(employee.isEmpty())
        {
            System.out.println("No employees to display\n");
        }
        else {
            for(Employee emp:employee)
            {
                emp.display();
            }
        }
    }
    public static void updateDetails()
    {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter updated Employee name: ");
        String emp_name = sc.nextLine();
        System.out.print("Enter updated Employee salary: ");
        double sal = sc.nextDouble();

        for (Employee emp : employee) {
            if (emp.getId() == id) {
                emp.setName(emp_name);
                emp.setSalary(sal);
                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee not found for update.");
    }

    public static void delete()
    {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        Iterator<Employee> iterator = employee.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId() == id) {
                iterator.remove();
                System.out.println("Employee deleted.\n");
                return;
            }
        }
        System.out.println("Employee not found for deletion.");
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to Employee Management System");
            System.out.println("1.Add Employee Details");
            System.out.println("2.Display Employee Details");
            System.out.println("3.Update Employee Details");
            System.out.println("4.Delete Employee Details");
            System.out.println("5.Exit");
            
            System.out.print("Enter choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayDetails();
                    break;

                case 3:
                    updateDetails();
                    break;

                case 4:
                    delete();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}
