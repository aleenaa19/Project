import java.util.*;


public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter number of employees:");
        int n = sc.nextInt();*/
        String[] employee = new String[100];
        double[] salary = new double[100];
        int i;
        for ( i = 0; i < 3; i++) {
            try {
                System.out.print("Enter name of employee" +(i+1)+ ":");
                String name = sc.nextLine();
                //sc.nextLine();

                if (name==null || name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be null or empty");
                }
                System.out.print("Enter salary of employee" +(i+1)+ ":");
                String emp_sal = sc.nextLine();
                double sal=Double.parseDouble(emp_sal);
                if (sal < 0) {
                    throw new NumberFormatException("Salary cannot be negative");
                }
                employee[i]=name;

                salary[i]=sal;

            }
            catch (NumberFormatException e) {

                System.out.println("Error:" + e);

            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Error:" + e);

            }
        }
        System.out.println("\nSalary details");
        for(i=0;i<3;i++)
        {
            System.out.println(employee[i] +" got salary " +salary[i]);

        }
    }
}

