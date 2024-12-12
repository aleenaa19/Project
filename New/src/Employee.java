/* Define an Employee class with id,name,and Department as a static class
with department name inside it.
Also non static class Address with properties like street,house number etc.
Create object of Employee and define  methods to display all details
 of employee*/

 public class Employee {
     int id;
     String name;
     Department department;
     Address address;

     static class Department {
         static String deptName;

         public Department(String departmentName) {
             this.deptName = departmentName;
         }

         public String getDepartmentName() {
             return deptName;
         }
     }

     class Address {
         String street;
         int houseNo;
         String city;

         public Address(String street, int houseNo, String city) {
             this.street = street;
             this.houseNo = houseNo;
             this.city = city;
         }

         public void displayAddress() {
             System.out.println("Address: " + street + " " + houseNo + ", " + city);
         }

     }

     public Employee(int id, String name, String deptName, String street, int houseNo, String city) {
         this.id = id;
         this.name = name;
         this.department = new Department(deptName);
         this.address = new Address(street, houseNo, city);

     }

     public void displayDetails() {
         System.out.println("Empolyee id:" + id);
         System.out.println("Empolyee name:" + name);
         System.out.println("Department: " + department.getDepartmentName());
         address.displayAddress();
     }
 }
   /*  public static void main(String[] args)
     {
         Employee emp=new Employee(1,"John","IT",
                 "Main St", 101, "New York");

         emp.displayDetails();
     }*/

class EmployeeInfo
{
    public static void main(String[] args){
        Employee emp=new Employee(1,"John","IT",
                "Main St", 101, "New York");
        //creating object of Department class

        Employee.Department nestedObject = new Employee.Department("IT");
        emp.displayDetails();

        // Creating object of address inner class

        Employee.Address addressObj = emp.new Address("Main St", 101, "New York");
        emp.displayDetails();

    }
}




