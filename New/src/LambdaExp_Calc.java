//Create calculator using lambda expressiom

import java.util.Scanner;

@FunctionalInterface
interface Operation
{
    double operation(double n1,double n2);
}

public class LambdaExp_Calc {
    public static void main(String[] args) {
        Operation add = (n1, n2) -> {
            return n1 + n2;
        };
        Operation sub = (n1, n2) -> {
            return n1 - n2;
        };
        Operation mul = (n1, n2) -> {
            return n1 * n2;
        };
        Operation div = (n1, n2) ->{
                if(n2 != 0) {
                  return n1 / n2;
                }
                else {
                    throw new ArithmeticException("Cannot Divide");
                }
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.print("Enter 1st number:");
        double n1=sc.nextDouble();
        System.out.print("Enter 2nd number:");
        double n2=sc.nextDouble();
        System.out.print("Choose an operation\n");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        System.out.print("Enter an option:");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.print("Result:" +add.operation(n1,n2));
                break;
            case 2:
                System.out.print("Result:" +sub.operation(n1,n2));
                break;
            case 3:
                System.out.print("Result:" +mul.operation(n1,n2));
                break;
            case 4:
                System.out.print("Result:" +div.operation(n1,n2));
                break;
            case 5:
                break;
            default:
                System.out.print("Invalid choice");
                break;

        }

    }

}
