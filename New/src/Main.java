/*Take as input employee name and annual salary of a particular employee.
Based on the annual salary find the tax rate and calculate the tax amount.
Employees having annualSalary <= 250000  taxRate = 0.0
annualSalary <= 500000 taxRate  5% tax
annualSalary <= 1000000 taxRate   20% tax
        for others taxRate  30% tax  */

import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        float tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter annual salary: ");
        float ann_sal=sc.nextFloat();
        if(ann_sal<=250000){
            tax=0.0f;}
        else if(ann_sal<=500000) {
            tax = 5 / 100f;
        }
        else if(ann_sal<=1000000) {
            tax = 20 / 100f;
        }
        else
        {
            tax = 30 / 100f;
        }
        System.out.println("Tax Rate:" +tax);
        float tax_amnt=ann_sal*tax;
        System.out.println("Tax Amount:" +tax_amnt);
    }
}