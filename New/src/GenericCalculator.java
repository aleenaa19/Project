/*Create a generic calculator class in which we can use
any numerical data type values as parameter
 */

 class Operations<T extends Number> {
    public T add(T num1, T num2) {
        return (T) addNumbers(num1, num2);
    }

    public T sub(T num1, T num2) {
        return (T) subNumbers(num1, num2);
    }

    public T mul(T num1, T num2) {
        return (T) mulNumbers(num1, num2);
    }

    public T div(T num1, T num2) {
        return (T) divNumbers(num1, num2);
    }

     Number addNumbers(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

     Number subNumbers(Number num1, Number num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

     Number mulNumbers(Number num1, Number num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

     Number divNumbers(Number num1, Number num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}

public class GenericCalculator {
    public static void main(String[] args) {
        Operations<Double> doubleCalculator = new Operations<>();
        System.out.println("Double Addition: " + doubleCalculator.add(5.0, 2.5));
        System.out.println("Double Subtraction: " + doubleCalculator.sub(5.0, 2.5));
        System.out.println("Double Multiplication: " + doubleCalculator.mul(5.0, 2.5));
        System.out.println("Double Division: " + doubleCalculator.div(5.0, 2.5));


    }

}
