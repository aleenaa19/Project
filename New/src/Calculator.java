/*Create a calculator by defining enum for each operator
 with  implementation of operation
Accept numbers and operator as user input and perform the operation*/

import java.util.Scanner;
public class Calculator {
    enum operator{
        ADD("+"),
        SUB("-"),
        MULTIPLY("*"),
        DIVIDE("/");

        private String symbol;
        operator(String symbol) {
            this.symbol = symbol;
        }
        public String getSymbol()
        {
            return symbol;
        }

    }
    public static  double operation(double num1,double num2, operator op)
    {
        double num3;
        switch(op)
        {
            case ADD:
                  num3=num1+num2;
                 return num3;

            case SUB:
                num3=num1-num2;
                return num3;


            case MULTIPLY:
                num3=num1*num2;
                return num3;

            case DIVIDE:
                if(num2!=0)
                {
                    num3=num1/num2;
                    return num3;

                    //break;

                }
                else {
                    throw new ArithmeticException("Divide by zero");
                }
            default:
                System.out.println("Invalid operator");
                return 0;

        }
    }
    ;



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.print("Enter first number:");
        double num1=sc.nextDouble();
        System.out.print("Enter second number:");

        double num2=sc.nextDouble();
        System.out.print("Enter operator:");
        operator op=operator.valueOf(sc.next());
        double result=operation(num1,num2,op);
        System.out.println(num1+" "+op.getSymbol()+"=" +result);

    }
}
