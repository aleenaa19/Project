import java.util.Scanner;

public class LambdaExp_Calc {

        interface Operation{
            double operation(double n1,double n2);
        }
        public static void main(String[]args){
            Operation add = (n1, n2) -> n1+n2;
            Operation subtract = (n1, n2) -> n1-n2;
            Operation multiply = (n1, n2) -> n1 * n2;
            Operation divide = (n1, n2) -> {
                if (n2 != 0)
                {
                    return n1 / n2;
                }
                else {
                    throw new ArithmeticException("Cannot divide by zero");
                }

            };
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the first number:");
            double n1=sc.nextDouble();
            System.out.print("Enter the second number:");
            double n2=sc.nextDouble();
            System.out.println("Choose an operation\n");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLY");
            System.out.println("4.DIVIDE");
            System.out.print("Enter an option:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:

                    System.out.println("RESULT:"+add.operation(n1,n2));
                    break;

                case 2:{
                    System.out.println("RESULT:"+ subtract.operation(n1,n2));
                    break;
                }
                case 3:{
                    System.out.println("RESULT:"+ multiply.operation(n1,n2));
                    break;
                }
                case 4: {
                    System.out.println("RESULT:"+ divide.operation(n1,n2));
                    break;
                }
                default:
                    System.out.println("invalid choice");

            }
        }
    }

